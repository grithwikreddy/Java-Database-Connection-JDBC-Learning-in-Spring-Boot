package com.crud.JDBCLearning.Repository;

import com.crud.JDBCLearning.Entity.Employee;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class EmployeeDAO {
    private final JdbcTemplate jdbcTemplate;

    public EmployeeDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void insertEmployee(Employee employee) {
        String sql = "INSERT INTO employees (id, name, department) VALUES (?, ?, ?)";
         jdbcTemplate.update(sql, employee.getId(), employee.getName(), employee.getDepartment());
    }

    public List<Employee> getAllEmployees() {
        String sql = "SELECT * FROM employees";
        return jdbcTemplate.query(sql, employeeRowMapper);
    }

    public Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM employees WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, employeeRowMapper, id);
    }

    public void updateEmployee(int id,String name,String department) {
        String sql = "UPDATE employees SET name = ?, department = ? WHERE id = ?";
         jdbcTemplate.update(sql, name, department, id);
    }

    public void deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";
         jdbcTemplate.update(sql, id);
    }

    public boolean existsById(int id) {
        String sql = "SELECT COUNT(*) FROM employees WHERE id = ?";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class, id);
        if(count==null){
            System.out.println("null here");
        }
        else{
            System.out.println(count);
        }
        return count != null && count > 0;
    }
    private final RowMapper<Employee> employeeRowMapper = (rs, rowNum) ->
            new Employee(rs.getInt("id"), rs.getString("name"), rs.getString("department"));
}

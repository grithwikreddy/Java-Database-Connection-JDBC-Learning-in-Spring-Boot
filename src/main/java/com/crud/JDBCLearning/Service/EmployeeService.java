package com.crud.JDBCLearning.Service;

import com.crud.JDBCLearning.Repository.EmployeeDAO;
import com.crud.JDBCLearning.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }
    public String addEmployee(Employee employee) {
        if(employeeDAO.existsById(employee.getId())){
            System.out.println(employee.getId());
            return "An employee already registered with this ID";
        }
        employeeDAO.insertEmployee(employee);
        return "Employee added successfully!";
    }

    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }

    public Employee getEmployeeById(int id) {
        return employeeDAO.getEmployeeById(id);
    }
    public boolean employeeExits(int id){
        return employeeDAO.existsById(id);
    }
    public String updateEmployee(int id,String name,String department) {
        if(!employeeDAO.existsById(id)){
            return "Employee not found with this ID";
        }
        employeeDAO.updateEmployee(id,name,department);
        return "Employee updated successfully!";
    }

    public String deleteEmployee(int id) {
        if(!employeeDAO.existsById(id)){
            return "Employee not found with this ID";
        }
        employeeDAO.deleteEmployee(id);
        return "Employee deleted successfully!";
    }
}

package com.crud.JDBCLearning;

//import com.crud.JDBCLearning.Service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:application.yml")
public class JdbcLearningApplication //implements CommandLineRunner
{
	public static void main(String[] args) {
		SpringApplication.run(JdbcLearningApplication.class, args);
	}

}

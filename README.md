# CRUD Application with Spring Boot and JDBC Template

## Overview
This project is a Spring Boot-based RESTful API that performs CRUD (Create, Read, Update, Delete) operations using JDBC Template for database access. The application allows managing employee records in a relational database, ensuring efficient data persistence and retrieval.

## Features
- **RESTful API** for managing employee records.
- **Spring Boot & JDBC Template** for efficient database access.
- **Relational Database Support** using JDBC Template.
- **CRUD operations**: Insert, Read, Update, Delete employee records.

## Tech Stack
- **Backend**: Spring Boot
- **Database**: JDBC Template (connected to a relational database like MySQL)
- **Tools**: Spring JDBC, REST API

## Installation & Setup
### Prerequisites
Ensure you have the following installed:
- Java 17+
- A relational database (MySQL)
- Maven
- Postman

### Steps to Run the Project
1. **Clone the Repository**
   ```sh
   git clone https://github.com/grithwikreddy/Java-Database-Connection-JDBC-Learning-in-Spring-Boot.git
   cd Java-Database-Connection-JDBC-Learning-in-Spring-Boot
   ```

2. **Configure Database**
   Update the `application.yml` file with your database credentials:
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/your_database
       username: your_username
       password: your_password
     jpa:
       hibernate:
         ddl-auto: update
   ```

3. **Build and Run the Application**
   ```sh
   mvn clean install
   mvn spring-boot:run
   ```

## API Endpoints
| Method | Endpoint            | Description                     |
|--------|--------------------|---------------------------------|
| POST   | /employees/insert  | Insert a new employee record   |
| GET    | /employees/read    | Fetch all employee records     |
| GET    | /employees/read/{id} | Fetch employee by ID         |
| PUT    | /employees/update/{id} | Update an employee record   |
| DELETE | /employees/delete/{id} | Delete an employee record   |

## Database Integration
- JDBC Template is used for database access, ensuring fast and efficient SQL execution.
- Employee records are stored and retrieved using JDBC Template.
- The application connects to a relational database (MySQL).
- Database configuration is handled through `application.yml`.




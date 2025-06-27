# Employee Management System 🚀

A simple Spring Boot backend application for managing employee details using RESTful APIs.

## 💡 Features

- Add, view, update, and delete employee records (CRUD operations)
- RESTful APIs built with Spring Boot
- Integrated with MySQL (or H2) database
- Clean architecture using Controller, Service, and Repository layers
- Tested using Postman

## 🔧 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **MySQL / H2**
- **Postman**
- **STS (Spring Tool Suite)**

## 📁 Project Structure

```plaintext
com.anu
├── controller          // REST API controllers
├── service             // Business logic layer
├── dao (or repository) // Data access layer using Spring Data JPA
├── modal (or entity)   // Employee model/entity class

📬 How to Run
1 Clone the repo
git clone https://github.com/AnushaKasavu/employee-management-system.git
2 Open in STS (Spring Tool Suite) or IntelliJ

3 Run the main class:
EmployeeManagementSystemApplication.java

4 Use Postman to hit these endpoints:

 > POST /employees – Add employee

 > /employees – Get all employees

 > GET /employees/{id} – Get employee by ID

 > PUT /employees/{id} – Update employee

 > DELETE /employees/{id} – Delete employee

👩‍💻 Author
Anusha Kasavu
LinkedIn
📧 kasavuanusha@gmail.com




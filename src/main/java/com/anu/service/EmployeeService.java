package com.anu.service;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.anu.modal.Employee;

public interface EmployeeService {
public String addEmployee(Employee employee);
public Employee getEmployeeById(Integer employeeId);
public List<Employee> getEmployeesData();// to store all employee data
public void deleteEmployeeById(Integer employeeId);
public String updateEmployeeData(Employee employee, Integer employeeId);
public String saveEmployee(Employee employee);
}

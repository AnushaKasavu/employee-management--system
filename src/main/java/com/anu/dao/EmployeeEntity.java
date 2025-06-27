package com.anu.dao;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="EMPLOYEE_DATA")
@Data
public class EmployeeEntity {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="ID")
private Integer EmployeeId;

@Column(name="NAME")
private String EmployeeName;

@Column(name="ADDRESS")
private String EmployeeAddress;

@Column(name="SALARY")
private Double EmployeeSalary;

@Column(name="ORGANIZATION")
private String EmployeeOrganization;

@Column(name="CELL")
private Long EmployeeContact;

}

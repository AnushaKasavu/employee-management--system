package com.anu.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.anu.dao.EmployeeEntity;
import com.anu.dao.EmployeeRepo;
import com.anu.modal.Employee;
@Service
public class EmployeeServiceImp implements EmployeeService{
    
	private EmployeeRepo employeeRepo;
	@Autowired
	
	public EmployeeServiceImp(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public String addEmployee(Employee employee) {
		EmployeeEntity entity= new EmployeeEntity();
		BeanUtils.copyProperties(employee, entity);// is used to copy data from one object to other object
		EmployeeEntity result = employeeRepo.save(entity);
		if(result!=null) {
			return "DataSaved Successfully";
		}
		return null;
	}

	@Override
	public Employee getEmployeeById(Integer employeeId) {
		Optional<EmployeeEntity> optional = employeeRepo.findById(employeeId);
		Employee emp=null;
		if(optional.isPresent()) {
			EmployeeEntity employeeEntity=optional.get();
			 emp=new Employee();
			BeanUtils.copyProperties(employeeEntity, emp);
		}
		return emp;
		
	}

	@Override
	public List<Employee> getEmployeesData() {
		Iterable<EmployeeEntity> ListOfEntities = employeeRepo.findAll();
		//Employee emp=new Employee();
		List<Employee> listOfEmployee=new ArrayList();
		for(EmployeeEntity entity:ListOfEntities) {
			Employee emp=new Employee();
			BeanUtils.copyProperties(entity, emp);
			listOfEmployee.add(emp);
		}
		return listOfEmployee;
	}

	@Override
	public void deleteEmployeeById(Integer employeeId) {

		Optional<EmployeeEntity> optional = employeeRepo.findById(employeeId);
		if(optional.isPresent()) {
			employeeRepo.deleteById(employeeId);
			
		}
		
	}
	
	

	@Override
	public String updateEmployeeData(Employee employee,Integer employeeId) {
		Optional<EmployeeEntity> optional = employeeRepo.findById(employeeId);
		if(optional.isPresent()) {
			EmployeeEntity employeeEntity=optional.get();
			if(employee.getEmployeeName()!=null && !(employee.getEmployeeName().isEmpty()))
			{
			employeeEntity.setEmployeeName(employee.getEmployeeName());
			}
			if(employee.getEmployeeOrganization()!=null && !(employee.getEmployeeOrganization().isEmpty())) {
			employeeEntity.setEmployeeOrganization(employee.getEmployeeOrganization());
			
			
		}
			if(employee.getEmployeeAddress()!=null && !(employee.getEmployeeAddress().isEmpty())) {
				employeeEntity.setEmployeeAddress(employee.getEmployeeAddress());
			}
		if(employee.getEmployeeContact()!=null ) {
			employeeEntity.setEmployeeContact(employee.getEmployeeContact());
		}
		if(employee.getEmployeeSalary()!=null) {
			employeeEntity.setEmployeeSalary(employee.getEmployeeSalary());
			
		}
		employeeRepo.save(employeeEntity);
	}
		return "updated successfully";
	}

	@Override
	public String saveEmployee(Employee employee) {
		 EmployeeEntity employeeEntity = new EmployeeEntity();
	        BeanUtils.copyProperties(employee, employeeEntity);
	        employeeRepo.save(employeeEntity);
	        return "Employee saved Successfully";
	}
}

package com.anu.dao;
import org.springframework.data.repository.CrudRepository;
import com.anu.dao.EmployeeEntity;
public interface EmployeeRepo extends CrudRepository<EmployeeEntity,Integer> {

	}


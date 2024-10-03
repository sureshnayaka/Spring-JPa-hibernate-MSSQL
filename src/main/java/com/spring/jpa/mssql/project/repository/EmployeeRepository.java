package com.spring.jpa.mssql.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.mssql.project.model.EmployeeModel;


@Repository
public interface EmployeeRepository extends  JpaRepository<EmployeeModel, Integer> {
	
	EmployeeModel findById(int id);


}

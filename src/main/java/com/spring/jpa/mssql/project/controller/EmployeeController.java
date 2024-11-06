package com.spring.jpa.mssql.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.mssql.project.model.EmployeeModel;
import com.spring.jpa.mssql.project.repository.EmployeeRepository;

@RequestMapping("/api/fefa/employee")
@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repposritoy;

	@GetMapping("/all")
	List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel> employee = repposritoy.findAll();
		// employee.stream().filter()
		return repposritoy.findAll();

	}

	@PostMapping("/save")
	List<EmployeeModel> saveEmployee(@RequestBody EmployeeModel employeeModel) {
		repposritoy.save(employeeModel);
		return repposritoy.findAll();
	}

	@DeleteMapping("/{id}")
	List<EmployeeModel> deleteEmployee(@PathVariable int id) {
		repposritoy.deleteById(id);
		return repposritoy.findAll();
	}

	@GetMapping("/{id}")
	EmployeeModel findEmployee(@PathVariable int id) {
		return repposritoy.findById(id);
	}

}

package edu.project.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.project.assignment.modal.Employee;
import edu.project.assignment.services.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "EmployeeController", description = "REST Apis related to Employee Entity")
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@ApiOperation(value = "Get list of Employees in the System ", response = Iterable.class, tags = "getEmployees")
	@GetMapping("/getemployees")
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@ApiOperation(value = "Register employee into system",  tags = "registerEmployee")
	@PutMapping
	public void registerEmployee(Employee employee) {
		service.saveEmployee(employee);
	}

}

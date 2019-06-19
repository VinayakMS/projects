package edu.project.assignment.services;

import java.util.List;

import edu.project.assignment.modal.Employee;


public interface EmployeeService {
	
	List<Employee>getAllEmployees();
	void saveEmployee(Employee employee);

}

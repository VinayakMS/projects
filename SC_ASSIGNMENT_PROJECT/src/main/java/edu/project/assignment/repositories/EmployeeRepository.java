package edu.project.assignment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.project.assignment.modal.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

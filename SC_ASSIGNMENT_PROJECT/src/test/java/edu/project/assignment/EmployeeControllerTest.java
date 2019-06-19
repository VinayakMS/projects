package edu.project.assignment;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import edu.project.assignment.controller.EmployeeController;
import edu.project.assignment.modal.Employee;
import edu.project.assignment.services.EmployeeServiceImpl;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeController.class, secure = false)
public class EmployeeControllerTest {
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeServiceImpl service;
	List<Employee> mockList = new ArrayList<>();
	@Test
	public void retrieveDetailsForCourse() throws Exception {
		Mockito.when(
				service.getAllEmployees()).thenReturn(mockList);
}

}

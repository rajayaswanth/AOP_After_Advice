package com.aop.after_advice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.aop.after_advice.model.Employee;
import com.aop.after_advice.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value = "/add/employee", method = RequestMethod.GET)  
	public Employee addEmployee(@RequestParam("empId") String empId, @RequestParam("firstName") String firstName, @RequestParam("secondName") String secondName)   
	{  
		return employeeService.createEmployee(empId, firstName, secondName);  
	}  

}

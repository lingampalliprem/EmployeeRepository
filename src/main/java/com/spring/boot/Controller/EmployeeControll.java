package com.spring.boot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Service.Employeeservice;

@RestController
@RequestMapping("/emp")
public class EmployeeControll {
	@Autowired
	Employeeservice employeeservice;
	

}

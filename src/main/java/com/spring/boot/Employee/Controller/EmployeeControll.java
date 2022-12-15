package com.spring.boot.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.Employee.Model.Employee_Entity;
import com.spring.boot.Employee.Service.Employeeservice;

@RestController
@RequestMapping("/")
public class EmployeeControll {
	@Autowired
	Employeeservice employeeservice;
	
	@GetMapping("/hello")
	public String HelloEmployees()
	{
	        return "Hello Employees";
	}
	@RequestMapping(value = "/saveEmp", method = RequestMethod.POST)
	public ResponseEntity<Employee_Entity> saveEmployee(@RequestBody Employee_Entity employee) {
		employeeservice.saveEmployee(employee);
		ResponseEntity<Employee_Entity> rs = new ResponseEntity<Employee_Entity>(employee, HttpStatus.OK);
		return rs;
}
	@RequestMapping(value = "/updateEmp", method = RequestMethod.PUT)
	public ResponseEntity<Employee_Entity> upadteEmployee(@RequestBody Employee_Entity employee) {

		employeeservice.saveEmployee(employee);

		ResponseEntity<Employee_Entity> rs = new ResponseEntity<Employee_Entity>(employee, HttpStatus.OK);
		return rs;
	}
      @RequestMapping(value = "/getAllempEmployees", method = RequestMethod.GET)
     public ResponseEntity<List<Employee_Entity>> getAllempEmployees() {
	    List<Employee_Entity> emplist = employeeservice.getAllEmps();
	  emplist.stream().forEach(System.out::println);
	  return new ResponseEntity<List<Employee_Entity>>(emplist, HttpStatus.OK);
}
      @RequestMapping(value = "/findBynameLike", method = RequestMethod.GET)
     	public ResponseEntity<java.util.List<Employee_Entity>> findBynameLike(String name) {
  		java.util.List<Employee_Entity> emplist = employeeservice.findBynameLike(name);
  		return new ResponseEntity<java.util.List<Employee_Entity>>(emplist,HttpStatus.OK);
}

   @GetMapping("/search")
   public ResponseEntity <List<Employee_Entity>> serchingEmployeeData(@RequestParam String query) {
	List<Employee_Entity> emplist=employeeservice.serchingEmployeeData(query);  
	return new ResponseEntity<>(emplist,HttpStatus.OK);
}
}


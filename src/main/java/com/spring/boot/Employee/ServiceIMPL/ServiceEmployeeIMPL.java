package com.spring.boot.Employee.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.Employee.Model.Employee_Entity;
import com.spring.boot.Employee.Repository.EmployeeRepository;
import com.spring.boot.Employee.Service.Employeeservice;
@Service
public class ServiceEmployeeIMPL implements Employeeservice{
@Autowired
EmployeeRepository employeerepository;

@Override
public void saveEmployee(Employee_Entity employee) {
	String name=employee.getName();
	Employee_Entity emprespo=employeerepository.save(employee);
	
}

@Override
public List<Employee_Entity> getAllEmps() {
	return employeerepository.findAll();
}

@Override
public List<Employee_Entity> findBynameLike(String name) {
	return employeerepository.findBynameLike(name);
}

@Override
public List<Employee_Entity> serchingEmployeeData(String query) {
	return employeerepository.serchingEmployeeData(query);
}

}

package com.spring.boot.Employee.Service;

import java.util.List;

import com.spring.boot.Employee.Model.Employee_Entity;

public interface Employeeservice {

public	void saveEmployee(Employee_Entity employee);

public List<Employee_Entity> getAllEmps();

public List<Employee_Entity> findBynameLike(String fname);

public List<Employee_Entity> serchingEmployeeData(String query);

}

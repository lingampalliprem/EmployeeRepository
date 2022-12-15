package com.spring.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.Model.Employee_Entity;

public interface EmployeeRepository extends JpaRepository<Employee_Entity, Integer>{

}

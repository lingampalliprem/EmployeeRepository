package com.spring.boot.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.boot.Repository.EmployeeRepository;
import com.spring.boot.Service.Employeeservice;

public class ServiceEmployeeIMPL implements Employeeservice{
@Autowired
EmployeeRepository employeerepository;
}

package com.spring.boot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="employee")
@Setter
@Getter

public class Employee_Entity {
@Id
@GeneratedValue
private Long id;
private String name;
private int age;
private String adress;
private String area_name;
private String flat_num;
private int pincode;

}

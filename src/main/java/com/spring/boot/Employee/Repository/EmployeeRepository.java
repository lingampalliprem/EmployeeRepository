package com.spring.boot.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.boot.Employee.Model.Employee_Entity;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee_Entity, Integer>{
List<Employee_Entity> findBynameLike(String name);
@Query("SELECT e FROM Employee_Entity e WHERE e.name LIKE CONCAT('%',:query,'%')"+
        "or e.age LIKE CONCAT('%',:query,'%')"+
        "or e.adress LIKE CONCAT('%',:query,'%')"+
        "or e.area_name LIKE CONCAT('%',:query,'%')"+
        "or e.flat_num LIKE CONCAT('%',:query,'%')"+
        "or e.pincode LIKE CONCAT('%',:query,'%')")
 List<Employee_Entity> serchingEmployeeData(@Param("query") String query);
}

package com.cetpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cetpa.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	@Query("from Employee emp where emp.department.name=:arg")
	List<Employee> getEmployeeListByDeptName(@Param("arg")String name);
}

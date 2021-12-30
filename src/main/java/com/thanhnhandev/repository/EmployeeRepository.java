package com.thanhnhandev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thanhnhandev.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

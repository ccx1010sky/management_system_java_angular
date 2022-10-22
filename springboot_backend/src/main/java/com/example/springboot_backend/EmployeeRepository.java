package com.example.springboot_backend;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee, Long>{

}
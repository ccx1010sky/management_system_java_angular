package com.example.springboot_backend.controller;

import java.util.List;

import com.example.springboot_backend.repository.EmployeeRepository;
import com.example.springboot_backend.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//RestController is middle layer between JPA and MySQL
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    //    dependency injection
    @Autowired
    private EmployeeRepository employeeRepository;

    // get all employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
        //http://localhost:8080/api/v1/employees
    }

}


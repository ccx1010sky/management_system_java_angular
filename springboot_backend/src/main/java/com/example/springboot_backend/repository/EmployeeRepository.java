package com.example.springboot_backend.repository;

import com.example.springboot_backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//创建一个接口EmployeeRepository 继承 总接口JpaRepository
//public interface FirstRepository extends JpaRepository<EntityName,DataType_of_primaryKey> { }

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
package com.cjc.main.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjc.main.model.Employee;

public interface EmpRepository extends CrudRepository<Employee, Integer>{

}

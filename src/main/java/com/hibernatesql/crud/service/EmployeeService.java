package com.hibernatesql.crud.service;

import java.util.List;

import com.hibernatesql.crud.model.Employee;

public interface EmployeeService {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete (int id);

}

package com.hibernatesql.crud.dao;

import java.util.List;

import com.hibernatesql.crud.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> get();
	
	Employee get(int id);
	
	void save(Employee employee);
	
	void delete (int id);

}

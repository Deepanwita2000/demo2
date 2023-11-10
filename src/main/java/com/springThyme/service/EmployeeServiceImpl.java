package com.springThyme.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springThyme.model.Employee;
import com.springThyme.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getAllEmployees()
	{
		return empRepository.findAll();
	}

	/*@Override
	public void saveEmployee(Employee employee) {
		this.empRepository.save(employee);
		
	}*/
	
}

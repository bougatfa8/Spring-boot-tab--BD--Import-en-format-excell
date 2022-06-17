package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeServiceImpl implements employeeService {

	@Autowired
	private EmployeeRepository employeeR;

	@Override
	public employee save(employee employee) {
		// TODO Auto-generated method stub
		return employeeR.save(employee);
	}

	@Override
	public Optional<employee> searchById(Long id) {
		// TODO Auto-generated method stub
		return employeeR.findById(id);
	}

	@Override
	public List<employee> findAllUser() {
		// TODO Auto-generated method stub
		return employeeR.findAll();
	}


}




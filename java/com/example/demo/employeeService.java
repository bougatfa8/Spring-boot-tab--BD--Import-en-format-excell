package com.example.demo;

import java.util.List;
import java.util.Optional;



public interface employeeService {
	public employee save(employee employee);
	Optional <employee> searchById(Long id);
	public List<employee> findAllUser();


}

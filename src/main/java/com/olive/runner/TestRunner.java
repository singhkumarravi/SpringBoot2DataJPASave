package com.olive.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.olive.model.Employee;
import com.olive.repo.EmployeeRepositiory;
@Component
public class TestRunner implements CommandLineRunner {
	@Autowired
	private EmployeeRepositiory repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		repo.save(new Employee(101, "Ram", 18886, "Hittapur"));
		repo.save(new Employee(102, "Ramvvvvv", 18886, "Hittapur"));
		repo.save(new Employee(103, "Ramxxxxx", 18886, "Hittapur"));
		Optional<Employee> findById = repo.findById(101);
		System.out.println("Record::: " + findById);
         List<Employee> list = repo.findAll();
         list.forEach(System.out::println);
	}

}

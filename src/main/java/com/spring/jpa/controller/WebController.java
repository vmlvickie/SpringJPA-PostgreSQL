package com.spring.jpa.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.jpa.model.Customer;
import com.spring.jpa.repo.CustomerRepository;

@RestController
public class WebController {
	
	@Autowired
	CustomerRepository repository;
	
	@GetMapping("/save")
	public String process() {
		//save a SINGLE cUSTOMER
		repository.save(new Customer("Victor", "Lijoodi"));
		
		// save a list of Customers
		repository.saveAll(Arrays.asList(new Customer("Adam", "Johnson"), new Customer("Kim", "Smith"),
										new Customer("David", "Williams"), new Customer("Peter", "Davis")));
		return "Done";
	}
	
	@GetMapping("/findall")
	public String findAll() {
		String result = "";
		
		for(Customer cust : repository.findAll()) {
			result += cust.toString() + "<br>";
		}
		
		return result;
	}
	

	@GetMapping("/findbyid")
	public String findById(@RequestParam("id") long id){
		String result = "";
		result = repository.findById(id).toString();
		return result;
	}

	@GetMapping("/findbylastname")
	public String fetchDataByLastName(@RequestParam("lastname") String lastName) {
		String result = "";
		
		for(Customer cust: repository.findByLastName(lastName)){
			result += cust.toString() + "<br>"; 
		}
		
		return result;
	}
}

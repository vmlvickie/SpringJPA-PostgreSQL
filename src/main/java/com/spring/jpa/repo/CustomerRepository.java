package com.spring.jpa.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.jpa.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastName);

}

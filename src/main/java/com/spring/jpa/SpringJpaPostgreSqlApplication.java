package com.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.jpa.repo.CustomerRepository;

@SpringBootApplication
public class SpringJpaPostgreSqlApplication implements CommandLineRunner{

	@Autowired
	CustomerRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaPostgreSqlApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// clear all record if existed before do the tutorial with new data 
		repository.deleteAll();
		
	}
}

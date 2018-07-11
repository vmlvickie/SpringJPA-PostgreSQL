package com.spring.jpa.model;

import javax.persistence.*;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table*/;

@Entity
@Table(name = "customer")
public class Customer {

	private static final long serialVersionUID = -3009157732242241606L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	protected Customer() {}
	
	public Customer(String fname, String lname) {
		this.firstName = fname;
		this.lastName = lname;
	}
	
	public String toString() {
		return String.format("Customer[id=%d, firstName='%s', lastName='%s']", id, firstName, lastName);
	}
	
}

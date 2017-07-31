package com.mantravat.myref.jpa.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity

public class Customer implements Serializable {

	
	private String name;
	@Id
	private long id;
	private int age;
	private boolean married;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}   
	public boolean getMarried() {
		return this.married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}
   
}

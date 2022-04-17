package com.te.mapping1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Trainee1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private double salary;
	private String designation;
//	@OneToOne
	@OneToOne(cascade = CascadeType.ALL)
	private Laptop1 laptop;

	public Trainee1() {
		super();

	}

	public Trainee1(int id, String name, double salary, String designation, Laptop1 laptop) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.laptop = laptop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Laptop1 getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop1 laptop) {
		this.laptop = laptop;
	}

}

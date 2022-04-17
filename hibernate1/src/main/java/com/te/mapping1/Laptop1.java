package com.te.mapping1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop1 {
	@Id
	private int id;
	private String brand;
	private String rom;
	private String battery;
	@OneToOne(mappedBy = "laptop")
	private Trainee1 trainee;

	public Laptop1(int id, String brand, String rom, String battery) {
		super();
		this.id = id;
		this.brand = brand;
		this.rom = rom;
		this.battery = battery;

	}

	public Laptop1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getRom() {
		return rom;
	}

	public Trainee1 getTrainee() {
		return trainee;
	}

	public void setTrainee(Trainee1 trainee) {
		this.trainee = trainee;
	}

	public void setRom(String rom) {
		this.rom = rom;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

}

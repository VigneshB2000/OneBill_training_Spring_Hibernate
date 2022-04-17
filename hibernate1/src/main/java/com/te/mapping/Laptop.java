package com.te.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int id;
	private String brand;
	private String rom;
	private String battery;

	public Laptop(int id, String brand, String rom, String battery) {
		super();
		this.id = id;
		this.brand = brand;
		this.rom = rom;
		this.battery = battery;
	}

	public Laptop() {
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

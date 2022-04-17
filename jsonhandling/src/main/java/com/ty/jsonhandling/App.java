package com.ty.jsonhandling;

import java.io.FileWriter;
import java.io.IOException;


import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Tony stark");
		employee.setDesignation("Genius, Billionaire, Playboy, Philianthrophist");
		employee.setSalary(999999999);
		Address address = new Address();
		address.setDoorNo("56y");
		address.setLocality("Stark tower");
		address.setArea("NY");
		address.setCountry("USA");
		employee.setAddress(address);

		ObjectMapper objectMapper = new ObjectMapper();
		String writeValueAsString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
		System.out.println(writeValueAsString);
		
		objectMapper.writerWithDefaultPrettyPrinter().writeValue(new FileWriter("emp.json"), employee);
	}
}

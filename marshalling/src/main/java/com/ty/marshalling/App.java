package com.ty.marshalling;

import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class App {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("mama");
		employee.setSalary(200000);
		employee.setDesignation("Mother's Brother");
		employee.setPassword("12234567890");
		Address address = new Address();
		address.setDoorNo("123");
		address.setArea("BTM layout");
		address.setLocality("JP Nagar");
		address.setCountry("India");
		address.setPincode(642003);
		employee.setAddress(address);

		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = context.createMarshaller();
			FileWriter fileWriter = new FileWriter("src/main/java/emp.xml");
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(employee, System.out);
			marshaller.marshal(employee, fileWriter);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

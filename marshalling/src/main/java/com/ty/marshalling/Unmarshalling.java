package com.ty.marshalling;

import java.io.FileReader;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Unmarshalling {

	public static void main(String[] args) throws IOException {
		try {
			JAXBContext context = JAXBContext.newInstance(Employee.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			FileReader fileReader = new FileReader("src/main/java/emp.xml");
			Object object = unmarshaller.unmarshal(fileReader);
			System.out.println(object);
			Employee e = (Employee) object;
			System.out.println(e);
			System.out.println(e.getDesignation());
		} catch (JAXBException e) {
			e.printStackTrace();
		}

	}

}

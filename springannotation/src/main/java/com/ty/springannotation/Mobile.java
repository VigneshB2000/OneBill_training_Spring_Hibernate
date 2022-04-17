package com.ty.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class Mobile {

	@Value(value = "AAA")
	String name;
	@Value(value = "Apple")
	String brand;
	@Value(value = "50000")
	double price;
	@Autowired
	Sim sim;

}

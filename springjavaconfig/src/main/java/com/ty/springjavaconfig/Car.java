package com.ty.springjavaconfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//import lombok.AllArgsConstructor;
import lombok.Data;
//import lombok.NoArgsConstructor;

@Data
@Component
public class Car {
	
	private int price;
	private String brand;
	private String modelName;
	@Autowired
	private Engine engine;
}

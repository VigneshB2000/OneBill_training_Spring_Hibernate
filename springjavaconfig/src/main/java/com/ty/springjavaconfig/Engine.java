package com.ty.springjavaconfig;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
public class Engine {

	String type;
	Double torque;
	int acceleration;
	
}

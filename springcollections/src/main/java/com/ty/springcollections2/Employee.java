package com.ty.springcollections2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private int id;
	private String name;
	private int salary;
	private String designation;
}

package com.ty.Stationery;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class InkPen implements Pen{

	@Override
	public void write() {
		System.out.println("This is written by Ink pen.");
		
	}

}

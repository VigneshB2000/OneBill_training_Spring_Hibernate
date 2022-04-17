package com.ty.Stationery;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Primary
public class BallPointPen implements Pen{

	@Override
	public void write() {
		System.out.println("Written by BallPoint Pen.");
		
	}

}

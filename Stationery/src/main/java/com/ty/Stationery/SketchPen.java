package com.ty.Stationery;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Qualifier
public class SketchPen implements Pen {
	
	@Override
	public void write() {
		System.out.println("This is written by Sketch pen.");
		
	}

}

package com.ty.springannotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class Sim {

	@Value(value = "Jio")
	String name;
	@Value(value = "0987654321")
	String number;
}

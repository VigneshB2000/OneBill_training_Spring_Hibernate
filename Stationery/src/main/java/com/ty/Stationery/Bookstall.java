package com.ty.Stationery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Data;

@Data
@Component
public class Bookstall {

	@Value(value = "Atomic habits")
	String book;
	@Autowired
	@Qualifier
	Pen pen;
}

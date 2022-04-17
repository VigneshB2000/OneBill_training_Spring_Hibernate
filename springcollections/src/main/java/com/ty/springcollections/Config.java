package com.ty.springcollections;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	@Bean
	public Names name() {
		return new Names(Arrays.asList("AAA","BBB"));
	}
}

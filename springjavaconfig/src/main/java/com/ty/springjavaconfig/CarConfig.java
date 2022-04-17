package com.ty.springjavaconfig;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.ty.springjavaconfig")
public class CarConfig {

//	@Bean(name = "suzuki")
//	public Car getCar() {
//		Car car = new Car();
//		car.setPrice(20000);
//		car.setBrand("Maruthi");
//		car.setModelName("Suzuki 800");
////		car.setEngine(Engine());
//		return car;
//	}
//
//	@Bean(name = "audi")
//	public Car getCar1() {
//		Car car = new Car();
//		car.setPrice(70000000);
//		car.setBrand("Audi");
//		car.setModelName("R8 etron");
////		car.setEngine(Engine());
//		return car;
//	}
//
//	@Bean(name = "engine")
//	public Engine getEngine() {
//		Engine engine = new Engine();
//		engine.setAcceleration(20);
//		engine.setTorque(210.0d);
//		engine.setType("Custom");
//		return engine;
//
//	}
//
//	@Bean
//	@Primary
//	public Engine Engine() {
//		Engine engine = new Engine();
//		engine.setTorque(170.0d);
//		engine.setAcceleration(15);
//		engine.setType("Stock");
//		return engine;
//
//	}

}

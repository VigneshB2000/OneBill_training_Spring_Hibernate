package com.ty.springannotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.ty.springannotation" })
public class MobileConfiguration {

}

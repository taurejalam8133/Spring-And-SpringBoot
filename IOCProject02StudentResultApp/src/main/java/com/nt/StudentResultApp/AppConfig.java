package com.nt.StudentResultApp;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.nt.StudentResultApp")
@PropertySource("classpath:student.properties")
public class AppConfig {

}

package com.nt.IOCProject02OnlineGroceryStoreDiscountSystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.nt.IOCProject02OnlineGroceryStoreDiscountSystem")
@PropertySource("classpath:grocery.properties")
public class AppConfig {
}
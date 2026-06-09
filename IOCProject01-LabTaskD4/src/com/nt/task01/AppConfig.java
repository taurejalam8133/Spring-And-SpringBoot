package com.nt.task01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Doctor doctor() {
        return new Doctor("Dr. Meena Gupta", "Cardiologist");
    }

    @Bean
    public Equipment equipment() {
        return new Equipment("ECG Machine", 250000);
    }

    @Bean
    public Hospital hospital() {
        return new Hospital("City Care Hospital", doctor(), equipment());
    }
}





































//<beans xmlns="http://www.springframework.org/schema/beans"
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xsi:schemaLocation="
//http://www.springframework.org/schema/beans
//http://www.springframework.org/schema/beans/spring-beans.xsd">
//
//
//<bean id="doctor" class="com.nt.task01.Doctor">
// <constructor-arg value="Dr. Meena Gupta"/>
// <constructor-arg value="Cardiologist"/>
//</bean>
//
//
//<bean id="equipment" class="com.nt.task01.Equipment">
// <constructor-arg value="ECG Machine"/>
// <constructor-arg value="250000"/>
//</bean>
//
//
//<bean id="hospital" class="com.nt.task01.Hospital">
// <constructor-arg value="City Care Hospital"/>
// <constructor-arg ref="doctor"/>
// <constructor-arg ref="equipment"/>
//</bean>
//
//</beans>

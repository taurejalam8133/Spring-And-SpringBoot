package com.nit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.bean.Employee;

@Component
public class TestRunner implements CommandLineRunner {

    @Autowired
    private Employee info;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(info);

    }
}

package com.pizzeria.pizzeria_lab;

import org.springframework.stereotype.Component;

public class pastaChef extends Chef{
    @Override
    public void SayHello() {
        System.out.println("Hello I'm the pasta chef \uD83C\uDF5D\u200B");
    }
}

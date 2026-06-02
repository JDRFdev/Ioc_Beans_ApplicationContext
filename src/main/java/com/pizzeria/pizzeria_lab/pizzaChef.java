package com.pizzeria.pizzeria_lab;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class pizzaChef extends Chef {
    @Override
    public void SayHello() {
        System.out.println("Hello I'm the pizza Chef \uD83C\uDF55\u200B");
    }
}

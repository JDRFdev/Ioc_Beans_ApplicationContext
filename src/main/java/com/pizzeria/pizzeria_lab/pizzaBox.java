package com.pizzeria.pizzeria_lab;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class pizzaBox {
    public void sayHello(){
        System.out.println("Hello! I'm a box");
    }
}

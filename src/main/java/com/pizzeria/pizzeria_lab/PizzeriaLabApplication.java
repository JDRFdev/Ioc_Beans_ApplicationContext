package com.pizzeria.pizzeria_lab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PizzeriaLabApplication {

	public static void main(String[] args) {
		var context=SpringApplication.run(PizzeriaLabApplication.class, args);
		Chef chef1 = context.getBean(Chef.class);
		Chef chef2 = context.getBean(Chef.class);
		System.out.println("Is the same Chef?: "+(chef1==chef2));
		pizzaBox box1 =context.getBean(pizzaBox.class);
		pizzaBox box2 =context.getBean(pizzaBox.class);
		System.out.println("Is the same box?: "+(box1==box2));
	}
}

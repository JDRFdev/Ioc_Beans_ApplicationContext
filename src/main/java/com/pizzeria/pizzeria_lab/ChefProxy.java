package com.pizzeria.pizzeria_lab;

public class ChefProxy extends Chef{

    private final Chef realChef;

    public ChefProxy(Chef realChef) {
        this.realChef = realChef;
    }

    @Override
    public void SayHello() {
        System.out.println("[Proxy] Waiter checks if the customer is polite....");
        this.realChef.SayHello();
        System.out.println("[Proxy] Waiter writes down that the Chef was busy for 1 second");
    }

}

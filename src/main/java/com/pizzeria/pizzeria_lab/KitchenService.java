package com.pizzeria.pizzeria_lab;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

public class KitchenService {

    private final Chef chef;

    public KitchenService( Chef chef) {
        this.chef = chef;
    }
    public void prepareOrder(){
        System.out.println("Here in the Kitchen we prepare delicious plates, Chef says Hello");
        this.chef.SayHello();
    }

    public void init(){
        System.out.println("The kitchen's ready!");
        prepareOrder();
    }
    public  void cleanup(){
        System.out.println("We are cleaning up the kitchen");
    }
}

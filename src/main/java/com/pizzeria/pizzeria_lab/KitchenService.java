package com.pizzeria.pizzeria_lab;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.scheduling.annotation.Async;

@Async
@ConfigurationProperties(prefix="pizzeria")
public class KitchenService {

    private final Chef chef;
    private String name;
    private String address;
    private String ovenTemperature;
    public KitchenService( Chef chef) {
        this.chef = chef;
    }
    public void prepareOrder(){
        System.out.println("Here in the Kitchen we prepare delicious plates, Chef says Hello");
        this.chef.SayHello();
        System.out.println("The Oven's tempeture is: "+this.ovenTemperature);
        System.out.println("Name: "+this.name);
        System.out.println("Address: "+this.address);
    }

    public void init(){
        System.out.println("The kitchen's ready!");
        prepareOrder();
    }
    public  void cleanup(){
        System.out.println("We are cleaning up the kitchen");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Chef getChef() {
        return chef;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOvenTemperature() {
        return ovenTemperature;
    }

    public void setOvenTemperature(String ovenTemperature) {
        this.ovenTemperature = ovenTemperature;
    }
}

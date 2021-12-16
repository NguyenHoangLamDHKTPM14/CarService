package com.hoanglam.CarService.model;

import org.springframework.context.annotation.Description;

public abstract class Car {
    private String name;
    private int price;
    private Description description;

    abstract int getCost();
    public String getName(){
        return name;
    }
    public Description getDescription(){
        return description;
    }
}

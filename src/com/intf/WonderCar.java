package com.intf;
public class WonderCar extends Car implements Truck, Bus{
    @Override
    public void drive(int id){
        System.out.println("This drive method in child class: " + id);
    }

    @Override
    public void drive(String name){
        System.out.println("This drive method in child class: " + name);
    }
}

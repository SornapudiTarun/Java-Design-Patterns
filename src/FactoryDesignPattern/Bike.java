package FactoryDesignPattern;

public class Bike implements Vehicle{
    @Override
    public void drive() {
        System.out.println("You are driving the Vehicle Bike");
    }
}

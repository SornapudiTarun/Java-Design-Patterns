package FactoryDesignPattern;

public class Car implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Your are drive the Vehicle Car");
    }
}

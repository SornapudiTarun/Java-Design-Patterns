package FactoryDesignPattern;

public class FactoryDesignPatternMain {
    public static void main(String[] args) {

        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();
        Vehicle bike = VehicleFactory.getVehicle("bike");
        bike.drive();
        Vehicle truck = VehicleFactory.getVehicle("truck");
        truck.drive();
    }
}

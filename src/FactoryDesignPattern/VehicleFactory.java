package FactoryDesignPattern;

public class VehicleFactory {

    public static Vehicle getVehicle(String vehicle){
        if (vehicle.equalsIgnoreCase("Bike")){
            return new Bike();
        } else if (vehicle.equalsIgnoreCase("Car")) {
            return new Car();
        } else if (vehicle.equalsIgnoreCase("Truck")) {
            return new Truck();
        }
        else {
            return null;
        }
    }
}

package factory_method;
import factory_method.abstracts.VehicleFactory;
import factory_method.factories.MotorcycleFactory;
import factory_method.factories.TruckFactory;
import factory_method.factories.CarFactory;

public class Main {
    public static void main(String[] args) {

        VehicleFactory car = new CarFactory();
        car.testDrive();
        
        VehicleFactory motorcycle = new MotorcycleFactory();
        motorcycle.testDrive();

        VehicleFactory truck = new TruckFactory();
        truck.testDrive();

        
    }
}
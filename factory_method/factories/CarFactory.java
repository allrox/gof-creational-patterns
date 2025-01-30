package factory_method.factories;
import factory_method.abstracts.VehicleFactory;
import factory_method.vehicles.Car;
import factory_method.abstracts.Vehicle;

public class CarFactory extends VehicleFactory {
    
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    
}

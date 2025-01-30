package factory_method.factories;
import factory_method.abstracts.VehicleFactory;
import factory_method.vehicles.Motorcycle;
import factory_method.abstracts.Vehicle;

public class MotorcycleFactory extends VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Motorcycle();
    }
}

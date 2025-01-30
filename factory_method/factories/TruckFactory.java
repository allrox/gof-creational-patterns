package factory_method.factories;
import factory_method.abstracts.VehicleFactory;
import factory_method.vehicles.Truck;
import factory_method.abstracts.Vehicle;

public class TruckFactory extends VehicleFactory {
    
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
    
}

package abstract_factory.vehicles;
import abstract_factory.interfaces.VehicleInterface;

public class Truck implements VehicleInterface {
    @Override
    public String drive() {
        return "Vehicle class: Truck";
    }
    
}

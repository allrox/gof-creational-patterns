package abstract_factory.vehicles;
import abstract_factory.interfaces.VehicleInterface;

public class Car implements VehicleInterface {
    @Override
    public String drive() {
        return "Vehicle class: Car";
    }
    
}

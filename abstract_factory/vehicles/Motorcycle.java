package abstract_factory.vehicles;
import abstract_factory.interfaces.VehicleInterface;

public class Motorcycle implements VehicleInterface {
    @Override
    public String drive() {
        return "Vehicle class: Motorcycle";
    }
    
}

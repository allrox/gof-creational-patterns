package factory_method.abstracts;
import factory_method.interfaces.VehicleInterface;

public abstract class Vehicle implements VehicleInterface {

    protected String name;

    public Vehicle(String name) {
        this.name = name;
    }

    @Override
    public String drive() {
        return "Driving a " + name;
    }
    
}

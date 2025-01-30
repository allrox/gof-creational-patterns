package factory_method.abstracts;
import factory_method.interfaces.VehicleInterface;

public abstract class Vehicle implements VehicleInterface {

    protected String name;
    protected int axis;
    protected int ticket;

    public Vehicle(String name, int axis) {
        this.name = name;
        this.axis = axis;
        this.ticket = axis * 10;
    }

    @Override
    public String tax() {
        return "Vehicle: " + name 
        + "\nTicket value: U$" + ticket 
        + "\n-------------------------";
    }
    
}

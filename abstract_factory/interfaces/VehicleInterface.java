package abstract_factory.interfaces;

// This is the interface for the Vehicle class, it's a contract that all classes that implement it must follow.
public interface VehicleInterface {
    
    // This method is used to drive the vehicle and must be implemented by all classes that implement this interface.
    String drive();
}

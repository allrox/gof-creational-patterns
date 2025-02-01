package abstract_factory.factories;
import abstract_factory.interfaces.VehicleLicenseInterface;
import abstract_factory.interfaces.VehicleInterface;

// This is the abstract factory interface. It has two methods that return an object of type VehicleInterface and VehicleLicenseInterface. Concrete factories will implement this interface.
public interface VehicleFactory {
    VehicleInterface createVehicle();
    VehicleLicenseInterface createDocument();
}

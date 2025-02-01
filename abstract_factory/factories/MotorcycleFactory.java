package abstract_factory.factories;
import abstract_factory.interfaces.VehicleLicenseInterface;
import abstract_factory.interfaces.VehicleInterface;
import abstract_factory.vehicles.Motorcycle;
import abstract_factory.vehicle_documents.MotorcycleLicense;

// This is a concrete factory that implements the VehicleFactory interface. It has two methods that return an object of type Truck and TruckLicense overriding the methods from the interface.
public class MotorcycleFactory implements VehicleFactory {
    @Override
    public VehicleInterface createVehicle() {
        return new Motorcycle();
    }
    
    @Override
    public VehicleLicenseInterface createDocument() {
        return new MotorcycleLicense();
    }
    
}

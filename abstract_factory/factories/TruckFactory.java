package abstract_factory.factories;
import abstract_factory.interfaces.VehicleLicenseInterface;
import abstract_factory.interfaces.VehicleInterface;
import abstract_factory.vehicles.Truck;
import abstract_factory.vehicle_documents.TruckLicense;

// This is a concrete factory that implements the VehicleFactory interface. It has two methods that return an object of type Truck and TruckLicense overriding the methods from the interface.
public class TruckFactory implements VehicleFactory {
    @Override
    public VehicleInterface createVehicle() {
        return new Truck();
    }

    @Override
    public VehicleLicenseInterface createDocument() {
        return new TruckLicense();
    }
    
}

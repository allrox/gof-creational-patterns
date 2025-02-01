package abstract_factory.vehicle_documents;
import abstract_factory.interfaces.VehicleLicenseInterface;

// This is a concrete product class that implements the VehicleLicenseInterface. It has a method that returns a string message and overrides interface method.
public class TruckLicense implements VehicleLicenseInterface {
    @Override
    public String createDocument() {
        return "Truck License needed.\n";
    }
    
}

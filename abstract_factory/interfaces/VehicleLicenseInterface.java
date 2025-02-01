package abstract_factory.interfaces;

// This is the interface for the VehicleLicense class, it's a contract that all classes that implement it must follow.
public interface VehicleLicenseInterface {

    // This method is used to create a document for the vehicle and must be implemented by all classes that implement this interface.
    String createDocument();
}

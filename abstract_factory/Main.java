package abstract_factory;
import abstract_factory.factories.VehicleFactory;
import abstract_factory.factories.CarFactory;
import abstract_factory.factories.TruckFactory;
import abstract_factory.factories.MotorcycleFactory;
import abstract_factory.interfaces.VehicleLicenseInterface;
import abstract_factory.interfaces.VehicleInterface;

public class Main {
    public static void main(String[] args) {

        // Step 1: Using the CarFactory to set vehicle type to car
        // Step 2: Using carFactory to create a car implementing VehicleInterface
        // Step 3: Using carDocument to create a car document implementing VehicleLicenseInterface

        VehicleFactory carFactory = new CarFactory();
        VehicleInterface car = carFactory.createVehicle();
        VehicleLicenseInterface carDocument = carFactory.createDocument();

        // Step 4: Print the car drive method and car document method
        System.out.println(car.drive());
        System.out.println(carDocument.createDocument());

        VehicleFactory motorcycleFactory = new MotorcycleFactory();
        VehicleInterface motorcycle = motorcycleFactory.createVehicle();
        VehicleLicenseInterface motorcycleDocument = motorcycleFactory.createDocument();

        System.out.println(motorcycle.drive());
        System.out.println(motorcycleDocument.createDocument());

        VehicleFactory truckFactory = new TruckFactory();
        VehicleInterface truck = truckFactory.createVehicle();
        VehicleLicenseInterface truckDocument = truckFactory.createDocument();

        System.out.println(truck.drive());
        System.out.println(truckDocument.createDocument());
    }
    
}

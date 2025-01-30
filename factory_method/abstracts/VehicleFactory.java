package factory_method.abstracts;

public abstract class VehicleFactory {

    public abstract Vehicle createVehicle();
    
    public void testDrive() {
        Vehicle vehicle = createVehicle();
        System.out.println(vehicle.tax());
    }

}

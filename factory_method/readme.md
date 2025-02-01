# GoF Creational Patterns
## Factory Method

**The Factory Method pattern defines an interface for object creation**, allowing subclasses to decide which concrete class will be instantiated. This pattern promotes code flexibility and extensibility, reducing coupling between classes.

## Logical structure

### First: Interface *VehicleInterface.java*
The interface defines a contract ensuring that all vehicles share a common behavior.

### Second: Abstract class *Vehicle.java*
The abstract class implements the interface and adds common attributes, reducing code repetition in concrete classes.

### Third: Concrete classes *Car.java, Motorcycle.java*
These classes inherit from the abstract class to ensure they follow the interface definitions while providing their own specific implementations.

### Fourth: Abstract class *VehicleFactory.java*
**This abstract class defines the Factory Method, but does not implement it directly.** It also includes the *testDrive()* method, which uses the created vehicle without knowing its concrete implementation.

### Fifth: Concrete classes *CarFactory.java, MotorcycleFactory.java*
Each factory inherits from VehicleFactory and decides which vehicle to instantiate. They generate concrete objects through the createVehicle() method.

### Main Class: *Main.java*
The entry point of the application.
This class orchestrates everything, using the factories to create and test vehicles without knowing their concrete implementations.

**How it works:**
It instantiates a specific factory (CarFactory or MotorcycleFactory).
Calls the startTransport() method, which:
* Uses the Factory Method (createVehicle()) to generate a concrete vehicle.
* Calls the drive() method without directly referencing Car or Motorcycle.
* Demonstrates how the Factory Method pattern ensures loose coupling and extensibility.

## Why use Factory Method?

**Encapsulates object creation** → The client does not need to know which concrete class to instantiate.  
**Reduces coupling** → The client depends only on the abstract factory (`VehicleFactory`), not on specific implementations.  
**Enhances maintainability** → Adding a new vehicle type (e.g., `Truck`) only requires creating a new factory without modifying existing code.  
**Promotes consistency** → Ensures that all created objects follow a predefined structure and interface.  
**Supports scalability** → The pattern allows new products to be integrated into the system seamlessly.  

## Factory Method: Precedence and Dependencies Summary

| Order | File                           | Function                                                    | Dependencies                                      |
|-------|--------------------------------|-------------------------------------------------------------|--------------------------------------------------|
| 1️⃣   | `VehicleInterface.java`        | Defines the interface for vehicles                         | None                                             |
| 2️⃣   | `VehicleFactory.java`          | Defines the Factory Method                                 | Depends on `VehicleInterface`                     |
| 3️⃣   | `CarFactory.java`, `MotorcycleFactory.java` | Implement the Factory Method, creating concrete vehicles | Depend on `VehicleFactory` and concrete classes  |
| 4️⃣   | `Car.java`, `Motorcycle.java`  | Implement the vehicle interface                           | Depend on `VehicleInterface`                     |
| 5️⃣   | `Main.java`                    | Application entry point                                   | Depends on `VehicleFactory`                      |


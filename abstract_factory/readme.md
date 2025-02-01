# GoF Creational Patterns
## Abstract Factory

**The Abstract Factory pattern defines an interface for creating families of related objects** without specifying their concrete classes.
It provides an abstraction that ensures consistent object creation, making it easier to maintain, extend, and decouple the code.

## Logical construction

### First: Interface *VehicleInterface.java*
Defines a contract that ensures all vehicle types share a common behavior.

### Second: Interface *VehicleDocument.java*
Defines a contract for vehicle documents, ensuring that every vehicle has a corresponding document.

### Third: Abstract Factory *VehicleFactory.java*
Defines the Factory Method for creating both vehicles and their respective documents. This ensures that every vehicle created is always paired with the correct type of document.

### Fourth: Concrete Factories *CarFactory.java, MotorcycleFactory.java*
Each factory implements VehicleFactory.java and decides which vehicle and document to instantiate.This ensures that every car has a car document and every motorcycle has a motorcycle document.

### Fifth: Concrete Vehicles *Car.java, Motorcycle.java, Truck.java*
Each class implements VehicleInterface.java, defining specific behavior for different vehicle types.

### Sixth: Concrete Documents *CarDocument.java, MotorcycleDocument.java, TruckDocument.java*
Each class implements VehicleDocument.java, ensuring that every vehicle type has the correct document format.

### Main Class: *Main.java*
The entry point of the application.
It uses the Abstract Factory to instantiate objects without knowing their concrete implementations.

## How it works
Instead of having multiple if-else conditions to determine which vehicle and document to create, we rely on factories that encapsulate the creation logic.

* The client code requests a factory (CarFactory, MotorcycleFactory or TruckFactory).
* The factory creates both the vehicle and its corresponding document.
* The client code does not need to know the exact classes—it only interacts with the abstract interfaces.

## Why use Abstract Factory?
* Ensures consistency → **Every vehicle always gets the correct type of document**.
* Encapsulates object creation → The client code does not need to worry about which class to instantiate.
* Improves maintainability → **Adding a new vehicle type (e.g.,Bus) only requires creating a new factory, without modifying existing code.**
* Reduces coupling → The client depends only on interfaces, not concrete implementations.

## Precedence and Dependencies Summary

| Order | File                           | Function                                                    | Dependencies                                      |
|-------|--------------------------------|-------------------------------------------------------------|--------------------------------------------------|
| 1️⃣   | `VehicleInterface.java`        | Defines the interface for vehicles                         | None                                             |
| 2️⃣   | `VehicleDocument.java`         | Defines the interface for documents                        | None                                             |
| 3️⃣   | `VehicleFactory.java`          | Defines the Abstract Factory                               | Depends on vehicle and document interfaces      |
| 4️⃣   | `CarFactory.java`, `MotorcycleFactory.java` | Create vehicles and documents | Depend on `VehicleFactory` and concrete classes |
| 5️⃣   | `Car.java`, `Motorcycle.java`  | Implement the vehicle interface                           | Depend on `VehicleInterface`                     |
| 6️⃣   | `CarDocument.java`, `MotorcycleDocument.java` | Implement the document interface | Depend on `VehicleDocument`                      |
| 7️⃣   | `Main.java`                    | Application entry point                                   | Depends on `VehicleFactory`                      |


# GoF Creational Patterns  
## Builder  

**The Builder pattern allows step-by-step object creation**, separating the construction process from the object’s representation.  
This pattern is useful when creating complex objects with multiple configurations while maintaining code clarity and flexibility.

## **Logical Structure**  

### **First: Class `Computer.java`**  
Defines the **final product (Computer)** with attributes such as **CPU, RAM, storage, GPU, and OS**.  
It ensures that all computers have **valid attributes** and **a structured output format**.

### **Second: Class `ComputerBuilder.java`**  
Implements the **Builder Pattern**, allowing incremental object construction.  
It provides **methods for setting individual attributes**, ensuring **flexibility** and **avoiding complex constructors**.

### **Third: Class `ComputerDirector.java`**  
Defines **pre-configured computer models** (e.g., **Gaming PC, Workstation, Basic PC**).  
It prevents code duplication and **standardizes common configurations**.

### **Fourth: Class `Main.java`**  
The **entry point of the application**, responsible for testing and demonstrating the Builder Pattern.  
It **uses `ComputerDirector` to create and display various computers**.

---

## **How it Works**  

1️⃣ The **client (`Main.java`)** requests a computer from the **Director (`ComputerDirector`)**.  
2️⃣ The **Director** uses the **Builder (`ComputerBuilder`)** to set up the computer step by step.  
3️⃣ Once complete, the **Builder returns a fully configured `Computer` object**.  
4️⃣ The **client only interacts with the Director and never deals with the Builder directly**.

---

## **Why Use Builder?**  

✅ **Encapsulates object construction** → The client does not need to manually set attributes.  
✅ **Avoids constructors with too many parameters** → Improves readability and maintainability.  
✅ **Allows flexible object creation** → Objects can be built **with different configurations** without modifying existing code.  
✅ **Encourages code reuse** → Predefined configurations (e.g., **Gaming PC, Workstation**) can be created easily via a **Director**.  

---

## **Builder: Precedence and Dependencies Summary**  

| Order | File                          | Function                                                   | Dependencies                                      |
|-------|-------------------------------|------------------------------------------------------------|--------------------------------------------------|
| 1️⃣   | `Computer.java`               | Defines the final product (Computer)                        | None                                             |
| 2️⃣   | `ComputerBuilder.java`        | Implements the Builder Pattern                              | Depends on `Computer.java`                       |
| 3️⃣   | `ComputerDirector.java`       | Predefines computer configurations                         | Uses `ComputerBuilder.java`                      |
| 4️⃣   | `Main.java`                   | Runs the program and prints outputs                        | Uses `ComputerDirector.java`                     |


---
## **Why Use Builder Instead of Factory Method?**  

| **Feature**          | **Factory Method** | **Builder Pattern** |
|---------------------|-----------------|-----------------|
| **Creates a single type of object** | ✅ Yes | ❌ No |
| **Constructs complex objects step by step** | ❌ No | ✅ Yes |
| **Avoids large constructors with multiple parameters** | ❌ No | ✅ Yes |
| **Allows flexible configuration of attributes** | ❌ No | ✅ Yes |
| **Best for simple object creation** | ✅ Yes | ❌ No |
| **Best for objects with many optional settings** | ❌ No | ✅ Yes |


---

## **Example Usage (Java)**  
```java
public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        System.out.println("\n🔹 Building Gaming PC...");
        Computer gamingPC = director.buildGamingPC();
        System.out.println(gamingPC);
        System.out.println("==============================");

        System.out.println("\n🔹 Building Work PC...");
        Computer workPC = director.buildWorkComputer();
        System.out.println(workPC);
        System.out.println("==============================");

        System.out.println("\n🔹 Building Basic PC...");
        Computer basicPC = director.buildBasicComputer();
        System.out.println(basicPC);
        System.out.println("==============================");
    }
}


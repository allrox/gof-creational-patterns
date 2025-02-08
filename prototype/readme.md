# **GoF Creational Patterns**  
## **Prototype Pattern**  

**The Prototype Pattern allows the cloning of existing objects** instead of creating new ones from scratch.  
This is particularly useful when object creation is expensive or when we need multiple variations of the same object without modifying the original.

---

## **Logical Structure**  

### **First: Interface `Prototype.java`**  
Defines a contract ensuring that all objects implementing it can be cloned.  

### **Second: Class `Computer.java`**  
Implements the **Prototype interface**, allowing objects to be cloned while preserving their attributes.  
Also provides methods to modify specific attributes after cloning.  

### **Third: Class `Main.java`**  
The **entry point of the application**, demonstrating how to:  
- **Clone objects** from a base prototype.  
- **Modify specific attributes** without changing the original object.  

---

## **How It Works**  

1️⃣ A **base computer model (`basePC`)** is created.  
2️⃣ Instead of creating new objects from scratch, we **clone `basePC`** to generate:  
   - A **Gaming PC** (modifies model name, RAM, and GPU).  
   - A **Custom PC** (changes only the model name).  
   
3️⃣ Each cloned object retains **all attributes of the original** but allows specific modifications.  

---

## **Why Use Prototype?**  

✅ **Avoids expensive object creation** → Cloning is faster than reinitializing from scratch.  
✅ **Preserves object state** → The cloned object maintains the properties of the original.  
✅ **Allows easy modifications** → Each clone can be customized without affecting the original.  
✅ **Improves performance** → Ideal for scenarios where object creation is costly (e.g., **loading models from a database**).  

---

## **Prototype: Precedence and Dependencies Summary**  

| Order | File                          | Function                                                   | Dependencies                                      |
|-------|-------------------------------|------------------------------------------------------------|--------------------------------------------------|
| 1️⃣   | `Prototype.java`              | Defines the cloning contract                               | None                                             |
| 2️⃣   | `Computer.java`               | Implements the Prototype interface                        | Depends on `Prototype.java`                      |
| 3️⃣   | `Main.java`                   | Runs the program and demonstrates cloning                 | Uses `Computer.java`                             |

---

## **Example Usage (Java)**  

```java
public class Main {
    public static void main(String[] args) {
        // Creating the base PC model
        Computer basePC = new Computer("Base Model", "Intel i7", 16, "1TB SSD", "RTX 3060", "Windows 11");

        System.out.println("\n🔹 Original Computer:");
        System.out.println(basePC);

        // Cloning base model to create a Gaming PC
        Computer gamingPC = (Computer) basePC.clone();
        gamingPC.setModel("Gaming Beast");
        gamingPC.setRam(32);
        gamingPC.setGpu("RTX 4090");

        System.out.println("\n🔹 Cloned Gaming PC:");
        System.out.println(gamingPC);

        // Cloning base model to create an Office PC
        Computer officePC = (Computer) basePC.clone();
        officePC.setModel("Office Workstation");
        officePC.setRam(8);
        officePC.setGpu("Integrated Graphics");

        System.out.println("\n🔹 Cloned Office PC:");
        System.out.println(officePC);

        // Cloning base model to create a Custom PC (only changing the model name)
        Computer customPC = (Computer) basePC.clone();
        customPC.setModel("Custom Build");

        System.out.println("\n🔹 Cloned Custom PC:");
        System.out.println(customPC);
    }
}

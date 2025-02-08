package prototype;

// This is the class we may want to clone.
public class Computer implements Prototype {

    // Here are the fields of the class.
    private String model;
    private String cpu;
    private int ram;
    private String storage;
    private String gpu;
    private String os;
    
    // This is the constructor of the class.
    public Computer(String model, String cpu, int ram, String storage, String gpu, String os) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }

    // This is the clone method that is required by the Prototype interface.
    @Override
    public Prototype clone() {
        return new Computer(model, cpu, ram, storage, gpu, os);
    }

    // This is the toString method that is used to print the object. Remember that without this method, the object will be printed as a hash code.
    @Override
    public String toString(){
        return 
            "Model: " + model + 
            "\n----------------" +
            "\nProcessor: " + cpu + 
            "\nRAM: " + ram + " GB" +
            "\nStorage: " + storage + 
            "\nGPU: " + gpu + 
            "\nOS: " + os + "\n";
    }

    // These are the setters of the class. They define wich field can be changed.
    public void setModel(String model) {this.model = model;}
    public void setRam(int ram) {this.ram = ram;}
    public void setStorage(String storage) {this.storage = storage;}
    public void setGpu(String gpu) {this.gpu = gpu;}

}

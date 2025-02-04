package builder.model;

// This class represents a computer with its specifications. This abstracts the computer's details.
public class Computer {
    private String model;
    private String cpu;
    private int ram;
    private String storage;
    private String gpu;
    private String os;
    
    public Computer(String model, String cpu, int ram, String storage, String gpu, String os) {

        // This lines throw exceptions if the parameters are invalid
        if (model == null || model.isEmpty()) throw new IllegalArgumentException("Model cannot be null or empty.");
        if (cpu == null || cpu.isEmpty()) throw new IllegalArgumentException("CPU cannot be null or empty.");
        if (storage == null || storage.isEmpty()) throw new IllegalArgumentException("Storage cannot be null or empty.");
        if (gpu == null || gpu.isEmpty()) throw new IllegalArgumentException("GPU cannot be null or empty.");
        if (os == null || os.isEmpty()) throw new IllegalArgumentException("OS cannot be null or empty.");
        if (ram <= 0) throw new IllegalArgumentException("RAM must be greater than 0.");

        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }
    
    @Override
    public String toString(){
        return "Bulding " + model + "\nComputer specs:\n" + 
        "------------------\n" +
        "CPU: " + cpu + "\n" +
        "RAM: " + ram + "GB\n" + 
        "Storage: " + storage + "\n" +
        "GPU: " + gpu + "\n" +
        "OS: " + os + "\n";
    }
    
}

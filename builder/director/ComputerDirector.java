package builder.director;
import builder.model.Computer;
import builder.builder.ComputerBuilder;

// This abstracts the process of building a computer. This class is responsible for creating a computer with specific details. You should put all models here.
public class ComputerDirector {
    
    public Computer buildGamingPC() {
        return new ComputerBuilder()
        .setModel("Alienware Xtreme")
        .setCpu("Intel i9")
        .setRam(128)
        .setStorage("2TB Nvme")
        .setGpu("RTX 4090")
        .setOs("Windows 11")
        .build();
    }
    
    public Computer buildWorkComputer() {
        return new ComputerBuilder()
        .setModel("Dell Precision")
        .setCpu("Intel i5")
        .setRam(32)
        .setStorage("500GB")
        .setGpu("Integrated")
        .setOs("Windows 11")
        .build();
    }
    
    public Computer buildBasicComputer() {
        return new ComputerBuilder()
        .setModel("HP Pavilion")
        .setCpu("Intel i3")
        .setRam(16)
        .setStorage("250GB")
        .setGpu("Integrated")
        .setOs("Windows 11")
        .build();
    }
    
}

package builder.builder;
import builder.model.Computer;

// This class defines the process of building a computer and sets the details that the computer will have.
public class ComputerBuilder {
    
        private String model;
        private String cpu;
        private int ram;
        private String storage;
        private String gpu;
        private String os;
        
        public ComputerBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder setCpu(String cpu ) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }
        
        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }
        
        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }
        
        public ComputerBuilder setOs(String os) {
            this.os = os;
            return this;
        }
        
        public Computer build() {
            return new Computer(model, cpu, ram, storage, gpu, os);
        }
     

}

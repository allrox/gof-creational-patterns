package prototype;

public class Main {
    public static void main(String[] args) {

        // Here we create a new instance of the Computer class. It will be our base object.
        Computer basePC = new Computer(
            "ArxWare", 
            "Intel i9", 
            32, 
            "512GB Nvme", 
            "Nvidia RTX 3090TI", 
            "Windows 11"
        );
    
        System.out.println(basePC);

        // This code implements the prototype pattern. We clone the base object and change some of its fields through the setters defined in the class.It's way important notice that propertyes that are not changed will be the same as the base object.
        Computer gamingPc = (Computer) basePC.clone();
        gamingPc.setModel("ArxWare Gaming");
        gamingPc.setRam(128);
        gamingPc.setStorage("2TB Nvme");
        System.out.println(gamingPc);

        Computer customPc = (Computer) basePC.clone();
        customPc.setModel("ARX Custom");
        customPc.setRam(256);
        customPc.setStorage("4TB Nvme");
        System.out.println(customPc);
    }
    
}

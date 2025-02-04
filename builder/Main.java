package builder;
import builder.model.Computer;
import builder.director.ComputerDirector;


// This is the main class that will run the program.
public class Main {
    
    public static void main(String[] args) {
        
        // Create a director, that is in charge of building the computers
        ComputerDirector director = new ComputerDirector();

        // This is how you build a computer with the director
        Computer gamingPC = director.buildGamingPC();
        System.out.println(gamingPC);

        Computer workPC = director.buildWorkComputer();
        System.out.println(workPC);

        Computer basicPC = director.buildBasicComputer();
        System.out.println(basicPC);
        
    }
}

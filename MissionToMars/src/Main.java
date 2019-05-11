
import java.util.ArrayList;
public class Main {
    public static void main (String[] args) {
        Simulation simulation = new Simulation();
        //Load a fleet of U1 rockets for Phase-1 and then for Phase-2
        ArrayList U1list = simulation.loadU1("src/phase-1.txt");
        ArrayList U2list = simulation.loadU2("src/phase-2.txt");

        //Run the simulation using the fleet of U1 and U2 rockets and display the total budget required.
        int U1budget = simulation.runSimulation(U1list);
        int U2budget = simulation.runSimulation(U2list);

        System.out.println("The total budget for U1 rockets are: " + U1budget + " millions.");
        System.out.println("The total budget for U2 rockets are: " + U2budget + " millions.");
    }
}

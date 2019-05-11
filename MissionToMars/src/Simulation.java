import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulation {
    /**
     * this method loads all items from a text file and
     * returns an ArrayList of Items:
     */
    public ArrayList loadItems(String pathname){
        File file = new File (pathname);
        //Create an array list to store the items
        ArrayList items = new ArrayList();
        try{
            Scanner scanner= new Scanner(file);
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //split each line into "name " = "weight "
                String[] contents = line.split("=");
                Item newItem = new Item();
                newItem.name = contents[0];
                newItem.weight = Integer.parseInt(contents[1]);
                //add item into array use add() method
                items.add(newItem);
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return items;
    }

    /**
     * This method takes the ArrayList of Items returned from
     * loadItems and starts creating U1 rockets.
     * It first tries to fill up 1 rocket with as many items as possible
     * before creating a new rocket object and filling that one until all
     * items are loaded. The method then returns the ArrayList of those U1
     * rockets that are fully loaded.
     *
     * @param pathname
     * @return U1list
     */
    public ArrayList loadU1(String pathname){
        ArrayList itemLists;
        itemLists = loadItems(pathname);
        Rocket aU1 = createU1Rocket();
        int numOfRockets = 0;
        //create an Array to store all the U1 rockets
        ArrayList<Rocket> U1list  = new ArrayList<>();

        for (int counter = 0;counter < itemLists.size(); counter++) {
            Item items = (Item) itemLists.get(counter);

            if (aU1.canCarry(items)) {
                aU1.carry(items);
            } else {
                U1list.add(aU1);//add to the array
                aU1 = createU1Rocket();//create a new rocket
                numOfRockets++;
            }
        }
        System.out.println("rockets load full are: " + numOfRockets);
        return U1list;
    }


    /**
     * this method also takes the ArrayList of Items and starts creating U2 rockets
     * and filling them with those items the same way as with U1 until all items are loaded.
     * The method then returns the ArrayList of those U2 rockets that are fully loaded.
     * @param pathname
     * @return U2list
     */
    public ArrayList loadU2(String pathname){
        ArrayList itemLists;
        itemLists = loadItems(pathname);
        Rocket aU2 = createU2Rocket();
        int numOfRockets = 0;
        //create an Array to store all the U2 rockets
        ArrayList<Rocket> U2list  = new ArrayList<>();

        for (int counter = 0;counter < itemLists.size(); counter++){
            Item items = (Item)itemLists.get(counter);

            if (aU2.canCarry(items)){
                aU2.carry(items);
            }
            else{
                U2list.add(aU2);//add to the array
                aU2 = createU2Rocket();//create a new rocket
                numOfRockets++;
            }
        }
        System.out.println("rockets load full are: " + numOfRockets);
        return U2list;
    }


    /**
     * this method takes an ArrayList of Rockets and calls launch and land methods for each of the rockets
     * in the ArrayList. Every time a rocket explodes or crashes (i.e if launch or land return false) it
     * will have to send that rocket again. All while keeping track of the total budget required to send
     * each rocket safely to Mars. runSimulation then returns the total budget required to send all rockets
     * (including the crashed ones)
     * @param rocketsList
     * @return int totalBudget
     */
    public int runSimulation(ArrayList<Rocket> rocketsList){
        int totalBudget = 0;
        for (int counter = 0;counter < rocketsList.size(); counter++) {
            Rocket rockets = (Rocket) rocketsList.get(counter);
            //if lunch failed, send a new rocket
            if(!rockets.launch()){
                totalBudget += rockets.rocketCost;
                counter--;
                //System.out.println("launch failed" + totalBudget);
            }
            //if land failed, send a new rocket
            else if(!rockets.land()){
                totalBudget += rockets.rocketCost;
                counter--;
                //System.out.println("land failed" + totalBudget);
            }
            //if success, move on to the next one
            else{
                totalBudget += rockets.rocketCost;
                //System.out.println("success" + totalBudget);
            }
        }
        return totalBudget;

    }

    private Rocket createU1Rocket(){
        return new U1();
    }

    private Rocket createU2Rocket(){
        return new U2();
    }

}

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
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
     */
    public ArrayList loadU1(String pathname){
        ArrayList itemLists;
        itemLists = loadItems(pathname);
        U1 aU1 = new U1();
        for (int counter = 0;counter < itemLists.size(); counter++){
            Item items = (Item)itemLists.get(counter);
            if (aU1.canCarry(items)){

            }
        }
    }

}

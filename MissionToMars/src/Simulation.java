import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
public class Simulation {
    /**
     * this method loads all items from a text file and
     * returns an ArrayList of Items:
     */
    public void loadItems(String pathname){
        File file = new File (pathname);
        try{
            Scanner scanner= new Scanner(file);
            //Create an array list to store the items
            ArrayList items = new ArrayList();
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                //split each line into "name " = "weight "
                String[] contents = line.split("=");
                Item newItem = new Item();
                newItem.name = contents[0];
                newItem.weight = Integer.parseInt(contents[1]);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}

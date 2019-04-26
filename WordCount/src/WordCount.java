/**
 * Created by Yuan on 4/26/2019
 */


import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main(String [] args) throws Exception{
        File file = new File ( "story1.txt");
        Scanner scanner = new Scanner (file);

        int words = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }
        System.out.println(" The file contains " + words + " of words");
    }
}


/**
 * Created by Yuan on 4/29/2019
 */
import java.io.File;
import java.util.Scanner;

public class Game {
    public static void main (String [] args) throws Exception{
        //read the movie name from the file
        File file = new File ("movies.txt");
        Scanner scanner = new Scanner (file);
        //count: the number of the names in the file
        int countMovie = 0;
        //create an array to store the movie
        String [] movieList = new String[100];
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println("The movies include: " + line);
            movieList[countMovie] = line;
            countMovie ++;
        }
        System.out.println(countMovie +" movies are in the file");

        //random pick one movie from the pool
        String selectedMovie = movieList[(int)(Math.random() * countMovie)];
        System.out.println("selected movie is " + selectedMovie);

        //covert letters to underscore and display them instead
        //create an array to store the updated movie name
        char [] updatedName = new char [100];
        for (int i=0; i < selectedMovie.length(); i++){
            //show the blank
            if (selectedMovie.charAt(i) == ' ') {
                System.out.print(" ");
                updatedName[i] = ' ';
            }
            else {
                System.out.print("_");
                updatedName[i] = '_';
            }
        }

        //initial the game
        System.out.println ("Start the game, please guess a letter at a time");
        Scanner scanner1 = new Scanner (System.in);

        // The total point is 10, reduce 1 when guess wrong
        int j=10;

        //create an array to stored the wrong guessed number
        char [] wrongNumber = new char [100];
        //record the wrong guessed number
        int wrong = 0;
        while (j>=0){
            //if any user input are correct, set them to true
            boolean found = false;
            char letter = scanner1.next().charAt(0);

            for (int i=0; i < selectedMovie.length(); i++){
                if (letter == selectedMovie.charAt(i)) {
                    found = true;
                    updatedName[i] = letter;
                }
            }

            //print out the updated movie names
            for (int f=0; f <updatedName.length; f++){
                System.out.print(updatedName[f]);
            }

            //check weather all the letter has been guessed out
            int missingLetter=0;
            for (int i=0; i< updatedName.length; i++) {
                //if there are still missing letter, leave the checking loop
                if (updatedName[i] == '_') {
                    missingLetter++;
                }
            }
            if (missingLetter == 0) {
                System.out.println("you have guessed it correctly！");
                return;
            }

            //if guess wrong
            if (found ==false){
                wrongNumber[wrong] = letter;
                wrong++;
                j--;
                System.out.println("you have guessed ( " + wrong + ") wrong numbers: ");
                for (int e=0; e <wrongNumber.length; e++){
                    System.out.print(wrongNumber[e]);
                }
            }
        System.out.println (" Try it again");
        }
        System.out.println (" Sorry you lose");

    }

}

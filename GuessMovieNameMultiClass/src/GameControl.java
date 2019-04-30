import java.io.File;
import java.util.Scanner;

public class GameControl {
    public static void main (String [] args) throws Exception {
        //read the movie name from the file
        File file = new File("movies.txt");
        Scanner scanner = new Scanner(file);
        //count: the number of the names in the file
        int countMovie = 0;
        //create an array to store the movie
        String[] movieList = new String[100];
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println("The movies include: " + line);
            movieList[countMovie] = line;
            countMovie++;
        }
        System.out.println(countMovie + " movies are in the file");
        //random pick one movie from the pool
        String selectedMovie = movieList[(int)(Math.random() * countMovie)];
        System.out.println("selected movie is " + selectedMovie);


        //run the Game
        Game.GameProcess(selectedMovie);
    }
}

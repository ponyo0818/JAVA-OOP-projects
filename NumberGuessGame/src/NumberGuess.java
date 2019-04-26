/**
 * Created by Yuan 4/26/2019
 */

import java.util.Scanner;

public class NumberGuess {
    public static void main(String [] args){
        int randomNumber = (int)(Math.random() * 100) + 1;
        boolean youWin = false;

        /*initiate the game*/
        System.out.println ("Start the game, please guess a number between 1 and 100");

        Scanner scanner = new Scanner(System.in);
        /*create a loop to test the input and the randomly created number are equal or not*/
        for (int i = 10; i>0; i--) {
            int guess = scanner.nextInt();
            if (randomNumber < guess) {
                System.out.println("It is smaller than " + guess + ". Try it again");
            }
            else if (randomNumber > guess) {
                System.out.println("It is greater than " + guess + ". Try it again");
            }
            else{
                youWin = true;
                break;
            }
        }
        if (youWin) {
            System.out.println("Congratulation! You win");
        }
        else{
            System.out.println("Sorry you lose! :( " + randomNumber + " is the correct answer");
        }
    }
}

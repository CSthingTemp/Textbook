import java.util.Scanner;
import java.util.Random;
 
public class Guess{
    public static void main(String[] args){
        int numToGuess;           //Number the user tries to guess
        int guess;                //The user's guess
        int numOfGuesses=0;         //number of guesses
        
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        
        //randomly generate the  number to guess
        numToGuess=generator.nextInt(10)+1;
        //print message asking user to enter a guess
        System.out.println("Guess a number: ");
        //read in guess
        guess=scan.nextInt();
        while (guess!=numToGuess){  //keep going as long as the guess is wrong
            //print message saying guess is wrong
            System.out.println("That was wrong. Guess again: ");
            numOfGuesses++;
            //get another guess from the user
            guess=scan.nextInt();
        }
        
        //print message saying guess is right
        System.out.println("Yay! That's correct!\nIt only took "+numOfGuesses+" tries!");
    }
}
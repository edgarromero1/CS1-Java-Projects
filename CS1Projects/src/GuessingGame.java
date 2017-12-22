/*
 * author Edgar Romero
 * This program will make the user guess what number it's thinking of
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame{

   public static void main(String args[]){
	   // initiates the random number generator and use inputs
       Random randomGenerator = new Random();
       @SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
       
       // adding plus 1 makes sure 100 is also included
       int numToGuess = 1 + randomGenerator.nextInt(100);
       int guessNumber;
       
       // do while statement initiates the code first then the condition 
       // with all possible outcomes accounted for 
       do {
    	   
    	   System.out.print("Enter your guess (between 1 and 100):");
    	   guessNumber = in.nextInt();
       		
    	   if(guessNumber < 1 || guessNumber > 100)
    		   System.out.println("Invalid guess, try again!");
       		
    	   else if(guessNumber == numToGuess)  
    		   System.out.println("You win!");
       		
    	   else if( guessNumber < numToGuess)
    		   System.out.println("Too low!");
       		
    	   else if( guessNumber > numToGuess)
    		   System.out.println("Too high");
       
       } while(guessNumber != numToGuess);
  
   }
 
}
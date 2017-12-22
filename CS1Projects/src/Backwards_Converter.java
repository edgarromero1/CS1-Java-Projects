/*
 * author Edgar Romero
 * This program will convert inches into yards, feet, and inches
 */
import java.util.Scanner;

public class Backwards_Converter {

	public static void main(String[] args) {
		
		int inches;
		int yards = 36;
		@SuppressWarnings("unused")
		int feet = 12;
		int totalYards;
		int totalFeet;
		int totalInches;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);
		 
		System.out.print("Enter number of inches: ");
		inches = userInput.nextInt();
		
		totalYards = inches/yards;
		totalFeet = (inches-(totalYards*36))/12;
		totalInches = inches % 12;
		
		System.out.println("Yards: "+ totalYards);
		System.out.println("Feet: " + totalFeet);
		System.out.println("Inches: "+ totalInches);
    }
}

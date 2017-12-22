/*
 * author Edgar Romero
 * This program will convert yards, feet, and inches to total inches
 */
import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		
		int yards, feet, inches;
		
		@SuppressWarnings("resource")
		Scanner userInput = new Scanner(System.in);

	      System.out.print("Enter number of yards: ");
	      yards = userInput.nextInt();
	      
	      System.out.print("Enter number of feet: ");
	      feet = userInput.nextInt();
	      
	      System.out.print("Enter number of inches: ");
	      inches = userInput.nextInt();	     
	     
	       int total = (feet*12) + (inches) + yards*3*12;
	     
	      System.out.println("Total number of inches: "+ total);
			}  
	   }

	

	
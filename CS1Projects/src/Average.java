/*
 * author Edgar Romero
 * This program will calculates the average of a stream of non-negative numbers
 */

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		String userChoice; //declare variable to later initialize 
		Scanner sc = new Scanner(System.in);
		
		// with a do while loop it executes the program first then condition 
		do {
			System.out.printf("The average is: %.2f", getAverage(sc)); //prints two decimal place
	        sc.nextLine();
	        System.out.print("\nDo you want to compute another average (y/n)? "); //lets user end or start it 
	        userChoice = sc.nextLine();
	      
	       } while(userChoice.charAt(0) == 'y');
	}
	
	public static double getAverage(Scanner ip) {
		int temp, sum = 0, cnt = 0;
	    double avg;  // declare the double for the average 
	    
	    System.out.print("Enter a stream of non-negative numbers (negative when finished): ");
	    temp = ip.nextInt();
	    
	    //the loop that reads the numbers 
	    while(temp >= 0) {
	           sum += temp; // sum will add all numbers
	           cnt++; //counts
	           temp = ip.nextInt();
	       }
	    
	    avg = sum / (double) cnt; //formula that averages all the numbers 
	    return avg;
	   }
}


			
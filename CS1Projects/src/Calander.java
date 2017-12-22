/*
 * author Edgar Romero
 * This program will give you a calendar 
 */
import java.util.Scanner;

public class Calander {
	
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Ask user for year
		System.out.print("Enter the year: ");
		final int year = input.nextInt();
		
		// Asks user for first day of January
		System.out.print("Enter the day of the week of January 1st (0=Sunday, 1=Monday, ... 6=Saturday): ");
		final int firstDay = input.nextInt();
		
		//Checks to see if year is positive
		if (year <= 0) {
			System.out.println("The year must be positive!");
			System.exit(0);
			}
		//Checks to see if day is valid
		if (firstDay < 0 || firstDay > 6) {
			System.out.println("The day of January 1st must be between 0 and 6!");
			System.exit(0);
			}
		
		//Calls isLeapYear method to check February days
		final int numFebDays;
		if (isLeapYear(year)) {
			numFebDays = 29;
			} 
		else {
				numFebDays = 28;
	       }
		
		//Prints statements include,numOfDays, and the last day of the month according to month 
		int lastDayOfWeek;
		lastDayOfWeek = printMonth("January", firstDay, 31); //User input determines this
		lastDayOfWeek = printMonth("February", lastDayOfWeek, numFebDays); //Check determines this 
		lastDayOfWeek = printMonth("March", lastDayOfWeek, 31); 
		lastDayOfWeek = printMonth("April", lastDayOfWeek, 30);
		lastDayOfWeek = printMonth("May", lastDayOfWeek, 31);
		lastDayOfWeek = printMonth("June", lastDayOfWeek, 30);
		lastDayOfWeek = printMonth("July", lastDayOfWeek, 31);
		lastDayOfWeek = printMonth("August", lastDayOfWeek, 31);
		lastDayOfWeek = printMonth("September", lastDayOfWeek, 30);
		lastDayOfWeek = printMonth("October", lastDayOfWeek, 31);
		lastDayOfWeek = printMonth("November", lastDayOfWeek, 30);
		lastDayOfWeek = printMonth("December", lastDayOfWeek, 31);

	}
	
	//This method checks if the year is a leap year
public static boolean isLeapYear(int year) {
		
	//Algorithm Information taken from Wikipedia 
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		
		return false;
		
}
	//This method is the loop to print the numbers of days in the calender
public static int printMonth(String month, int startDay, int numDays) {
	
	System.out.println(month);
	int dayOfWeek = 7;
      
       // Your code goes here
	System.out.println("S  M  Tu  W  Th  F S "); // Days of the week 
	
	// For loop used to start the days of the week
	for (int i = 0; i < startDay; i++) {  //0=Sunday ... 6=Saturday
		System.out.print("   ");
		dayOfWeek = i;
		} 

	for (int i = 1; i <= numDays; i++) { //number of days in the month
		System.out.printf("%2d ", i); // Format so the days will print correctly 
		
		if (((i + startDay) % 7 == 0) || (i == numDays)) //If remainder 0 or equal to the number of day continue
			System.out.println(" "); 

		dayOfWeek++;
		
		//Starts over the day of week
		if (dayOfWeek%7==0)
			dayOfWeek=0;
		}
	
	return (dayOfWeek+1); 
   }
}
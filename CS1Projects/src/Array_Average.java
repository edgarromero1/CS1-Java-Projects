/* 
 * author Edgar Romero
 * input a sequence of integers (up to 100),
 * output average of integers and those over the average
 */
import java.util.Scanner;

public class Array_Average {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		//Array given how much it can hold 
		int nums[]=new int[100];
		
		
		System.out.print("Enter Sequence of numbers (Type Done when finished): ");
		int count = readIntoArray(input, nums);
		
		System.out.println("The number of integers read in to array is "+count);
		printAboveAverage(nums,count);
	}
	
	/**
	 * Reads all values from the provided scanner
	 * into the supplied array (up to its size)
	 * and returns the number of integers read
	 */
	public static int readIntoArray(Scanner input, int[] nums) {
		int count=0;
		
		for(int i=0;i<100;i++) {
			if(input.hasNextInt()) {
				nums[i]=input.nextInt();
		           count++;
       
			} // end of if statement	
		} // end of for loop
		   return count;
		
	}
	/**
	 * Prints to the screen the average of the supplied array,
	 * up to the supplied size, and all integers in the array, 
	 * again up to the supplied size, that are larger than the average
	 */
	public static void printAboveAverage(int[] nums, int size) {
		int total=0;
		
		for(int i=0;i<size;i++) {
			total=total+nums[i];
	
		} //end of for loop
		
		double average=total/size;
		
		for(int i=0;i<size;i++) {
			if(nums[i]>average) {
				System.out.println("The value greater than average at index "+i+" is "+nums[i]);
		  
			} //end of if statement 
			
		} //end of for loop 
	}
}

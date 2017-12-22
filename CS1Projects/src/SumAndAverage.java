/*
 * author Edgar Romero
 * This program will read 5 numbers and give the sum and average 
 */

import java.util.Scanner;

public class SumAndAverage {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num1,num2, num3, num4, num5, pos_sum = 0, neg_sum =0;
		 double neg_count = 0, pos_count = 0, tot_sum = 0;

		  System.out.print("Enter five whole numbers: ");
		 num1 = input.nextInt();
		 num2 = input.nextInt();
		 num3 = input.nextInt();
		 num4 = input.nextInt();
		 num5 = input.nextInt();

		
		tot_sum = num1 + num2 + num3+ num4 +num5;
	
		 if (num1 < 0)
		 {
		  neg_sum = neg_sum + num1;
		  neg_count = neg_count+ 1;
		 }
		 if(num1 > 0)
		 {
		  pos_sum=pos_sum+num1;
		  pos_count=pos_count+ 1;
		 }
		 
		 if (num2 < 0)
		 {
		  neg_sum = neg_sum + num2;
		  neg_count = neg_count+ 1;
		 }
		 if(num2 > 0)
		 {
		  pos_sum=pos_sum+num2;
		  pos_count=pos_count+ 1;
		 }
		  
		 if (num3 < 0)
		 {
		  neg_sum = neg_sum + num3;
		  neg_count = neg_count+ 1;
		 }
		 if(num3 > 0)
		 {
		  pos_sum=pos_sum+num3;
		  pos_count=pos_count+ 1;
		 }
		 
		 if (num4 < 0)
		 {
		  neg_sum = neg_sum + num4;
		  neg_count = neg_count+ 1;
		 }
		 if(num4 > 0)
		 {
		  pos_sum=pos_sum+num4;
		  pos_count=pos_count+ 1;
		 }
		 if (num5 < 0)
		 {
		  neg_sum = neg_sum + num5;
		  neg_count = neg_count+ 1;
		 }
		 if(num5 > 0)
		 {
		  pos_sum=pos_sum+num5;
		  pos_count=pos_count+ 1;
		 }
		 
		  System.out.println("The sum of positive numbers: "+ pos_sum ); 
		  System.out.println("The sum of non-positive numbers: "+ neg_sum);  
		  System.out.println("The sum of the 5 numbers: "+ tot_sum); 
		  System.out.printf("The average of the positive numbers: %.2f%n" , pos_sum/pos_count); 
		  System.out.printf("The average of the non-positive numbers: %.2f%n", neg_sum/neg_count); 
		  System.out.printf("The average of the 5 numbers: %.2f%n", tot_sum/5); 
		}
	}
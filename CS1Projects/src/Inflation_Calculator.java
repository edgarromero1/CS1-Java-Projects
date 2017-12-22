/*
 * author Edgar Romero
 * This program will give you the price of an item after inflation
 */

import java.util.Scanner;

public class Inflation_Calculator {

	public static void main(String[] args) {
			//Scanner to take input

	       @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);

	       double currentPrice, rate, futurePrice;

	       int years;

	       //do while loop to check negative numbers
	       //take inputs
	       do {

	           System.out.print("Enter the current price of the item: ");
	           currentPrice = in.nextFloat();
	           if (currentPrice < 0)
	               System.out.println("Enter positive value");
	           
	       } while (currentPrice < 0);

	       do {
	    	   
	           System.out.print("Enter the number of years: ");
	           years = in.nextInt();
	           if (years < 0)
	               System.out.println("Enter positive value");

	       } while (years < 0);

	       do {

	           System.out.print("Enter the inflation rate as a percentage: ");
	           rate = in.nextDouble();
	           if (rate < 0)
	               System.out.println("Enter positive value");
	           
	       } while (rate < 0);

	       //initialize futurePrice to currentPrice

	       futurePrice = currentPrice;

	      

	       //calculate increased price of each year

	       for (int i = 1; i <= years; i++) {

	           futurePrice *= (1 + rate / 100);

	       }

	       //round off futurePrice up to 2 decimal place
	       // substitute for writing printf
	       futurePrice = Math.round(futurePrice * 100) / 100.0;

	       //print the future price
	       // if print f was used this will be ... "...the price will be %.2f + futurePrice"
	       System.out.print("After " + years + " years,the price will be $" + futurePrice);

	   }
	}


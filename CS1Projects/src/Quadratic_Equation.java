/*
 * author Edgar Romero
 * This program will solve a quadratic equation
 */

import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			
			System.out.print("Enter the values of a, b and c: ");
			 
	        double a = input.nextDouble();
	        double b = input.nextDouble();
	        double c = input.nextDouble();
	 
	        double r1 = 0;
	        double r2 = 0;
	 
	        double discriminant = b * b - 4 * a * c;
	 
	        if (discriminant > 0){
	 
	            // r = -b / 2 * a;  
	            r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            r2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	 
	            System.out.println("Roots: " + r2 + " and " + r1);
	        }
	 
	 
	        if (discriminant == 0){
	        	r1 = (-b+Math.sqrt(discriminant))/(2*a);
	        	r2 = (-b+Math.sqrt(discriminant))/(2*a);
	        	
	        	System.out.println ("Root: " +r1);
	 
	       
	        }
	 
	        if (discriminant < 0){
	            System.out.println("Roots: imaginary");
	 
	        }
	 
	         
	         
	    }
	 
	}
			
			

		

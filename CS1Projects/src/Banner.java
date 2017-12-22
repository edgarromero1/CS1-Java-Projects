/*
 * author Edgar Romero
 * This program will create a banner with the 7 characters of "Hello World"
 */

import java.util.Scanner;

public class Banner {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		
		//Only the 7 characters will be used for the message 
		System.out.print("Input message: ");
		String myMessage=scan.nextLine();  
			
			int numOfChar=myMessage.length();  // calculate message length
			
			// loop through each character in message
			for(int i=0;i<numOfChar;i++) {
			
			// gets character at position i, and switch accordingly
				switch(myMessage.charAt(i)){
			
			// if character is 'H' or 'h', call method H(). Similarly for other
			// The characters in message.
				case 'H':
				case 'h':H();break;
			
				case 'E':
				case 'e':E();break;
				
				case 'L':
				case 'l':L();break;
			
				case 'O':
				case 'o':O();break;

				case 'W':
				case 'w':W();break;

				case 'R':
				case 'r':R();break;

				case 'D':
				case 'd':D();break;

				case ' ':blank();break;

				}

			}
			
			
				
	}	        
	
	public static void H() //Prints out H
	       {
	           	System.out.println();
	           	System.out.println("*******");
	           	System.out.println("   *   ");
	           	System.out.println("   *   ");
	           	System.out.println("*******");
	           	System.out.println();
	       }
	      
	public static void E() //Prints out E
	       {
	           	System.out.println();
	           	System.out.println("*******");
	           	System.out.println("*  *  *");
	           	System.out.println("*  *  *");
	           	System.out.println("*  *  *");
	           	System.out.println("*  *  *");
	           	System.out.println();
	       }
	      
	public static void L() // Prints out L
	       {
	           	System.out.println();
	        	System.out.println("*******");
	           	System.out.println("*      ");
	           	System.out.println("*      ");
	           	System.out.println("*      ");
	        	System.out.println("*      ");
	        	System.out.println();      
	       }
	      
	public static void O() // Prints out O
	       {
	           	System.out.println();
	           	System.out.println("*******");
	           	System.out.println("*     *");
	           	System.out.println("*     *");
	           	System.out.println("*     *");
	           	System.out.println("*******");
	           	System.out.println();
	       }
	      
	public static void W() // Prints out W
	       {
	           	System.out.println();
	           	System.out.println("*******");
	           	System.out.println("**     ");
	           	System.out.println("  **   ");
	           	System.out.println("**     ");
	           	System.out.println("*******");
	        	System.out.println();
	       }
	      
	public static void R() // Prints out R
	       {
				System.out.println();
				System.out.println("*******");
				System.out.println("   *  *");
				System.out.println(" * *  *");
				System.out.println("*  *** ");
				System.out.println();
	       }
	
	public static void D() // Prints out D
	       {
				System.out.println();
				System.out.println("*******");
				System.out.println("*     *");
				System.out.println("*     *");
				System.out.println(" *   * ");
				System.out.println("  ***  ");
				System.out.println();

	       }
	      
	public static void blank() //prints blank space
	       {
				System.out.println();
				System.out.println();
				System.out.println();
	       }
}

import java.util.Scanner;
public class HelloWorld {
	/**
	 * @author Edgar Romero
	 * Printing Hello World, and Testing Lines
	 */
	
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);

	// This will print out the phrase hello world
	//	System.out.println("Hello World, I'm Edgar!");
	//	System.out.println("One line");
	//	System.out.println("Line Two");
		
		
		
		System.out.print("Input message: ");
		String myMessage=scan.nextLine();  
		
		@SuppressWarnings("unused")
		int numOfChar = myMessage.length();
		int i = 0;
		
		do {
			H();
		
		} while (i >= 0);
		   				    	
		 
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


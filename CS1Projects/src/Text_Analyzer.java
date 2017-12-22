/* 
 * author Edgar Romero
 * User enters a string and the program counts the letters used 
 */

import java.util.Scanner;

public class Text_Analyzer {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter text: ");
		String foo = input.nextLine();
		
		//changes all characters type to lower case 
		foo = foo.toLowerCase();

		//array declared to store count of each character repeat count
		int[] total = new int[(int) Character.MAX_VALUE];
		
		for (int i = 0; i < foo.length(); i++) {
			
			char charAt = foo.charAt(i); //getting individual char from statement
			total[(int) charAt]++; //storing count to char
			
		}
		
		//printing results
		for (int i = 0; i < total.length; i++) {
			
			if (total[i] > 0) {
				System.out.println((char) i + " repeats : " + total[i]);
				
			}
			
		}

	}

}

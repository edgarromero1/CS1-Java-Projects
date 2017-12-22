/* 
 * author Edgar Romero
 * Reads the range of a files
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileRange {

	public static void main(String[] args) throws FileNotFoundException {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the file name: ");
		String fileName = scan.next();
		
		File file = new File(fileName);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		//If file exists enter loop
		if (file.exists()) {
			try {
				@SuppressWarnings("resource")
				Scanner scan1 = new Scanner(file);
				//Process that reads all numbers and assigns max and min
				if (scan1.hasNext()) {
					while (scan1.hasNext()) {
						int n = scan1.nextInt();
						if (min > n) {
							min = n;
						}
						if (max < n) {
							max = n;
						}
					}
					System.out.println("highest number is " + max);
					System.out.println("lowest number is " + min);
				} else {
					System.out.println("File is an empty");
				}
				//Program will exit if file has non-integers 
			} catch (FileNotFoundException ex) {
				System.out.println("File is invalid. File has a a non-integers.");
			}
		} else {
			System.out.println("File does not exist");
		}
	}
}
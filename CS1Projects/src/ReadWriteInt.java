/* 
 * author Edgar Romero
 * Read into a file
 * Write positive into another
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadWriteInt {

	public static void main(String[] args) throws IOException {		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the name of the input file:");
		String inputFile = input.next();
		System.out.print("Enter the name of the output file:");
		String outputFile = input.next();
		File fin = new File(inputFile);
		File fout = new File(outputFile);
		
		// print error, if input file does not exist
		if (!fin.exists()) {
			System.out.println("Error:Input file does not exist");
			System.exit(0);
		}

		// print error, if output file does not exist
		if (!fout.exists()) {
			System.out.println("Error:output file does not exist");
			System.exit(0);
		}

		// input stream to read
		@SuppressWarnings("resource")
		Scanner read = new Scanner(fin);
		OutputStream os = new FileOutputStream(fout);
		// output stream to write
		@SuppressWarnings("resource")
		PrintWriter write = new PrintWriter(os, true);

		// read from input file until there are no numbers
		while (read.hasNextLine()) {
			String num=read.nextLine();
			// convert the string into number
			int number=Integer.parseInt(num);
			// if the number is positive , write it to out put file
			if (number>= 0) {
				write.println(number);
				System.out.println(number);
			}
		}

		System.out.println("Positive numbers copied");

	}

}

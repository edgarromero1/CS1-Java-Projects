import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		// Get word to translate from the user.
		System.out.print("Please enter a word to translate into Pig Latin: ");
		String word = keyboard.nextLine();
		word = word.toLowerCase(); // convert to lower case so that all
									// tests below can be in lower case

		// Determine whether the first character in word is a vowel
		char firstChar = word.charAt(0); // First index is 0
		String vowels = "aeiou";

		// If firstChar is a vowel then indexOf will return at which index
		// it appears in the String vowels, otherwise it returns -1
		int vowelIndex = vowels.indexOf(firstChar);
		boolean firstIsVowel = (vowelIndex >= 0);

		// Print out the word in Pig Latin
		System.out.print("\n\"" + word + "\" in Pig Latin is ");
		// \n is newline character
		// \" is double quote character
		if (firstIsVowel) {
			System.out.println("\"" + word + "-hay\"");
		} else { // first character is consonant, assuming it is a letter
			String restOfWord = word.substring(1); // all but first character
			System.out.println("\"" + restOfWord + "-" + firstChar + "ay\"");
		}

	}
}

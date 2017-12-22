import java.util.Scanner;

/**
 * Program execution point: input two fractions via the keyboard (using the
 * Scanner constructor), output the two fractions, all pairwise {+ - * /}
 * operations, and the first squared minus the second
 * 
 * Author: Edgar Romero
 * 
 */

public class Fraction {
	private int numerator;
	private int denominator;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("=====F1=========");
		Fraction f1 = new Fraction(sc);

		System.out.println("=====F2=========");
		Fraction f2 = new Fraction(sc);

		System.out.println("F1: " + f1.toString());
		System.out.println("F2: " + f2.toString());
		System.out.println("F1+F1" + f1.plus(f1));
		System.out.println("F2+F2: "+ f2.plus(f2));
		System.out.println("F1+F2: " + f1.plus(f2));
		System.out.println("F1-F2: " + f1.minus(f2)); 
	
	}

	private static final String E_DEN_ZERO = "Denominator cannot be zero.";
	private static final String E_DIV_ZERO = "Cannot divide by zero.";

	/**
	 * Returns the greatest common divisor (gcd) of two integers
	 * 
	 * @param num1
	 *            integer 1
	 * @param num2
	 *            integer 2
	 * @return gcd of integers 1 and 2
	 */
	private static int gcd(int num1, int num2) {
		int t;
		while (num2 != 0) {
			t = num2;
			num2 = num1 % num2;
			num1 = t;
		}
		return num1;
	}

	/**
	 * Returns the simplified form of a fraction
	 * 
	 * @param f
	 *            fraction (numerator=[0], denominator=[1])
	 * @return simplified fraction (numerator=[0], denominator=[1])
	 */
	private static int[] simplifyFraction(int[] f) {

		final int gcd = gcd(f[0], f[1]);
		int[] result = { f[0]/gcd, f[1]/gcd };
		if ((result[0] < 0 && result[1] < 0) || (result[1] < 0)) {
			result[0] = -result[0];
			result[1] = -result[1];
		}
		return result;
	}

	/**
	 * Constructs a fraction given a numerator/denominator
	 * 
	 * If denominator = 0, exit with message
	 * 
	 * @param n
	 *            numerator
	 * @param d
	 *            denominator
	 */
	public Fraction(int n, int d) {
		// TODO: write your code here
		if (d == 0) {
			System.out.println(E_DEN_ZERO);
			System.exit(0);
		}
			numerator = n;
	       denominator = d;
	}

	/**
	 * Constructs a fraction as 0/1
	 */
	public Fraction() {
		// TODO: write your code here
		numerator = 0;
		denominator = 1;

	}

	/**
	 * Constructs a fraction given input from a supplied Scanner
	 * 
	 * If denominator = 0, exit with message
	 * 
	 * @param s
	 *            scanner from which to read fraction components
	 */
	public Fraction(Scanner s) {
		// TODO: write your code here
		System.out.print("Enter numerator: ");
		numerator = s.nextInt();

		System.out.print("Enter denominator: ");
		denominator = s.nextInt();

		if (denominator == 0) {
			System.out.println(E_DEN_ZERO);
			System.exit(0);
		}
	}
	
	/**
	 * Gets the decimal value of a fraction
	 * 
	 * @return decimal version
	 */
	public double toDecimal() {
		return (double) numerator / (double) denominator;
	}

	/**
	 * Returns the string value of a fraction: - if denominator is 1,
	 * "numerator" - else, "numerator/denominator (decimal with three decimal
	 * places)"
	 * 
	 * @return string formatted fraction
	 */
	public String toString() {
		String f = "";

		if (denominator == 1)
			f = String.valueOf(numerator);
		else
			f = numerator + "/" + denominator;
		f = f + " (" + String.format("%.3f", toDecimal()) + ")";
		return f;

	}
	/**
	 * Gets the fraction numerator
	 * 
	 * @return numerator
	 */
	public int getNumerator() {
		 return numerator;
	}
	
	/**
	 * Gets the fraction denominator
	 * 
	 * @return denominator
	 */
	public int getDenominator() {
		return denominator;
	}

	/**
	 * Adds a fraction to this fraction
	 * 
	 * @param f
	 *            fraction to add
	 * @return a new fraction that sums this and the supplied parameter
	 */
	public Fraction plus(Fraction f) {
		int num = numerator * f.getDenominator() + f.numerator * denominator;
		int den = denominator * f.denominator;

		int r[] = simplifyFraction(new int[] { num, den });
		return new Fraction(r[0], r[1]);

	}

	/**
	 * Subtracts a fraction from this fraction
	 * 
	 * @param f
	 *            fraction to subtract
	 * @return a new fraction that results from subtracting the supplied
	 *         parameter from this
	 */
	public Fraction minus(Fraction f) {
		int num = numerator * f.getDenominator() - f.numerator * denominator;
		int den = denominator * f.denominator;
		int r[] = simplifyFraction(new int[] { num, den });
		return new Fraction(r[0], r[1]);

	}

	/**
	 * Multiplies a fraction with this fraction
	 * 
	 * @param f
	 *            fraction to multiply
	 * @return a new fraction that is the product of this and the supplied
	 *         parameter
	 */
	public Fraction times(Fraction f) {
		int num = numerator * f.numerator;
		int den = denominator * f.denominator;

		int r[] = simplifyFraction(new int[] { num, den });

		return new Fraction(r[0], r[1]);

	}

	/**
	 * Divides a fraction into this fraction
	 * 
	 * @param f
	 *            fraction with which to divide
	 * @return a new fraction that is the quotient of this and the supplied
	 *         parameter
	 */
	public Fraction divides(Fraction f) {
		int num = numerator * f.denominator;
		int den = denominator * f.numerator;
		int r[] = simplifyFraction(new int[] { num, den });

		return new Fraction(r[0], r[1]);

	}
}
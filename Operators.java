package operators;
// Operators class
public class Operators {

	// Main function to demonstrate operators.
	public static void main(String[] args) {
		
		// Declare variables
		int a = 38, b = 2, isum = 38 + 2, idiff = 38 - 2, 
				iproduct = 38 * 2, iquot = 38 / 2, iremain = 38 % 2;
		String str1 = "Jeremy", str2 = "Gallen";
		
		// Output math
		System.out.println("The sum of a and b is: " + isum);
		System.out.println("The difference of a and b is: " + idiff);
		System.out.println("The product of a and b is: " + iproduct);
		System.out.println("The quotient of a and b is: " + iquot);
		System.out.println("The remainder of a / b is: " + iremain);
		System.out.println("My name is " + str1 + " " + str2 + ".");
		
		// If/else to show which value is greater
		if (a > b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		
		// If/else to show which value is lesser
		if (a < b) {
			System.out.println("a is less than b");
		} else {
			System.out.println("b is less than a");
		}
		
		// If/else to show if values are equal
		if (a == b) {
			System.out.println("a and b are equal");
		} else {
			System.out.println("a and b are unequal");
		}
		
		// If/else to show if values are unequal
		if (a != b) {
			System.out.println("a and b are unequal");
		} else {
			System.out.println("a and b are equal");
		}
		
		// If/else to demonstrate && operator
		if (a > b && isum < idiff) {
			System.out.println("a is greater than b and their sum is less than their difference");
		} else {
			System.out.println("both conditions have not been satisfied");
		}
		
		// If/else to demonstrate || operator
		if (a < b || isum > idiff) {
			System.out.println("a is less than b or their sum is greater than their difference");
		} else {
			System.out.println("neither or condition has been satisfied");
		}
		
		// Ternary operator demonstration
		System.out.println(a >= b ? "a is greater than b" : "a is not greater than b");
	}
}

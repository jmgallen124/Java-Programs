// Import package
package flow_control;

// Flow control class
public class flow_control {

	// Main function
	public static void main(String[] args) {
		
		// Declare variables
		int x = 1, y = 2, z = 3, countdown = 10;
		
		// Output variables
		System.out.println("x is equal to " + x);
		System.out.println("y is equal to " + y);
		System.out.println("z is equal to " + z + "\n");
		
		// If/else to check size
		if(x > y && x > z) {
			System.out.println("x is greater than y and z\n");
		} else if(y > x && y > z) {
			System.out.println("y is greater than x and z\n");
		} else if(z > x && z > y) {
			System.out.println("z is greater than x and y\n");
		} else {
			System.out.println("Two or more of the values are equal.\n");
		}
		
		// While statement
		while(countdown >= 0) {
			
			// Output current number
			System.out.println(countdown);
			
			// Decrement variable
			countdown--;
		}
		
		// Print "Blast-off!"
		System.out.println("Blast-off!\n");
		
		// Demonstrate for loop
		for(int i = 0; i <= 10; i++) {
			
			// Output number
			System.out.println(i);
		}
		
		// Print "Ready or not, here I come!"
		System.out.println("Ready or not, here I come!\n");
		
		
		
		// Nested for loop to print stairs
		for(int j = 0; j <= 10; j++) {
			
			// Print a line
			for(int k = 0; k <= j; k++) {
				
				// Print a J
				System.out.print("J");
			}
			
			// Advance to next line
			System.out.println();
		}
	}

}

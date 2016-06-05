package cs368JavaTutorial;

/* http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/Java_vs.html#youTry2
 * 
 * Write a complete Java program that uses a loop to sum the numbers from 1 to
 * 10 and prints the result like this:
 * 
 * The sum is: xxx
 * 
 * Note: Use variable declarations, and a for or while loop with the same syntax as in C++.
 * Make sure that you are able to compile and execute your program!
 *
 */

public class TestYourself1_2 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int x = 1; x < 11; x++) {
			sum += x;
			System.out.println("x: " + x);
		}
		
		System.out.println("sum is: " + sum);	
		TestYourself1_2_1.test();
	}
}
package cs368JavaTutorial;

import cs368JavaTutorial.TestYourself2_1;

public class TestYourself2 {

	/*
	 * print the sum of integers between 0 and 10
	 */
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int x = 1; x < 11; x++) {
			sum += x;
			System.out.println("x: " + x);
		}
		
		System.out.println("sum is: " + sum);
	
		TestYourself2_1.test();
	}
}

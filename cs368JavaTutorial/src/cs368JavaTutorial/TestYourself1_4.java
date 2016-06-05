package cs368JavaTutorial;

/*
 * http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/Java_vs.html#youTry4
 * 
 */

import cs368JavaTutorial.TestYourself1_3;

public class TestYourself1_4 {

	public static void main(String[] args) {
		int[] A = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
		int[] B = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.print("array 1: ");
		TestYourself1_3.print_array(A);
		System.out.println("");

		System.out.print("array 2: ");
		TestYourself1_3.print_array(B);
		System.out.println("");

		System.arraycopy(A, 0, B, 5, 5);

		System.out.print("array 2 (after copy): ");
		TestYourself1_3.print_array(B);
		System.out.println("");

		int[] A1; // null pointer; pic 9
		int[] A2 = new int[4]; // pointer to the array of size 4 with default
								// values - zeros; pic 6
		int[][] A3 = new int[4][3]; // pointer to the array of size 4x3 with
									// zeros; pic 3

		int[][] A4 = new int[4][];
		A4[1] = new int[4];
		A4[3] = new int[2];
		// pic 1

		int[] A5 = new int[4];
		int[] B5 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.arraycopy(B5, 2, A5, 0, 4);
		// pic 14

		int[] A6 = new int[4];
		int[] B6 = { 2, 3, 4 };
		System.arraycopy(B6, 0, A6, 0, 4);
		// runtime error

		int[] A7 = new int[4];
		int[] B7 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.arraycopy(B7, 8, A7, 0, 4);
		// runtime error

		int[] A8 = { 1, 1, 1, 1 };
		int[] B8 = { 2, 2, 2 };
		System.arraycopy(A8, 0, B8, 1, 2); // B8 {2,1,1}
		System.arraycopy(B8, 0, A8, 0, 3); // A8 {2,1,1,1}
		// pic 12

		int[] A9 = new int[4];
		int[] B9 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.arraycopy(B9, 0, A9, 0, 10);
		// runtime error

		int[][] A10 = new int[4][3];
		int[] B10 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.arraycopy(B10, 0, A10[0], 0, 3); // A10[0] = {1,2,3}
		System.arraycopy(B10, 1, A10[1], 0, 3); // A10[1] = {2,3,4}
		System.arraycopy(B10, 2, A10[2], 0, 3); // A10[2] = {3,4,5}
		System.arraycopy(B10, 3, A10[3], 0, 3); // A10[3] = {4,5,6}
		// pic 10
	}

}

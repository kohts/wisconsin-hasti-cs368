package cs368JavaTutorial;

/*
 * http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/Java_vs.html#youTry3
 * 
 * Write a Java function called NonZeros, using the header given below. NonZeros
 * should create and return an array of integers containing all of the non-zero values
 * in its parameter A, in the same order that they occur in A.
 * 
 * 		public static int[] NonZeros( int [] A )
 * 
 * Write a complete Java program that includes a main function as well as the NonZeros function.
 * The main function should test NonZeros by creating several arrays, and calling NonZeros with each array.
 * It should print the array it passes to NonZeros as well as the returned array. So for example,
 * when you run your program, your output might look like this (if your NonZeros function
 * is implemented correctly):
 * 		    passing [0,1,2,3,2] got back [1,2,3,2]
 * 			passing [0,0] got back []
 * 			passing [22,0,-5,0,126] got back [22,-5,126]
 * 			passing [1,0] got back [1]
 * 
 */

import cs368JavaTutorial.StringDump;

public class TestYourself1_3 {

	public static int[] NonZeros(int[] A) {
		int[] out;

		out = new int[A.length];

		int in_pos = 0;
		int out_pos = 0;

		for (; in_pos < A.length; in_pos++) {
			if (A[in_pos] != 0) {
				out[out_pos] = A[in_pos];
				out_pos++;
			}
		}

		int[] out_resized;
		out_resized = new int[out_pos];

		for (in_pos = 0; in_pos < out_pos; in_pos++) {
			out_resized[in_pos] = out[in_pos];
		}

		return out_resized;
	}

	public static void print_array(int[] A) {
		int i = 0;

		System.out.print("[");
		for (; i < A.length; i++) {
			System.out.print(A[i]);
			if (i < A.length - 1) {
				System.out.print(",");
			}
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		int[] A = { 1, 2, 3, 0, 23 };
		int[] A_out = NonZeros(A);
		System.out.println("array 1");
		System.out.println(StringDump.dump(A));
		System.out.println(StringDump.dump(A_out));

		int[] B = { 0, 0 };
		int[] B_out = NonZeros(B);
		System.out.println("array 2");
		System.out.println(StringDump.dump(B));
		System.out.println(StringDump.dump(B_out));

		int[] C = { 1, 0 };
		int[] C_out = NonZeros(C);
		System.out.println("array 3");
		System.out.println(StringDump.dump(C));
		System.out.println(StringDump.dump(C_out));

		int[] D = {22, 0, -5, 0, 126};
		int[] D_out = NonZeros(D);
		
		System.out.print("passing ");
		print_array(A);
		System.out.print(" got back ");
		print_array(A_out);
		System.out.println("");

		System.out.print("passing ");
		print_array(B);
		System.out.print(" got back ");
		print_array(B_out);
		System.out.println("");

		System.out.print("passing ");
		print_array(C);
		System.out.print(" got back ");
		print_array(C_out);
		System.out.println("");
		System.out.print("passing ");

		print_array(D);
		System.out.print(" got back ");
		print_array(D_out);
		System.out.println("");
	}
}

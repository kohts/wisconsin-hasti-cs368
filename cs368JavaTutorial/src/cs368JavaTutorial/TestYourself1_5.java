package cs368JavaTutorial;

import cs368JavaTutorial.TestYourself1_3;

public class TestYourself1_5 {

	public static void main(String[] args) {
		int[] A = {1,2,3};
		int[] B = {0,0};
		
		TestYourself1_3.print_array(A);
		System.out.println();
		TestYourself1_3.print_array(B);
		System.out.println();
		
		B = A;
		TestYourself1_3.print_array(A);
		System.out.println();
		TestYourself1_3.print_array(B);
		System.out.println();
		
		B[0] = 6;
		TestYourself1_3.print_array(A);
		System.out.println();
		TestYourself1_3.print_array(B);
		System.out.println();
		
		//int[] C, D;
		//D = 0;
		
		//int [] E;
	    //E[0] = 0;
		
		int [] F = new int[20];
	    int [] G = new int[10];
	    F = G;
	    F[15] = 0;
	}

}

package cs368JavaTutorial;

import cs368JavaTutorial.StringDump;

public class TestYourself3 {

	public static int[] NonZeros(int [] A) {
		int [] out;
		
		out = new int[A.length];

		int i = 0;
		int j = 0;
		
		for (; i < A.length; i++) {
			if (A[i] != 0) {
				out[j] = A[i];
				j++;
			}
		}
		
		int [] out_resized;
		out_resized = new int[j];

		i = 0;
		for (; i < j; i++) {
			out_resized[i] = out[i];
		}
		
		return out_resized;
	}
	
	public static void main(String[] args) {
		int [] A = {1, 2, 3, 0, 23};
		int [] A_out = NonZeros(A);		
		System.out.println(StringDump.dump(A));
		System.out.println(StringDump.dump(A_out));
		
	    int[] B = {0,0};
	    int[] B_out = NonZeros(B);
		System.out.println(StringDump.dump(B));
		System.out.println(StringDump.dump(B_out));
	    
	    int[] C = {1,0};
	    int[] C_out = NonZeros(C);
		System.out.println(StringDump.dump(C));
		System.out.println(StringDump.dump(C_out));
	}
}

package cs368JavaTutorial;

public class TestYourself2_1 {
	
	static void test() {
		
		boolean a = false;
		char b = 'x';
		byte c = (byte) (Math.pow(2, 7) - 1);
		short d = (short) (Math.pow(2, 15) - 1);
		int e = (int) (Math.pow(2, 31) - 1);
		long f = (long) (Math.pow(2, 63) - 1);
		float g = (float) 2/3;
		double h = (double) 2/3;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println(g);
		System.out.println(h);
		
		char [] a1;
		a1 = new char[10];
		a1[0] = 50;
		a1[1] = 32;
		a1[2] = 49;
		System.out.println(a1);

		char [] a2 = {50, 32, 49};
		System.out.println(a2);
		
		int [] a3;
		a3 = new int[10];
		a3[0] = 0;
		
		System.out.println(a3.length);
	}
}

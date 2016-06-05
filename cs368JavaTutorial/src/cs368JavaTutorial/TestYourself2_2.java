package cs368JavaTutorial;

import java.lang.String;

public class TestYourself2_2 {

	public static void main(String[] args) {
		if (args.length > 0) {
			System.out.println(args[0]);
		}
	}
}

class Test {
	static void Swap(Integer j, Integer k) {
		int tmp = k.intValue(); // 6
		k = new Integer(j.intValue()); // 5
		j = new Integer(tmp); // 6
	}

	public static void main(String[] args) {
		Integer n = new Integer(5), m = new Integer(6);
		Swap(n, m);
		System.out.println("n = " + n + "; m = " + m);
	}
}

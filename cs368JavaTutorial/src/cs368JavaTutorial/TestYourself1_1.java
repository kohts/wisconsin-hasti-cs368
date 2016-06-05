package cs368JavaTutorial;

/*
 * http://pages.cs.wisc.edu/~hasti/cs368/JavaTutorial/NOTES/Java_vs.html#youTry1
 * operator precedence + delayed evaluation of operators + implicit casts
 */

public class TestYourself1_1 {
	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(x + y);
		System.out.println(x + y + "!");
		System.out.println("printing: " + x + y);
		System.out.println("printing: " + (-1) * x + y);
		System.out.println("printing: " + (x + y));
		System.out.println("printing: " + x * y);
	}
}

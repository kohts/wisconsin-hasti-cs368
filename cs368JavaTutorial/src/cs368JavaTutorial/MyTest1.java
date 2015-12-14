package cs368JavaTutorial;

public class MyTest1 {

	public static String getHandle() {
		return null;
	}
	
	public static void main(String[] args) {
		
		String test = null;
		
		if (test != null) {
			test = ":b:" + test;
			System.out.println(test);
		}
		else {
			System.out.println("boo");
		}
	}

}

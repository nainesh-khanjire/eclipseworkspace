package practice;

public class TryCatch1 {
	public static void main(String[] args) {

		try {

			int a = 10 / 0; // this will throw an exception
		}

		// handling the above exception
		catch (ArithmeticException e) {

			System.out.println(e);
		}

		System.out.println("print rest of the code");

	}
}

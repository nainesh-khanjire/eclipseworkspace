
public class TryCatch {

	public static void main(String[] args) {

		/*
		 * 1) Write a program to demonstrate the use of try, catch, finally throw and
		 * throws keywords and demonstrate the following points in the program. a)
		 * Multiple catch blocks. b) try-catch-finally combination. c) try-finally
		 * combination. d) Nested try blocks
		 */

		System.out.println("a) multiple catch blocks >>");
		// a) multiple catch blocks

		try {
			int a = 5;
			int b = 0;

			int c = a / b; // this creates error

		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception displayed: " + e); // displays error

		} catch (ArrayIndexOutOfBoundsException i) {
			System.out.println("array exception displayed :" + i);

		} catch (Exception x) {
			System.out.println("Exception displayed: " + x);
		}
		System.out.println("rest of the code"); // this print stmt gets executed

		System.out.println("\n\nb) try-catch-finally combination >>");
		// b) try-catch-finally combination
		try {

		} catch (ArithmeticException a) {

		}

		// c) try-finally combination

		// d) Nested try blocks

	}

}

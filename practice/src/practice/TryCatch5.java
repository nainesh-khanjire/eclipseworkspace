package practice;

public class TryCatch5 {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		try {
			int c = a / b; // throws error

		}

		catch (Exception e) {

			System.out.println("displaying error " + e);
			int c1 = a / b;

		}

		catch (Exception d) {
			System.out.println("displaying error: " + d);
		}

		System.out.println("prints rest of the code");

	}

}

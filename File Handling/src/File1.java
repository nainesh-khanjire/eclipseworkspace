import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File1 {

	public static void main(String... args) {

		// code to crate new file

		File myFile = new File("D:file1.txt");
		try {
			myFile.createNewFile();
		} catch (IOException e) {
			System.out.println("unable to create new file");
			e.printStackTrace();
		}
		
		
		// code to write to the file

		try { // wrapping the file write code into the try catch exception block
			FileWriter fw = new FileWriter("D:file1.txt");
		fw.write("this is first line from file1.txt file\nthis is second line from file1.txt file");
		fw.close();
			
			
		} catch (IOException e) {

			System.out.println("unable to write to the file");
			e.printStackTrace();
		}

	}

}

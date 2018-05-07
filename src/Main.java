import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.swing.JLabel;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
		 System.out.println("Enter the paths for the input and output files");
		 Scanner inputPath = new Scanner(System.in);
		 Scanner outputPath = new Scanner(System.in);
		 String inputPathString = new String (inputPath.nextLine());
		 String outputPathString = new String (outputPath.nextLine());
		 outputPath.close();
		 inputPath.close();
		 System.out.println(inputPathString);
		 System.out.println(outputPathString);
	}
	
}

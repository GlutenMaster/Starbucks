import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import expressions.ArithmeticExpressions;
import helper.Keyword;

public class ScanCompile extends Main{
	public ScanCompile(Path filepath){
		try {
			BufferedReader fileScan = Files.newBufferedReader(filepath);
			String line = fileScan.readLine();
			while (line != null) {
				parseLine(line);
				line = fileScan.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void parseLine(String line) {
		for (int x = line.split(" ").length -1; x>= 0; x--) {
			String temp = line.split(" ")[x];
			if (temp.equals("+") || temp.equals("*") || temp.equals("/") || temp.equals("-")) {
				if (line.split(" ")[x-1].contains(".") && line.split(" ")[x+1].contains(".")) {
					ArithmeticExpressions ar = new ArithmeticExpressions(Double.valueOf(line.split(" ")[x-1]), Double.valueOf(line.split(" ")[x+1]), temp.toCharArray()[0]);
					Main.print(String.valueOf(ar.getValue()));
				}
				else {
					ArithmeticExpressions ar = new ArithmeticExpressions(Math.floor(Double.valueOf(line.split(" ")[x-1])), Math.floor(Double.valueOf(line.split(" ")[x+1])), temp.toCharArray()[0]);
					Main.print(String.valueOf(ar.getValue()));
				}
			}
			//Keyword.KeyWordChecker(temp);
		}
	}
	 
}

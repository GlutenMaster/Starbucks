package main;
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
import expressions.PrintFunction;
import helper.Keyword;

public class ScanCompile extends Main{
	public ScanCompile(String input) {
		/*String line = input;
		while (line != null) {
			parseLine(line);
			line = input;
		}*/
	}
	public void parseLine(String line) {
		if (line.contains("print")) {
			PrintFunction.ePrinter(line);
		}
		else if (line.contains(null)) {
			Main.print("please enter a command");
		}
		else if(line.contains("+") || line.contains("-") || line.contains("*") || line.contains("/") ) {
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
			}
	}
		Keyword.KeyWordChecker(line);
	}
}

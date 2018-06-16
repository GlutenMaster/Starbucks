package expressions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import main.Main;

public class PrintFunction {

    public static void dPrinter(String line) {
        	String[] output1 = null;
        	List<String> itemList = null;
        			line.split(" "); 
        			for (int x = line.split(" ").length; x>= 0; x--) {
        				output1 = line.split(" ");
        				itemList = Arrays.asList(output1);
        			}
        	    	for (int v=0; v<itemList.size(); v++) {
        	    		Main.linePrint(itemList.get(v).toString().replace("print", "").replace(",", "").replace("[", "").replace("]", ""));
        	    		Main.linePrint(" ");
        	    	} 
        }
    public static void ePrinter(String line)
    {
    	String[] test = line.split(" ");
    	
    	for(int i = 1; i < test.length; i++)
    	{
    		Main.linePrint(test[i] + " ");
    	}
    	Main.print("\n");
    }
    
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScanCompile extends Main{
	public static ArrayList<String> adapterlist;
    public static void pathDescitsion(String input) throws FileNotFoundException {
    	Scanner adapter = new Scanner(new File(input));
        adapterlist = new ArrayList<String>();
        while (adapter.hasNext()){
            adapterlist.add(adapter.nextLine());
            }
        }
        
    public static void dPrinter() throws FileNotFoundException, UnsupportedEncodingException{
        	String[] output1 = null;
        	List<String> itemList = null;
        	for (int i = 0;i < adapterlist.size(); i++){
        		if (adapterlist.get(i).contains("dPrint")) {
        			adapterlist.get(i).split(" "); 
        			for (int x = adapterlist.get(i).split(" ").length; x>= 0; x--) {
        				output1 = adapterlist.get(i).split(" ");
        				itemList = Arrays.asList(output1);
        			}
        			System.out.println();
        			PrintWriter writer = new PrintWriter("C:\\Users\\maxen\\Desktop\\Output.txt", "UTF-8");
        	    	for (int v=0; v<itemList.size(); v++) {
        	    		writer.print(itemList.get(v).toString().replace("dPrint", "").replace(",", "").replace("[", "").replace("]", ""));
        	    		writer.print(" ");
        	    	}    	
        	    	writer.close();
        		}
            }	
        }
}

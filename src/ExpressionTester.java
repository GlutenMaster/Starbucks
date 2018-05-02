import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ExpressionTester {
	public static ArrayList<Character> operatorlist;
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    	
    	Scanner adapter = new Scanner(new File("C:\\Users\\maxen\\Desktop\\HelloWorld.txt"));
        operatorlist = new ArrayList<Character>();
        while (adapter.hasNext()){
            operatorlist.addAll((Collection<? extends Character>) adapter.nextLine().chars());
        }
        dPrinter();
        
    }
    public static void dPrinter() throws FileNotFoundException, UnsupportedEncodingException{
    	String[] output1 = null;
    	List<String> itemList = null;
    	for (int i = 0;i < operatorlist.size(); i++){
    		Character temp = operatorlist.get(i);
    		if (temp.equals('-') || temp.equals('+') || temp.equals('*') || temp.equals('/')) {
    			
    		}
        }	
    }
}
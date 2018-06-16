package helper;


import java.lang.reflect.Array;

import expressions.ArithmeticExpressions;
import expressions.PrintFunction;
import main.Main;

public class Keyword extends Main{
	
public static void KeyWordChecker(String str){
	
	for(String string: keyArray) {
		if(str.equals(string)) {
			keyScanOp(string);
		}
	}
}
public static Object keyScanOp(String string) {
	switch(string) {
		case "class":
			Main.print("Not yet implemented");
		case "static":
			Main.print("Not yet implemented");
		case "funk":
			Main.print("Not yet implemented");
		case "vfunk":
			Main.print("Not yet implemented");
		case "new":
			Main.print("Not yet implemented");
	}
	return null;
}
private enum Keywords {
	CLASS,
	STATIC,
	FUNCTION,
	VOID_FUNCTION,
	PRINT,
	PRINT_LINE,
	NEW,
	FOR_LOOP,
	WHILE_LOOP,
	IF_STATEMENT,
	ELIF_STATEMENT,
	ELSE_STATEMENT,
	SWITCH_STATEMENT,
	CASE_STATEMENT,
	ADD,
	SUBTRACT,
	MULTIPLY,
	DIVIDE,
	OPEN_ARGUMENTS,
	CLOSE_ARGUMENTS,
	OPEN_CODE_BLOCK,
	END_CODE_BLOCK,
	END_LINE
}

	public static String[] keyArray = {
		"class",
		"static",
		"funk",
		"vfunk",
		"print",
		"new",
		"for",
		"while",
		"if",
		"elif",
		"else",
		"switch",
		"case",
		"+",
		"-",
		"*",
		"/",
		"(",
		")",
		":",
		";",
		"\n"
	};

	
}

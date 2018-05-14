package helper;

import java.lang.reflect.Array;

import expressions.ArithmeticExpressions;

public class Keyword {
	
/*public static String KeyWordChecker(String str){
	for(String string: keyArray) {
		if(str.equals(string)) {
			keyScanOp(string);
		}
	}
}
public Object keyScanOp(String string) {
	switch(string) {
		case "+":
			new ArithmeticExpressions ('+');
		case "-":
			
		
	}
}*/
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

	static String[] keyArray = {
		"class",
		"static",
		"funk",
		"vfunk",
		"println",
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

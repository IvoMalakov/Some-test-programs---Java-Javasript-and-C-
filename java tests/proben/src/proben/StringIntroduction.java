package proben;

import java.io.*;
import java.util.*;

public class StringIntroduction {
	
	private static String checkLexicogphy(String A, String B) {
		String result = "No";
		
		int compare = A.compareTo(B);
		
		if (compare > 0) {
			result = "Yes";
		}
		
		return result;
	}
	
	private static String capitalizeString(String inputString) {
		String first = inputString.substring(0,1);
		String second = inputString.substring(1);
		
		String result = first.toUpperCase() + second;
		return result.trim();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String A = scanner.nextLine();
		String B = scanner.nextLine();
		scanner.close();
		
		int stringLengthSum = A.length() + B.length();
		System.out.println(stringLengthSum);
		
		String lexicogrphyGreater = checkLexicogphy(A, B);
		
		switch(lexicogrphyGreater) {
			case "Yes" : System.out.println("Yes"); break;
			case "No" : System.out.println("No"); break;
			default: lexicogrphyGreater = checkLexicogphy(A, B); break;
		}
	
		String ACapitalize = capitalizeString(A);
		String BCapitalize = capitalizeString(B);
		System.out.println(ACapitalize + " " + BCapitalize);
	}

}

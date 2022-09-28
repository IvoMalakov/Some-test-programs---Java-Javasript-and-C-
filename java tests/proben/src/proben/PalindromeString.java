package proben;

import java.io.*;
import java.util.*;

public class PalindromeString {
	
	private static boolean checkString(String A) {
		StringBuilder sb = new StringBuilder();
		char[] AAsCharArray = A.toCharArray();
		int ALength = AAsCharArray.length;
		
		for (int i = ALength - 1; i >= 0; i--) {
			sb.append(AAsCharArray[i]);
		}
		
		String result = sb.toString();
		
		if (result.compareTo(A) == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String A = sc.next();
	    sc.close();
	    
	    boolean palindrome = checkString(A);
	    String result = palindrome ? "Yes" : "No";
	    
	    System.out.println(result);
	}

}

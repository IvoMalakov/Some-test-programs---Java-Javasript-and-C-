package proben;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String s = scan.nextLine();
	    
	    String[] tokens = s.split("[^A-Za-z]");
	    int numberOftokens = 0;
	    
	    for(int i = 0; i < tokens.length; i++) {
	    	if (tokens[i].length() > 0) {
	    		numberOftokens++;
	    	}
	    }
	    
	   System.out.println(numberOftokens);
	   
	   for (String st: tokens) {
		   if (st.length() > 0) {
			   System.out.println(st);
		   }
	   }
	    
	    scan.close();
	}

}

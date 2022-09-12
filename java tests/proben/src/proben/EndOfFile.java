package proben;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndOfFile {

	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		String inputLine;
		
		while(scanner.hasNextLine()) {
			inputLine = scanner.nextLine();
			count++;
			System.out.printf("%d %s", count, inputLine);
			System.out.println();
		}
	}

}

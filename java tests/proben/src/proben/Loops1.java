package proben;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops1 {

	public static void main(String[] args) {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	     try {
			int N = Integer.parseInt(bufferedReader.readLine().trim());
			
			for(int i = 1; i <= 10; i++) {
				int result = N * i;
				System.out.printf("%d x %d = %d\n", N, i, result);
			}
			
		} catch (NumberFormatException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	     try {
			bufferedReader.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}

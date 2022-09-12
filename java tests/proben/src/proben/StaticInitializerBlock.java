package proben;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StaticInitializerBlock {
	
	private static int B;
	private static int H;
	private static boolean flag;
	
	static {
		Scanner scanner = readInputValues();	
		chechInputValues();		
		scanner.close();
	}

	private static void chechInputValues() {
		try {
			if ((B > 0) && (H >0)) {
				flag = true;
			}
			
			else {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			}
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
	}

	private static Scanner readInputValues() {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		return scanner;
	}
	
	public static void main(String[] args) {
		
		if(flag) {
			int area=B*H;
			System.out.print(area);
		}
	}

}

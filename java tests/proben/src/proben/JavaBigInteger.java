package proben;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine1 = scanner.nextLine();
		String inputLine2 = scanner.nextLine();
		scanner.close();
		
		BigInteger a = new BigInteger(inputLine1);
		BigInteger b = new BigInteger(inputLine2);
		
		BigInteger sum = a.add(b);
		BigInteger mult = a.multiply(b);
		
		System.out.println(sum);
		System.out.println(mult);
	}
}

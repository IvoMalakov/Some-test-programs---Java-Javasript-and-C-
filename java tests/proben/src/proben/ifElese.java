package proben;

import java.util.Scanner;

public class ifElese {
	private static final Scanner scanner = new Scanner(System.in);
	
	private static boolean isEvenNumber(int n) {
		boolean isEven = false;
		
		if(n % 2 == 0) {
			isEven = true;
		}
		
		return isEven;
	}

	public static void main(String[] args) {
		 int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        scanner.close();
	        
	        if ((!isEvenNumber(N)) || (N >= 6 && N<= 20)) {
	        	System.out.println("Weird");
	        }
	        else if ((N >= 2 && N<=5) || (N > 20)) {
	        	System.out.println("Not Weird");
	        }
	}

}

package proben;

import java.util.*;

public class Java1DArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] a = new int[n];

		for (int j = 0; j < a.length; j++) {
			a[j] = scan.nextInt();
		}

		scan.close();

		
		 for (int i = 0; i < a.length; i++) { 
			 System.out.println(a[i]); 
		 }
	}
}

package proben;

import java.util.Scanner;

public class JavaAnagrams {
	
	private static char[] sortArray(char[] a) {		
		char temp;
		int i = 0;
		
		while (i < a.length) {
			int j = i + 1;
			
			while (j < a.length) {
				if (a[j] < a[i]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}			
				j++;
			}			
			i++;
		}
		
		return a;
	}
	
	private static boolean checkArraysEquals(char[] a, char[] b) {
		boolean result = true;
		int aLength = a.length;
		int bLength = b.length;
		
		if (aLength == bLength) {
			for (int i = 0; i < aLength; i++) {
				if (a[i] != b[i]) {
					result = false;
				}
			}
		}
		
		return result;		
	}
	
	private static boolean isAnagram(String a, String b) {
		boolean result = false;
		
		String a1 = a.toLowerCase();
		String b1 = b.toLowerCase();
		
		if (a1.length() == b1.length()) {
			char[] a1AsCharArray = a1.toCharArray();
			char[] b1AsCharArray = b1.toCharArray();
			
			char[] a1Sorted = sortArray(a1AsCharArray);
			char[] b1Sorted = sortArray(b1AsCharArray);
			
			result = checkArraysEquals(a1Sorted, b1Sorted) ? true : false;
		}
		
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

}

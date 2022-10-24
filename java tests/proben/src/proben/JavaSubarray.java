package proben;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = readInput(scanner);
		
		int count = findNumberOfNegativeSubarrays(array);
		System.out.println(count);

	}
	
	private static int findNumberOfNegativeSubarrays(int[] array ) {
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			int sum = 0;
			
			for (int j = i; j < array.length; j++) {
				sum += array[j];
				count = sum < 0 ? count + 1 : count;
			}
		}
		
		return count;
	}

	private static int[] readInput(Scanner scanner) {
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		return array;
	}

}

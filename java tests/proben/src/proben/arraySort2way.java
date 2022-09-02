package proben;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class arraySort2way {
	
	private static int sumOfDigit(int n) {
		int sum = 0;
		
		while (n > 0) {
			sum += n % 10;
			n = Math.floorDiv(n,10);
		}
		return sum;
	}
	
	private static int[] sortArray(int[] unsortedArray, int arrayLength) {
		int[] sortedArray = new int[arrayLength];
		ArrayList<ArrayList<Integer>> vp = new ArrayList<ArrayList<Integer>>();
	    
	     for (int i = 0; i < arrayLength; i++) {
	    	 ArrayList<Integer> temp = new ArrayList<Integer>();
	    	 int a = unsortedArray[i];
	    	 temp.add(sumOfDigit(a));
	    	 temp.add(a);
	    	 vp.add(temp);
	     }
	     
	     Collections.sort(vp, new Comparator<ArrayList<Integer>>(){
		      @Override
		      public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
		        return o1.get(0) - o2.get(0);
		      }
	     });
	     
	     for (int j = 0; j < arrayLength; j++) {
	    	 sortedArray[j] = vp.get(j).get(1);
	     }
		
		return sortedArray;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputLine = scanner.nextLine().split("\\s+");
		scanner.close();
		
		int arrayLength = inputLine.length;
		int[] unsortedArray = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; i++) {
			unsortedArray[i] = Integer.parseInt(inputLine[i]);
		}
		
		int[] sortedArray = sortArray(unsortedArray, arrayLength);
		
		for (int j = 0; j < arrayLength; j++) {
			System.out.printf("%d ", sortedArray[j]);
		}
	}

}

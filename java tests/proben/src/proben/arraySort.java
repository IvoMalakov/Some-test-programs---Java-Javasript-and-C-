package proben;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;

public class arraySort {
	
	private static int sumOfDigit(int n) {
		int sum = 0;
		
		while (n > 0) {
			sum += n % 10;
			n = Math.floorDiv(n,10);
		}
		return sum;
	}
	
	private static ArrayList<ArrayList<Integer>> sortArray(ArrayList<Integer> arrayList)
	  {
	 
	    ArrayList<ArrayList<Integer>> vp = new ArrayList<ArrayList<Integer>>();
	    
	    for (int i = 0; i < arrayList.size(); i++) {
	      ArrayList<Integer> temp = new ArrayList<Integer>();
	      int a = arrayList.get(i);
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
	    
	    return vp;
	  }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputLine = scanner.nextLine().split("\\s+");
		scanner.close();
		
		ArrayList<Integer> inputList = new ArrayList<Integer>();
		
		for (String string : inputLine) {
			int number = Integer.parseInt(string);
			inputList.add(number);
		}
		
		ArrayList<ArrayList<Integer>> outputList = sortArray(inputList);
		
		for (ArrayList<Integer> list : outputList) {
			System.out.printf("%d ", list.get(1));
		}

	}
}

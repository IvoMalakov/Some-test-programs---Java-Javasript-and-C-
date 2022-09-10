package proben;

import java.util.*;

public class Loops2 {
	
	private static ArrayList<Integer> findNumbers(int a, int b, int n) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		 int x = 1;
         int temp = a;
         
         for (int j = 1; j <= n; j++) {
         	temp += (x * b);
         	list.add(temp);
         	x *= 2;
         }
         
         return list;
	}
	
	private static void printResult(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.printf("%d ", i);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[][] tNumbers = new int[t][];
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            tNumbers[i] = new int[3];
            tNumbers[i][0] = a;
            tNumbers[i][1] = b;
            tNumbers[i][2] = n;
        }
        
        in.close();
        
        for (int j = 0; j < t; j++) {
        	int a = tNumbers[j][0];
        	int b = tNumbers[j][1];
        	int n = tNumbers[j][2];
        	
        	ArrayList<Integer> list = findNumbers(a,b,n);
        	printResult(list);
        	System.out.println();
        }
	}

}
 
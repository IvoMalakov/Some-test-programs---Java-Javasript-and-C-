package proben;

import java.util.*;

public class JavaArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> querys = new ArrayList<ArrayList<Integer>>();
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		readIntegers(list, scanner, n);
		
		int q = scanner.nextInt();
		
		readQueries(querys, scanner, q);
		
		scanner.close();
		
		displayTheOutput(list, querys);
	}

	private static void displayTheOutput(ArrayList<ArrayList<Integer>> list, ArrayList<ArrayList<Integer>> querys) {
		for (ArrayList<Integer> singleQuery : querys) {
			try {
				int row = singleQuery.get(0) - 1;
				int colomn = singleQuery.get(1) - 1;
				int position = list.get(row).get(colomn);
				
				System.out.println(position);
			}
			
			catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
	}

	private static void readQueries(ArrayList<ArrayList<Integer>> querys, Scanner scanner, int q) {
		for (int k = 0; k < q; k++) {
			ArrayList<Integer> query = new ArrayList<Integer>();
			
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			
			query.add(x);
			query.add(y);
			
			querys.add(query);
		}
	}

	private static void readIntegers(ArrayList<ArrayList<Integer>> list, Scanner scanner, int n) {
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> line = new ArrayList<Integer>();
			
			int d = scanner.nextInt();
			
			for (int j = 0; j < d; j++) {
				int temp = scanner.nextInt();
				line.add(temp);
			}
			
			list.add(line);
		}
	}

}

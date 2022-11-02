package proben;

import java.util.*;

public class JavaMap {

	public static void main(String[] args) {
		Map<String, String> phoneBook = new HashMap<String, String>();
		
		Scanner scanner = new Scanner(System.in);
		
		savingNamesInThePhoneBook(phoneBook, scanner);
		
//		for (String name : phoneBook.keySet()) {
//			System.out.println(name + " " + phoneBook.get(name));
//		}
		
		checkQueries(phoneBook, scanner);
		
		scanner.close();
	}

	private static void checkQueries(Map<String, String> phoneBook, Scanner scanner) {
		
		while (scanner.hasNext()) {
			StringBuilder sb = new StringBuilder();
			String query = scanner.nextLine();
			
			if (phoneBook.containsKey(query)) {
				String value = phoneBook.get(query);
				
				sb.append(query);
				sb.append("=");
				sb.append(value);
				
				System.out.println(sb.toString());
			} else {
				System.out.println("Not found");
			}
		}
	}

	private static void savingNamesInThePhoneBook(Map<String, String> phoneBook, Scanner scanner) {
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			String name = scanner.nextLine();
			String phoneNumber = scanner.nextLine();
			
			if (!phoneBook.containsKey(name)) {
				phoneBook.put(name, phoneNumber);
			}
			
		}
	}
}
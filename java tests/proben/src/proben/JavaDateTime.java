package proben;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class JavaDateTime {
	
	private static String findDay(int month, int day, int year) {
		
		Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.MONTH,month-1);
	    cal.set(Calendar.DAY_OF_MONTH,day);
	    cal.set(Calendar.YEAR,year);
	    String dayOfWeek = cal
	    		.getDisplayName
	    		(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.US)
	    		.toUpperCase();
	        
	    return dayOfWeek;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] inputLine = scanner.nextLine().split("\\s+");
		
		int month = Integer.parseInt(inputLine[0]);
		int day = Integer.parseInt(inputLine[1]);
		int year = Integer.parseInt(inputLine[2]);
		
		String result = findDay(month, day, year);
		System.out.println(result);
	}

}

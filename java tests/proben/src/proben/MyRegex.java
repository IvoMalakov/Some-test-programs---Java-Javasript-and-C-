package proben;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyRegex {
		private static String zeroTo255 = "(\\d{1,2}|(0|1)\\"
	              + "d{2}|2[0-4]\\d|25[0-5])";
		
		public static String pattern = zeroTo255 
				+ "\\."
				+ zeroTo255
				+ "\\."
				+ zeroTo255
				+ "\\."
				+ zeroTo255;
}

package hw1;

import java.util.*;

public class Encoding {

	public static Set<String> morseCodes(int m, int n) {
		Set<String> result = new TreeSet<String>();

		// Add the dots to the morse code
		if (m > 0){
			Set<String> dots = morseCodes(m - 1, n);
			if (dots.isEmpty())
				result.add(".");
			else{
				for (String str : dots) {
					result.add("." + str);
				}
			}
		}

		// Add the dashes to the morse code program
		if (n > 0){
			Set<String> dashes = morseCodes(m, n - 1);
			if (dashes.isEmpty())
				result.add("-");
			else{
				for (String str : dashes) {
					result.add("-" + str);
				}
			}
		}

		return result;
	}
	
	public static void main (String[] args){
		System.out.println(morseCodes(2, 1));
	}
}

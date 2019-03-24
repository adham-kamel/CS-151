package hw1;

import java.util.*;

public class Strings {

	public static String uniqueLetters(String str){
		ArrayList<String> uniqueString = new ArrayList<String>();
		ArrayList<String> duplicates = new ArrayList<String>();
		for (int i = 0; i < str.length(); i++){
			if (!uniqueString.contains(str.substring(i, i+1))){
				uniqueString.add(str.substring(i, i+1));
			}
			else{
				duplicates.add(str.substring(i, i+1));
			}
		}
		for (int i = 0; i < duplicates.size(); i++){
			if (uniqueString.contains(duplicates.get(i))){
				uniqueString.remove(duplicates.get(i));
			}
		}
		String newString = "";
		for (String letter : uniqueString){
			newString = newString + letter;
		}
		return newString;
	}
	
	public static void main(String[] args){
		System.out.println(uniqueLetters("supercalafragalisticexpealadocious"));
		
	}

}

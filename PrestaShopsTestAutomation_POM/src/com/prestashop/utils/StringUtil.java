package com.prestashop.utils;

public class StringUtil {

public static String extractNumberfromString(String targetString) {
		
		String onlyNumber = "";
		
		for(int i = 0; i < targetString.length(); i++) {
			
			char eachChar = targetString.charAt(i);
			
			if(Character.isDigit(eachChar)) {
				
				onlyNumber = onlyNumber + eachChar;
			}
		}
		
		
		return onlyNumber;
	}
	
	
}

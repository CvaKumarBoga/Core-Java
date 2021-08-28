package com.app;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = scanner.next();
		Palindrome palindrome = new Palindrome();
		System.out.println("Result: " +Palindrome.checkPalindrome(str));
	}
	
public static String checkPalindrome(String str) {
		
		if(str.length() == 1) {
			return str;
		}
		
		String substring = str.substring(0, 1);

		for (int i = 0; i < str.length(); i++) {
			String temp = checkPositions(str, i, i);

			if (substring.length() < temp.length()) {
				substring = temp;
			}
			
			temp = checkPositions(str, i, i+1);
			if (substring.length() < temp.length()) {
				substring = temp;
			}
		}
		return substring;
	}
	
	public static String checkPositions(String str, int begin, int end) {

		while(begin >=0 && end<=str.length()-1 && str.charAt(begin) == str.charAt(end)) {
			begin--;
			end++;
		}
		return str.substring(begin+1, end);
	}
}

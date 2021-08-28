package com.app;

public class Test {
	public static void main(String[] args) {
		String str = "aaabbbccaaaccc ";
		int count=1;
		char c = Character.MIN_VALUE;
		int current = 1;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			for (int j = current; j < charArray.length; j++) {
				if (charArray[i]==charArray[j]) {
					c = charArray[i];
					++count;
					++current;
				}
				if (charArray[i]!=charArray[j]) {
					System.out.println(c +":"+count);
					count = 1;
					++current;
				}
				break;
			}
			
		}
	}
}

package com.app;

public class Reverse {

	public static void main(String[] args) {

		String s = "Hellow my friend";

		String[] split = s.split(" ");

		for (int i = split.length-1; i >=0 ; i--) {
			System.out.print(split[i]);
			if(i==0)
				break;
			System.out.print(".");
		}
		
	}

}

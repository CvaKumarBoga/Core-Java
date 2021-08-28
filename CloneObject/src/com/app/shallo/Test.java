package com.app.shallo;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		//This is original object
		ShallowCopy original = new ShallowCopy(101, "Sivakumar");
		original.setStuName("AAA");
		
		//This is copy object
		//Different memory address
		ShallowCopy copy = (ShallowCopy) original.clone();
		System.out.println(original.getStuRollNo()+"  "+original.getStuName()+"  "+original.hashCode());
		System.out.println(copy.getStuRollNo()+"  "+copy.getStuName()+"  "+copy.hashCode());
		
	}
}
/**
 * OutPut:
 * 		101  Sivakumar  366712642
 *		101  Sivakumar  1829164700
 *	
 */

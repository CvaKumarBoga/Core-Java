package com.app;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		DeepCopy original = new DeepCopy(101,"Sivakumar","MCA");
		DeepCopy copy = (DeepCopy) original.clone();
		copy.setStuCourse("MBA");
		System.out.println(original.getStuId()+"  "+original.getStuName()+"  "+original.getStuCourse());
		System.out.println(copy.getStuId()+"  "+copy.getStuName()+"  "+copy.getStuCourse());
	}

}

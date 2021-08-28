package com.app.inte;

public class Test implements OuterInterface.InnerInterface,OuterInterface{

	@Override
	public void InnerMethod() {
		System.out.println(100);
	}
	
	public static void main(String[] args) {
	 Test t = new Test();	
	 t.InnerMethod();
	}
	


}

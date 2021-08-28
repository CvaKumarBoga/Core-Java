package com.app;

public class Test2 {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Eligible for garbage collection");
		super.finalize();
	}
	public static void main(String[] args) {
		
		Test2 test2 = new Test2();
		test2=null;
		System.gc();
		

	}

}

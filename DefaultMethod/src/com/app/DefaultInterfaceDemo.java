package com.app;

public interface DefaultInterfaceDemo {
	
	final static String str = "Java Developper";
	
	public void method1();
	
	public static void method2() {
		System.out.println("From Kothapet");
	}
	
	public default void method3() {
		System.out.println("Pullampet, Kadapa, A.P");
	}

}

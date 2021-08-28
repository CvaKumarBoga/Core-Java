package com.app.defa;

import com.app.DefaultInterfaceDemo;

public class Third implements DefaultInterfaceDemo{

	@Override
	public void method1() {
		System.out.println("Hello Ramesh Boga");
	}
	
	@Override
	public void method3() {
		DefaultInterfaceDemo.super.method3();
	}

	public static void main(String[] args) {
		Third t = new Third();
		t.method1();
		
		Second s = new Second();
		s.method1();
		
		First f = new First();
		f.method1();
		
		DefaultInterfaceDemo.method2();
		t.method3();
		System.out.println(DefaultInterfaceDemo.str);
	}
}

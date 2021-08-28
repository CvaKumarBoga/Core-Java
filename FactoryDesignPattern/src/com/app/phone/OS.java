package com.app.phone;

public interface OS {
	
	public void spec();
	
	default void msg() {
		System.out.println("Invalid Operating System");
	}

}

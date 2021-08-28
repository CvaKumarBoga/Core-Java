package com.app.inte;

public interface OuterInterface {
	
	public void InnerMethod();
	
	public interface InnerInterface{
		public void InnerMethod();
	}

}

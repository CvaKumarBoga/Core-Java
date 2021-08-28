package com.app.phone;

public class OSFactory {
	public OS getInstance(String str) {

		if(str.equals("OPPO")) {
			return new Android();
		}
		else if(str.equals("Nokia")) {
			return new Windows();
		}
		else if(str.equals("Apple")) {
			return new IOS();
		}
		else
			return null;
	}
}

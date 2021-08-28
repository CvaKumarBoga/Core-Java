package com.app;

public class Youtube {
	public static void main(String[] args) {
		
		Channel sivaTechWorld = new Channel();
		
		Subscriber subscriber1 = new Subscriber("Ajay");
		Subscriber subscriber2 = new Subscriber("Ravi");
		Subscriber subscriber3 = new Subscriber("Pavan");
		
		sivaTechWorld.Subscribe(subscriber1);
		sivaTechWorld.Subscribe(subscriber2);
		sivaTechWorld.Subscribe(subscriber3);
	
		
		subscriber1.subscribeChannel(sivaTechWorld);
		subscriber2.subscribeChannel(sivaTechWorld);
		subscriber3.subscribeChannel(sivaTechWorld);
		
		sivaTechWorld.uploadVideo("How to learn SAGA Design pattern");
	}
}

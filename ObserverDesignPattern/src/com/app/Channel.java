package com.app;

import java.util.ArrayList;
import java.util.List;

public class Channel {
	
	private List<Subscriber> subscribers = new ArrayList<>();
	String tittle;
	
	public void uploadVideo(String tittle) {
		this.tittle = tittle;
		notifications();
	}
	
	public void Subscribe(Subscriber sub) {
		subscribers.add(sub);
	}
	
	public void UnSubscibe(Subscriber sub) {
		subscribers.remove(sub);
	}
	
	public void notifications() {
		for(Subscriber sub : subscribers) {
			sub.update();
		}
	}
	
}

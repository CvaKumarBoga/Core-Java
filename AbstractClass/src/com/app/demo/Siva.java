package com.app.demo;

/*
 * If you are extends the abstract class must forcefully override all abstract methods available in
 * abstract class.
 * Can not possible to call Abstract class its possible to call only using child class.
 * */
public class Siva extends MangoFruitsTree {
	

	@Override
	public void usageOfMangos() {
		System.out.println("For usage of Juice.");
	}

	@Override
	public void cost() {
		System.out.println("One killo 100 Rupes.");
	}
	
	public static void main(String[] args) {
		Siva s = new Siva();
		s.color();
		s.taste();
		s.usageOfMangos();
		s.cost();
	}

}

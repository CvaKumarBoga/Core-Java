package com.app;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		BookShop bs1 = new BookShop();
		bs1.setBookShopName("siva books");
		bs1.loadData();
		
		//with out loading clone the previous object
		BookShop bs2 = bs1.clone();
		bs1.getBooks().remove(1);
		bs2.setBookShopName("kumar books");
		
		System.out.println(bs1);
		System.out.println(bs2);
		
	}

}

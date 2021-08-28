package com.app;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String bookShopName;
	public List<Book> books= new ArrayList<>();

	public void loadData() {
		for(int i=1;i<=5;i++) {
			books.add(new Book(i,"Book"+i));
		}
	}

	public String getBookShopName() {
		return bookShopName;
	}

	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", books=" + books + "]";
	}

	@Override
	protected BookShop clone() throws CloneNotSupportedException {

		BookShop shop = new BookShop();
		
		for(Book s:this.getBooks()) {
			shop.getBooks().add(s);
		}

		return shop;
	}



}

package com.hw3.dto;

public class Book {
	private String title;
	private String writer;
	private int price;
	private String publisher;
	private int boodNum;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String writer, int price, String publisher, int boodNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publisher;
		this.boodNum = boodNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getBoodNum() {
		return boodNum;
	}

	public void setBoodNum(int boodNum) {
		this.boodNum = boodNum;
	}
	


}

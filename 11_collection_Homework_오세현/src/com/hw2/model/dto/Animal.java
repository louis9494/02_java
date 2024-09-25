package com.hw2.model.dto;

public abstract class Animal {
	
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void sound() {
		// TODO Auto-generated method stub

	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "sound";
	}



	



}

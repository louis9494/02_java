package com.hw1.model.dto;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Friend {
	private String name;
	
	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Friend(String name) {
		super();
		this.name = name;
	}

	public void pickLeader() {
		Set<String> friendList = new LinkedHashSet<String>();
		friendList.add("짱구");
		friendList.add("철수");
		friendList.add("유리");
		friendList.add("훈이");
		friendList.add("맹구");

		
		
		
		for(String i : friendList ) {
			Random random = new Random();
			
			
		}
		
		String String = "";
		System.out.print( "짱구" + "가 떡잎방범대 대장이다!!!");
	}
	

}

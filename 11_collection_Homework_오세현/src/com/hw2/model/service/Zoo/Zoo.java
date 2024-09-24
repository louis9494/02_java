package com.hw2.model.service.Zoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw2.model.dto.Animal.Animal;

public  class Zoo extends Animal {
	private List<Animal> zooList = new ArrayList<>();

	public Zoo() {
		// TODO Auto-generated constructor stub
	}

	public void addAnimal() {
		if (zooList.addAll(zooList))
			;
	}

	public void showAnimals() {

	}

	public void displayMenu() {
		Scanner sc = new Scanner(System.in);
		

		int num = sc.nextInt();
		do{
			System.out.print("******** KH 동물원 ********");
			
			System.out.println();
			System.out.print("1. 동물들의 울음소리 듣기");
			System.out.println("2. 종료");
			System.out.println();
			System.out.println("선택 : ");
		
			
			switch (num) {	
			case 1 : System.out.println(
				  "동물의 울음소리를 들어보세요 : \n"
				+ "호랑이가 어흥하며 포효합니다 \n"
				+ "원숭이가 우끼끼 소리를 냅니다 \n");
				break;
			case 2 : System.out.println("프로그램을 종료합니다");
				break;
		
			}
		
		}	while(num != 0);
	}

	@Override
	public String toString() {
		return " [zooList=" + zooList + "]";
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
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

}
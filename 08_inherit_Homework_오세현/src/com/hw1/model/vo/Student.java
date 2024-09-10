package com.hw1.model.vo;

public class Student extends Person{
	
	private int grade;
	private String major;
	
	public Student() {}

	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		// name을 가지고 뭔가 할거임
		this.name = name;//protected라 후손클래스에서 직접 접근 가능
		
		this.grade = grade;
		this.major = major;
	}
	
	
	@Override
	public String information() {
		// TODO Auto-generated method stub
		return super.information() +
				String.format(" / 학년 : %d / 전공 : %s", grade, major);
	}
	
}

package com.kh.Test;

import java.util.ArrayList;

import come.kh.test.model.vo.Student;

public class Test {
	public static void main(String[] args) {
		ArrayList<Student> list = null;
		list.add(new Student("강건강", 84));
		list.add(new Student("남나눔", 78));
		list.add(new Student("도대담", 96));
		list.add(new Student("류라라", 67));
		
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}

	
	}
}

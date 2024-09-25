package com.hw3.service;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.dto.Book;



public class BookService {
	// 필드
	private Scanner sc = new Scanner(System.in);
	
	private List<Book> library = new ArrayList<Book>();
	// 부모타입 참조변수 = 자식객체의 주소값을 (다형성 중 업캐스팅)
	
	// 즐겨찾기 도서를 저장할 목록 List
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() {
		
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌배개", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 여행", "베르나르 베르베르", 15120, "열린책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 5555));
	}
	public void displayMenu() {
		
		try {
			
			
			
			
			
		} catch (Exception e) {
			
		}
		
		
	}
}

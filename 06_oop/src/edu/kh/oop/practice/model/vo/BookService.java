package edu.kh.oop.practice.model.vo;

public class BookService {
	
	public void practice() {
		// 1) 기본생성자를 이용하여 첫 번쨰 Book 객체 생성
		
		Book m1 = new Book();
		
		System.out.println(m1.toString() );
		
		m1.setTitle("자바의정석");
		m1.setPrice(30000);
		m1.setDiscountRate(0.2);
		m1.setAuthor("남궁성");
		
		System.out.println(m1.toString() );
		
		System.out.println("=============================");
		
		System.out.println("수정된 결과 확인");
		
		//2 매개변수 생성자를 이용해서 사용 데이터 참조하여 출력
		Book m2 = new Book();
		m2.setTitle("c언어");
		m2.setPrice(30000);
		m2.setDiscountRate(0.1);
		m2.setAuthor("홍길동");
		//3) 객체가 가진 필드 값을 toString()을 이용하여 출력
		System.out.println(m2.toString() );
		
		System.out.println("===========================");
		
		
		
		int money = 30000;
		
		
		System.out.println("도서명 = " + "c언어");
		System.out.println("할인된 가격 = "+(int)(money*0.9)+"원");
		System.out.println("도서명 = " + "자바의정석");
		System.out.println("할인된 가격 = "+(int)(money*0.8)+"원");
	}

}

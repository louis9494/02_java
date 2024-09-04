package edu.kh.oop.abstraction.model.service;
import edu.kh.oop.abstraction.model.vo.People;
// Service : 특정 기능(비즈니스 로직)을 제공하는 클래스
public class AbstractionService {
	
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();// People을 담을수 있는 상자여야함
		// People p1 : People 객체의 주소를 저장하여 참조하는변수 p1
		// new Peope() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다
		// ** == 클래스를 "사용자 정의 자료형" 이라고도 부른다!!!
		/*
		p1.name = "홍길동";
		p1.gender = (String) "남";
		p1.pNo = "123456-1234567";
		p1.address = "서울시 중구 남대문로 120 그레이츠청계 3층 E강의장";
		p1.phone = "010-1234-1234";
		p1.age = 20;
		
		p1.tax();
		p1.vote();

		System.out.println("p1의 name :" + p1.name);
		System.out.println("p1의 gender :" + p1.gender);
		System.out.println("p1의 pNo :" + p1.pNo);
		System.out.println("p1의 address :" + p1.address);
		System.out.println("p1의 phone :" + p1.phone);
		System.out.println("p1의 age :" + p1.age);
		
		*/
		
		p1.setName("홍길동");
		p1.setGender("남");
		p1.setpNo("123456-1234567");
		p1.setAddress("서울시 중구 ...");
		p1.setPhone("010-1234-1234");
		p1.setAge("20");
		
		System.out.println(p1.getName());
		System.out.println(p1.getGender());
		System.out.println(p1.getpNo());
		System.out.println(p1.getAddress());
		System.out.println(p1.getPhone());
		System.out.println(p1.getAge());
	}
	public void ex2() {
		People Sehyun = new People();
		Sehyun.setName("오세현");
		Sehyun.setGender("남");
		Sehyun.setpNo("930726-1XXXXXX");
		Sehyun.setAddress("인천광역시 서구 버들로 27 ");
		Sehyun.setPhone("010-7558-XXXX");
		Sehyun.setAge("32");
		
		System.out.println(Sehyun.getName());
		System.out.println(Sehyun.getGender());
		System.out.println(Sehyun.getpNo());
		System.out.println(Sehyun.getAddress());
		System.out.println(Sehyun.getPhone());
		System.out.println(Sehyun.getAge());
		
		// 본인 객체
		// People 클래스 이용하여 sehyun 만듬
		
	}
	

}

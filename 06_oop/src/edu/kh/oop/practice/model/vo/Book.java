package edu.kh.oop.practice.model.vo;

public class Book {
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	public Book() { // 기본생성자(ctrl + space + enter)
		
		
	}
	//매개변수생성자
	//alt + shift + s 제너레이트 컨스트럭쳐 유징 필드
	public Book(String title, int price, double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 어노테이션 : 컴파일러용 주석
	// Overriding : 재정의(메서드)
	@Override
	public String toString() {
		return title + " / " + price + " / " + discountRate + " / " + author;
	
	
		
		
		
	}
	
	
	
	/*	현실 객체 : 현실에서 존재하는 자신의 속성과 기능이 다른것들과 구분되어 식별이 가능한것
		객체 지향 언어 : 독립적으로 각각 구분해서 인식할 수 있게 하는 것을 목표로 하는 컴퓨터로 입력이 가능한 언어
		자바에서 객체란? : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 사용자가 생성하는 것
		class : 객체에 특성(속성,기능)에대한 정의를 하는 것
		new 연산자 :  Heap 메모리 영역에 서로 다른 자료형의 데이터를 연속으로 나열/할당하는것
		추상화 : 작성하려는 클래스의 속성과 기능 중 프로그램에서 필요한 공통점을 추출하고, 불필요한 부분을 제거하는 과정
		캡슐화 : 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법
		클래스의 가장 중요한 목적인 데이터의 직접 접근제한을 원칙으로 하여 
		클래스 외부에서 데이터의 직접적인 접근을 막고, 
		대신 간접적으로 데이터에 접근할 수 메소드를 클래스 내부에 작성하는 방법

		캡슐화 원칙 : 1.  클래스의 멤버 변수에 대한 접근 권한은 private을 원칙으로 한다.
				    2.  클래스의 멤버 변수에 대한 연산처리를 목적으로 하는 멤버 메소드는 클래스 내부에 작성한다.
				    3.  멤버 메소드는 클래스 밖에서 접근할 수 있도록 public으로 설정한다.
		메서드/기능의 '정의'란 : 수학의 함수와 비슷하며 호출을 통해 사용, 전달 값이 없는 상태로 호출을 하거나 
							어떤 값을 전달하여 호출을 하며, 함수 내에 작성된 연산 수행
							수행 후 반환 값 / 결과 값은 있거나 없을 수 있음 

		메서드의 '호출' 이란 :
		return : 해당 메소드를 종료하고 자신을 호출한 메소드로 돌아가는 예약어
				반환 값이 있다면 반환 값을 가지고 자신을 호출한 메소드로 돌아감


		public String ex1() {
		    return "Hi";
		}

		위 메서드 상세히 해석 :  필드안에 public 이라는 접근제한자와 스트링이라는 자료형 안에있는 ex1 이라는 클래스 
		(기본생성자)를 만들었고 그안에 Hi라는 문자열을 return해주었다 세미클론 마무리 
		
	*/
	
	
	
	
	
	
	
}

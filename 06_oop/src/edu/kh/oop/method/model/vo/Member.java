package edu.kh.oop.method.model.vo;

public class Member {// 속성 + 기능
	
	// 필드
	private String memberId; // 아이디
	private String memberPw; // 비밀번호
	private String memberName; // 이름
	private int memberAge; // 나이
	
	// 생성자
	// 생성자 규칙 : 반환형이 없고, 클래스명과 이름이 같아야한다.
	
	// 기본생성자
	// ctrl + space -> enter
	public Member() {}

	
	// 매개변수 생성자 (필드 모두 초기화)
	public Member(String memberId, String memberPw, String memberName, int memberAge) {
		// 오버로딩(같은 이름의 메서드를 여러개 만들어 주는것) 적용(매개변수의 개수 다름)
		
		
		// 매개변수로 전달받은값을 필드에 대입 과정
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}

	// 메서드
	// getter/setter
	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	
	
	
	
	


}

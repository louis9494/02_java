package com.hw2.model.service;

import com.hw2.model.dto.Person;

public interface ManagementSystem {
	
	// 관리 시스템 인터페이스
	
	void addPerson(Person person); // 묵시적 추상 변수, 사람 추가 용도 메소드
	void removePerson(String id); // 사람 삭제 용도 메소드
	void displayAllPerson(); // 모든 사람 조회 용도로 사용하는 메소드
}

package edu.kh.collection.pack3.model.service;

import java.util.HashMap;
import java.util.Map;

public class MapService {
	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	
	// - Key를 모아두면 Set의 특징(중복 x) 
	// - Value를 모아두면 List의 특징(중복 O)
	
	public void ex1() {
		
		// HashMap<K, V> : Map 의 자식 클래스 중 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "홍길동");
		map.put(2, "고길동");
		map.put(3, "김길동");
		map.put(4, "박길동");
		map.put(5, "이길동");
		map.put(6, "최길동");
		

		
		// key  중복 테스트
		map.put(1, "홍홍홍"); // 중복 허용 x, 대신 Value 덮어쓰기
		
		// value 중복 테스트
		map.put(1, "홍길동");
		
		System.out.println( map ); // map.toString() 오버라이딩 되어있음
		// {K=V, K=V...}
		
	}

}

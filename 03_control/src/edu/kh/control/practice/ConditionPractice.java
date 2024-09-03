package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0) {
			if (num % 2 == 0)
				System.out.println("짝수입니다.");
			else
				System.out.println("홀수입니다.");
		} else
			System.out.println("양수만 입력해주세요.");
		
		sc.close();
	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		boolean flag = false;
		int sum = kor + eng + math;
		double avg = sum / 3;
		if (avg >= 60) {
			if (kor >= 40 && eng >= 40 && math >= 40 ) {
				System.out.println("국어 : " + kor);
				System.out.println("영어 : " + eng);
				System.out.println("수학 : " + math);
				System.out.println("합계 : " + sum);
				System.out.printf("평균 : %.1f\n", avg);
				System.out.println("축하합니다, 합격입니다!");
			} else flag = true;
		} else flag = true;
		if (flag) System.out.println("불합격입니다.");
		
		sc.close();
	}
	public void ex3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		int result = 0;
		boolean flag = true;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			result = 31; break;
		case 2: case 4: case 6: case 9: case 11: 
			result = 30; break;
		default: 
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			flag = false;
		}
		if (flag) System.out.println(month + "월은 " + result + "일까지 있습니다.");
		
		sc.close();
	}
	public void ex4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double m = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (m * m);
		String result;
		if (bmi < 18.5) result = "저체중";
		else if (bmi < 23) result = "정상체중";
		else if (bmi < 25) result = "과체중";
		else if (bmi < 30) result = "비만";
		else result = "고도비만";
		System.out.println("BMI 지수 : " + bmi);
		System.out.println(result);
		
		sc.close();
	}
	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble() * 0.3;
		
		System.out.print("과제 점수 : ");
		double rep = sc.nextDouble() * 0.3;
		
		System.out.print("출석 횟수 : ");
		double att = sc.nextDouble();
		
		double sum = mid + fin + rep + att;
		System.out.println("================= 결과 =================");
		if (att <= (20 * 0.7)) {
			System.out.println("Fail [출석 횟수 부족 (" + (int)att + "/20)]");
		} else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", mid);
			System.out.printf("기말 고사 점수(30) : %.1f\n", fin);
			System.out.printf("과제 점수	(30) : %.1f\n", rep);
			System.out.printf("출석 점수	(20) : %.1f\n", att);
			System.out.printf("총점 : %.1f\n", sum);
			
			if (sum >= 70) System.out.println("Pass");
			else System.out.println("Fail [점수 미달]");
		}
		
		sc.close();
	}

	
	
	}


package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 { 
	
	public void practice1() {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int p = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int c = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : " + (c / p));
		System.out.println("남는 사탕 개수 : " + (c % p));
		sc.close();
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(정수만) : ");
		int level = sc.nextInt();
		System.out.print("반(정수만) : ");
		int clas = sc.nextInt();
		System.out.print("번호(정수만) : ");
		int num = sc.nextInt();
		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s의 성적은 %.2f이다.", level, clas, num, name, grade);
		sc.close();
	}
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.printf("평균 : %.1f\n", avg);
		sc.close();
	}
}

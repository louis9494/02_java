package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(i + 1 + " ");
		}
		
		sc.close();
	}
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			for (int i = num; i > 0; i--)
				System.out.print(i + " ");
		}
		
		sc.close();
	}
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += (i + 1);
			
			System.out.print(i + 1);			
			if (i + 1 == num) System.out.print(" = ");
			else System.out.print(" + ");
		}
		System.out.println(sum);
		
		sc.close();
	}
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int input1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int input2 = sc.nextInt();
		
		int num1;
		int num2;
		
		if (input1 < 1 || input2 < 1)
			System.out.println("1 이상의 숫자를 입력해주세요.");
		else {
			if (input1 < input2) {
				num1 = input1;
				num2 = input2;
			} else {
				num1 = input2;
				num2 = input1;
			}
			
			for (int i = num1; i <= num2; i++)
				System.out.print(i + " ");
		}

		sc.close();
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("===== " + num + "단 =====");
		for (int i = 0; i < 9; i++)
			System.out.println(num + " * " + (i + 1) + " = " + num * (i + 1));
		
		sc.close();
	}
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		if (num < 2 || num > 9)
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		else {
			for (int i = num; i <= 9; i++) {
				System.out.println("===== " + i + "단 =====");
				for (int j = 0; j < 9; j++)
					System.out.println(i + " * " + (j + 1) + " = " + i * (j + 1));
				System.out.println();
			}
		}
		
		sc.close();
	}
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}

		sc.close();
	}
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num; j > i; j--)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0 || i % 3 == 0) {
				System.out.print(i + " ");
				if (i % (2 * 3) == 0) 
					count++;
			}
		}
		System.out.println("\ncount : " + count);
		
		sc.close();
	}
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");
			
			for (int j = 0; j < i + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}
	public void practice12() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = num - 1; j > i; j--)
				System.out.print(" ");
			
			for (int j = 0; j < i * 2 + 1; j++)
				System.out.print("*");
			System.out.println();
		}
		
		sc.close();
	}
	public void practice13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		// num == row (행)
		// 1행과 num행은 "*"출력
		// 1열과 num열은 "*"출력
		
		for (int row = 0; row < num; row++) {
			for (int col = 0; col < num; col++) {
				if (row == 0 || row == num - 1 || col == 0 || col == num - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
		sc.close();
	}
	public void practice14() {
		/*
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 만일 1 미만의 숫자가 입력됐다면 "1 이상의 숫자를 입력해주세요"를 출력하세요
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1 이상의 숫자를 입력해주세요");
		int num = sc.nextInt();
		if (num<1) {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}	else {
			for ( int i = 1; i <= num; i++ )
				System.out.print(i +  " ");
				}
		
	}
	public void practice15() {
	/*사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
	 * 
	 * 
	 */
	Scanner sc = new Scanner(System.in);
	
	System.out.print("1이상의 숫자를 입력하세요 : ");
	int num = sc.nextInt();
	
	if (num < 1)
		System.out.println("1 이상의 숫자를 입력해주세요.");
	else {
		for (int i = num; i > 0; i--)
			System.out.print(i + " ");
	}
	}
	
	public void practice16() {
		/*
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용해 출력하세요.
		 * 
		 * 
		 * 
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 번호 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += (i + 1);
			
			System.out.print(i + 1);			
			if (i + 1 == num) System.out.print(" = ");
			else System.out.print(" + ");
		}
		System.out.println(sum);
		
		sc.close();
	}
	


}

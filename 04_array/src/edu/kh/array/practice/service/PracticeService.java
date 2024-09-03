package edu.kh.array.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
        	arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("\n짝수 번째 인덱스 합 : " + sum);
    }
	public void practice2() {
		int[] arr = new int[9];
		
		int sum =0;
		for (int i = 0; i <arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i] + " ");
			
			if (i % 2 == 1) {
				sum += arr[i];
			}
		}
		
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }

    }
	public void practice4(){
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		for(int i = 0 ; i < arr.length; i++) {
			
			System.out.printf("입력 %d : ", i);
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.print("검색할 값 :");
		int input = sc.nextInt();
		boolean flag = true;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(input == arr[i]) {
				System.out.println("인덱스 : " + i);
				
				flag = false;
			}
		}
		if(flag) {
			System.out.println("일치하는 값이 존재하지 않습니다");
		}
	
	
	
	}
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int count = 0;
		
		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
                System.out.print(i + " ");    // 해당 인덱스 이어서 출력

                count++;    // 그리고 count 1증가
            }
		}
		
		System.out.println();
		
		System.out.println(ch + "개수 : " + count);
		
		
	}
	   public void practice6() {
	        // 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
	        Scanner sc = new Scanner(System.in);

	        System.out.print("정수 : ");
	        int num = sc.nextInt();

	        int[] arr = new int[num];

	        // 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
	            arr[i] = sc.nextInt();
	        }


	        // 3. 전체 값 나열 및 총 합 출력
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	            sum += arr[i];
	        }

	        System.out.println();
	        System.out.println("총 합 : " + sum);
	    }
	   public void practice7(){
	        Scanner sc = new Scanner(System.in);

	        System.out.print("주민등록번호(-포함) : ");
	        String input = sc.next();

	        char[] arr = new char[input.length()];

	        for (int i = 0; i < arr.length; i++) {

	            if (i <= 7) { // 7번 인덱스 이하(생년월일, - , 성별)
	                arr[i] = input.charAt(i);
	            } else { // 8번 인덱스 이상부터는 *
	                arr[i] = '*';
	            }
	            System.out.print(arr[i]);
	        }
	    }
	
	
	   
	   
	   
}	

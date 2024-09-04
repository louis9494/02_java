package edu.kh.array.practice.service;

import java.util.Arrays;
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
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
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
		//사용자가 입력한 문자열(str)을 문자 하나하나를 char 배열에 넣기
		// 먼저 문자길이를 새로 대입후, 반복문 charAt(i)값을 arr[i] .
		char[] arr = new char[str.length()];
		
		for (int i = 0; i <arr.length; i++) {
			arr[i] = str.charAt(i);
			
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		// 검색할 문자가 문자열에 몇개가 들어와있는지, 어느 인덱스에 있는지 파악
		int count = 0; // 검색할 문자가 몇개 들어있는지 새어줄 변수
		//문자열에서 동일한 문자가 발견될때마다 1씩 증가
		
		// 반복문 수행 전 문자열 출력
		System.out.println(str + "에" + ch + "가 존재하는 위치(인덱스) : ");
		
		// 인덱스마다 어디에 있는지 접근하기 위해 반복문 사용
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
                System.out.print(i + " ");    // 해당하는 인덱스 이어서 출력

                count++;    // 그리고 count 1증가
            }
		}
		
		// 위에서 마지막으로 print() 사용했기 때문에 개행을 해줌.
		System.out.println();
		
		// 위에서 구한값들 출력하기
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
	        //char[] arr 에 (새로운) 길이만큼 input.length를 할당
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
	   public void practice8() {

	        Scanner sc = new Scanner(System.in);

	        while (true) { // 3 이상의 수가 입력 될 때 까지 무한 반복
	            // -> 3 이상이 입력되면 break문으로 종료

	            System.out.print("정수 : ");
	            int input = sc.nextInt();

	            if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
	                System.out.println("다시 입력하세요.");

	            } else {
	                // 입력 받은 정수 만큼의 크기를 가지는 배열 생성
	                int[] arr = new int[input];

	                int num = 0; // arr 배열에 대입될 값

	                for (int i = 0; i < arr.length; i++) {
	                    if (i <= arr.length / 2) { // 중간 이전 까지 -> 증가
	                        arr[i] = ++num;

	                    } else { // 중간 이후 -> 감소
	                        arr[i] = --num;
	                    }

	                    // 출력 시 , 추가 (단, 마지막 제외)
	                    if (i == arr.length - 1) { // 마지막 바퀴
	                        System.out.print(arr[i]);

	                    } else {
	                        System.out.print(arr[i] + ", ");
	                    }

	                }
	                break; // while 반복 멈춤 for문 끝나고 나서 break 해줘야 함
	            }
	        }
	    }
	   public void practice9(){
	        int[] arr = new int[10];
	        // 배열을 초기화할목적이라서 for문 사용
	        for(int i = 0; i < arr.length; i++){
	            arr[i] = (int)(Math.random() * 10 + 1);
	        }

	        System.out.print("발생한 난수 : ");
	        for(int i = 0; i < arr.length; i++){
	            System.out.print(arr[i] + " ");
	        }
	    }
	   public void practice10(){

			int[] arr = new int[10];
			
			System.out.print("발생한 난수 : ");
			
			for(int i = 0 ; i < arr.length; i++) {
				arr[i] = (int)(Math.random() * 10 + 1);
				System.out.print(arr[i] + " ");
			}
			
			int max = 1;
			int min = 10;
			
			for(int i = 0; i < arr.length; i++) {
				
				if(arr[i] > max) {
					max = arr[i];
				}
				if(arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println();
			System.out.println("최대값 : " + max);
			System.out.println("최소값 : " + min);
		}   
	   public void practice11(){
			//10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
			//1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.

			//[실행 화면]
			//4 1 3 6 9 5 8 10 7 2
			
			int[] arr = new int[10];
			
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = (int)(Math.random() * 10 +1);
				
				for(int i2 = 0; i2 < i; i2++) {
					
					if(arr[i2] == arr[i]) {
						
						i--;
						
						break;
					}
				}
			}
			for(int i = 0; i < arr.length; i++) {
				
				System.out.print(arr[i] + " ");
			}
		}   
	   /* 실습문제 12
	    로또 번호 자동 생성기 프로그램을 만들기.
	    (중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	    [실행 화면]
	    3 4 15 17 28 40
	    */
	    public void practice12(){
	        // 1. 크기가 6인 정수형 배열 선언 및 할당
	        int[] lotto = new int[6];

	        // 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
	        for(int i=0; i<lotto.length; i++) {
	            lotto[i] = (int)(Math.random() * 45 + 1);

	            for(int j=0; j<i; j++) { // 중복 제거
	                if(lotto[i] == lotto[j]) {
	                    i--;
	                    break;
	                }
	            }
	        }

	        // 3. 오름차순 정렬(선택정렬)
	        for(int i=0; i<lotto.length-1; i++) { // 비교 주체
	            for(int j=i+1; j<lotto.length; j++) { // 비교 대상
	                if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

	                    int temp = lotto[i];
	                    lotto[i] = lotto[j];
	                    lotto[j] = temp;
	                }
	            }
	        }

	        // 4. 출력
	        for(int i=0; i<lotto.length; i++) {
	            System.out.print(lotto[i] + " ");
	        }
	    }   
	    public void practice13() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	// 입력할 문자열을 str 이용해서 nextline에 할당
	    	System.out.print("문자열 : ");
	    	String str = sc.nextLine();
	    	
	    	// 해당 문자열의 문자들을 char[]에 담기
	    	char[] arr = new char[str.length()];
	    	
	    	
	    	// 문자 개수 카운트
	    	int count = 0;

	    	System.out.print("문자열에 있는 문자 : ");
	    	// char배열에서 중복값 존재할 경우 출력x
	    	for (int i = 0; i < arr.length; i++) {
	    		arr[i] = str.charAt(i);
	    	
	    		boolean flag = true; // 중복 체크용 flag
	    		// for문 이용
	    		for (int j = 0; j < i; j++) {
	    			if (arr[j] == arr[i])
	    				flag = false;
	    		}
	    		
	    		if (flag) { // 중복이 발생하는 때
	    			if (i == 0)
	    				System.out.print(arr[i]);
	    			else
	    				System.out.print(", " + arr[i]);
	    		
	    			//중복 아닐 때만 count 개수 늘리기
	    			count++;
	    		}
	    	}

	    	System.out.println("\n문자 개수 : " + count);
	    	
	    	sc.close();
	    }
	    
	    // 자바에서 배열 특징
	    // 같은 자료형만 저장 가능, 길이 변경할 수 없다.
	    public void practice14() {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.print("배열의 크기를 입력하세요 : ");
	    	String[] arr = new String[sc.nextInt()];
	    	sc.nextLine(); // 입력버퍼에 있는 개행문자 제거
	    	
	    	int index = 0;
	    	
	    	while (true) {
	    		for (int i = index; i < arr.length; i++) {
	    			System.out.print(i + 1 + "번째 문자열 : ");
	    			arr[i] = sc.nextLine(); // **입력버퍼에 있는 개행문자를 비워줘야함
	    		}
	    		// 반복이 시작되는 구간부터 무한반복하는 while 작성하여 내부에 종료조건 만들어서 break해줌
	    		index = arr.length;

	    		System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
	    		char plus = sc.next().charAt(0);
	    		
	    		// 값을 더 입력할 경우
	    		if (plus == 'Y' || plus == 'y') {
	    			System.out.print("더 입력하고 싶은 개수 : ");
	    			
	    			// 새로운 값을 입력받을 배열 생성 --> 기존 배열 크기 + 추가 개수 입력
	    			String[] arr2 = new String[arr.length + sc.nextInt()];
	    			sc.nextLine();
	    			
	    			// 배열 복사 + 새로운 문자열 입력받기
	    			System.arraycopy(arr, 0, arr2, 0, arr.length);
	    			arr = arr2;
	    		// 그렇지 않을 경우	
	    		} else if (plus == 'N' || plus == 'n') {
	    			System.out.println(Arrays.toString(arr));
	    			break;
	    		// 나머지	
	    		} else {
	    			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
	    			continue;
	    		}

	    	}
	    	
	    	sc.close();
	    }
}	

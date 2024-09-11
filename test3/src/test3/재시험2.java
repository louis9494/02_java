package test3;

import java.util.Scanner;

public class 재시험2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] fruits = {"사과", "포도", "딸기", "수박", "멜론"};
		
		
			 System.out.print("딸기의 인덱스 번호는? : ");
			 String input = sc.next();
		 
		 boolean flag = true;

		 for(int i = 0; i < fruits.length; i++) {
			 if(fruits[i].equals(input)) {
				 System.out.println("인덱스 : " + i);
				 flag = false; 
				 break;
			 }
		 }
			
		
		
	}

}

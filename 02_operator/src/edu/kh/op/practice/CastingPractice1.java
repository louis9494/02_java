package edu.kh.op.practice;

public class CastingPractice1 {
public static void main(String[] args) {
	int iNum1 = 10;
	int iNum2 = 4;
	float fNum = 3.0f;
	double dNum = 2.5;
	char ch = 'A';
	/*System.out.println( iNum1, iNum2 ); // 2
	System.out.println( dNum ); // 2
	System.out.println( iNum2 dNum ); // 10.0
	System.out.println( iNum1 ); // 10.0
	System.out.println( iNum1 iNum2 ); // 2.5
	System.out.println( dNum ); // 2.5
	System.out.println( fNum ); // 3
	System.out.println( iNum1 fNum ); // 3
	System.out.println( iNum1 fNum );// 3.3333333
	System.out.println( iNum1 fNum ); // 3.3333333333333335
	System.out.println( ch ); // 'A'
	System.out.println( ch ); // 65
	System.out.println( ch iNum1 ); // 75
	System.out.println( (ch iNum1) ); // 'K'
		*/
	System.out.println( iNum1/iNum2 );
	
	System.out.println( (int)dNum);
	
	System.out.println( iNum2*dNum);
	// 자동형변환
	// iNum2=4.0으로 바뀜
	
	
	System.out.println( (double)iNum1);
	
	System.out.println( (double)iNum1/iNum2);
	
	System.out.println( dNum);
	
	System.out.println( (int)fNum);
	
	System.out.println( iNum1 / (int)fNum ); 
	
	System.out.println( iNum1 / fNum);
	// float : 소수점 아래 8번째 자리까지 연산 후 반올림 
	
	System.out.println( (double)iNum1 / fNum);
	// double : 소수점 아래 16번째 자리까지 연산 후 반올림
	
	System.out.println( "'" + ch + "'"); // 'A'
	
	System.out.println( (int)ch );
	
	System.out.println( ch + iNum1);
	
	System.out.println( "'" + (char)(ch + iNum1) + "'"); 
		

}
}


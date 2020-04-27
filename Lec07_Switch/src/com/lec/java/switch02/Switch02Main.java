package com.lec.java.switch02;

public class Switch02Main {

	public static void main(String[] args) {
		System.out.println("switch 연습");

		// 도전
		// switch ~ case 조건문을 사용해서
		// 짝수 이면 --> "짝수입니다"  출력
		// 홀수 이면 --> "홀수입니다"  출력

		int num = 92;
		
		switch(num % 2) { 
		//스위치의 안에는 int와 int로 자동 형변환이 가능한 것만 들어오다
		case 1:
			System.out.println("num은 홀수입니다");
			break;
		case 0 :
			System.out.println("num은 짝수입니다");
			break;
		}
		
		
		
		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










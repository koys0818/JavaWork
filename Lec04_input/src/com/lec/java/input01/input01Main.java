package com.lec.java.input01;

import java.util.Scanner;

/*
 * 표준 입력 (standard input) : 키보드로부터 입력
 * 			Scanner 객체 사용
 * 
 * 표준 출력 (Standard output)	: 모니터로 출력
 */
public class input01Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in); // import 필요 스캐너 객체 생성
		
		//스캐너 사용한 입력 작업
		int num1, num2;
		System.out.println("숫자 1을 입력해주세요 : ");
		num1 = sc.nextInt();
		System.out.println("숫자2를 입력하세요: ");
		num2 = sc.nextInt();
		
		System.out.println("num1 = " + num1);
		System.out.printf("%d + %d = %d\n", num1 ,num2, num1 + num2);
		System.out.println("num2 = " + num2);
		
		// nextInt() 에서 문자나 다른걸 입력하면 inputmisatchException 발생
		
		
		// 각 primitive 타입에 대해 nextXXX() 메소드 제공
//		sc.nextByte();
//		sc.nextShort();
//		sc.nextLong();
//		sc.nextFloat();
//		sc.nextDouble();
//		sc.nextBoolean();

		
		
		sc.close(); // 스캐너 객체를 사용한 뒤에는 반드시 close();를 해주자

	}

}

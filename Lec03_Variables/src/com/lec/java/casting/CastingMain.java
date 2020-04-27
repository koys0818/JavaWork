package com.lec.java.casting;


/*
 * 암묵적 형변환(Implicit casting): 자바 언어가 자동으로 해주는 형변환
 * 
 * 		primitive type 에서 implicit casting 방향
 * 
 * 		byte → short → int → long → float → long  
 *                 		↑
 *                    char
 * 
 * 명시적 형변환(Explicit casting): 프로그래머가 직접 타입을 변환하는 것
 *      
 *      (변환하고자 하는 타입명)변수/값	
 *      
 *      
 *            
 */

public class CastingMain {

	public static void main(String[] args) {
		
		System.out.println("형변환 (Type Casting/ Type Converting)");
		
		byte num1 = 123;
		int num2 = 123;
//		byte num3 = num2;   num2는 int타입 num3은 byte타입이니 자동형변환 불가
		// 용량이 더 큰 것을 작은 것으로 변환하는거라 자동 x
		byte num3 = (byte)num2; // 명시적 형변환이라 가능
		
		//명시적 형변환시 주의점  ---> 데이터 손실 발생 주의
		byte num5 = (byte)513;
		System.out.println("num5 = " + num5); // 1
		
		
		double avg1 = (99 + 88 + 78) /3; 
		
		// int / int이기 때문에 소숫점이 날아감
		
		System.out.println("avg1 = " + avg1);
		
		
		
		double avg2 = (double)(99 + 88 + 78) / 3; // 앞에 double를 명시한다
		
		System.out.println("avg2 = " + avg2);
		
		
		
		double avg3 = (double)(99 + 88 + 78) / 3.0;  //둘 중 하나를 소숫점 값을 준다
		
		System.out.println("avg3 = " + avg3);
		
		
		
		

	}	//end Main

}	//end Class

package com.lec.java.variable02;

//자바의 기본 자료형(primitive data type)
//정수 타입: byte(1바이트), short(2바이트), int(4바이트), long(8바이트)
//실수 타입: float, double
//문자 타입: char
//논리 타입: boolean

public class Variable02Main {

	public static void main(String[] args) {
		System.out.println("정수타입 변수들");
		
		System.out.println("byte :" + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		byte num1 = -128;	
		byte num2 = 0;
		byte num3 = 123;
//		byte num4 = 1234; // 에러 byte에 저장할 수 있는 크기를 넘김 
		
		System.out.println("Short: " + Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		short num5 = -12345;
		short num6 = 12345;
//		short num7 = 32768;
		short num8 = -32768;
		
		System.out.println("int : "+ Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println("long : "+ Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
//		int num9 = 9876543210;
//		long num10 = 9876543210	// The literal 9876543210 of type int is  out of range
		// 리터럴 : literal
		//  코드상에 직접 입력한 값들
		// 정수리터럴 --> int로 형변환 하려 한다
		// 실수리터럴 --> double로 형변환 하려 한다
		// "~" 리터럴 --> 문자열(String)로 형변환 하려 한다
		long num11 = 9876543210L; // <-- long 리터럴로 인식한다 
		// L이 없으면 자바는 기본적으로 int로 인식하려 한다 
		long num12 = 12;
		long num13 = 12L;
		int num14 = 14;
//		int num15 = 15L; // long타입은 int타입에 대입불가 
		//값의 경계선
		byte num15 = Byte.MAX_VALUE; //127
		byte num16 = (byte)(num15 + 1); // <-- 정수타입만 가능 실수 x
		System.out.println("num 15 =" + num15);
		System.out.println("num 16 =" + num16);
		
		
		//정수 표기법
		int number1 = 11;   //10진수 (Decimal)
		int number2 = 0xB;  // 16진수 (Hexadecimal)
		int number3 = 013;	// 8진수 (Octal)
		int number4 = 0b1011; // 2진수 (Binnary)
		
		System.out.println("number1 = " + number1);
		System.out.println("number2 = " + number2);
		System.out.println("number3 = " + number3);
		System.out.println("number4 = " + number4);
		
		//String.format(); 을 사용하여 원하는 포멧(진법)으로 출력 가능
		System.out.println("number1 = " + String.format("%x",number1));
		System.out.println("number1 = " + String.format("%o",number1));
		
		//Integer.toXxx(n) 를 사용하여 원하는 포멧의 문자열로 변환가능
		System.out.println("number1 = " + Integer.toHexString(number1));
		System.out.println("number1 = " + Integer.toOctalString(number1));
		System.out.println("number1 = " + Integer.toBinaryString(number1));
		
		
	} // end Main()

}	// class Main()

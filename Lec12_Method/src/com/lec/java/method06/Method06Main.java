package com.lec.java.method06;

/* Method Overloading (메소드 중복 정의)
	 같은 이름으로 메소드를 매개변수 리스트를 달리하여 중복 정의, 
	 즉, 이름이 같아도 메소드 signature 가 다르면 중복정의 가능.
	
  Method Signature 란
	   메소드 이름 + 매개변수 리스트 (parameter list)
	
	 1. 매개변수의 개수가 다르거나
	 2. 매개변수의 자료형이 다르거나
	 3. 매개변수의 순서가 다를 때
	 위 3개를 '매개변수 리스트' 라 한다
	
    메소드의 리턴 타입만 다른 경우는 중복 정의할 수 없다!!

     메소드 오버로딩의 장점:
	동일한 동작을 하는 메소드에 대해 매개변수만 달리하여 중복정의 하면
	이 메소드를 사용하는 입장에선 여러타입의 이름을 익힐 필요가 없다. 

 */

public class Method06Main {

	public static void main(String[] args) {
		System.out.println("Method Overloading (메소드 중복 정의)");
		
		sayhello();
		sayhello("고유성");
		sayhello(20);
		sayhello("고유성", 20);
		sayhello(20,"고유성");
		
		//상위타입으로 자동변환
		byte b = 10;
		sayhello(b);
		
		
		//메소드 오버로딩의 장점
//		흔히 쓰는 System.out.println(); 도 전부 오버로딩을 사용하는 것이다
		
		System.out.println("\n프로그램 종료");
		
		
		
		
	} // end main()
	
	//1
	public static void sayhello() {
		System.out.println("sayhello() 호출");
		System.out.println("안녕하세요");
	
	}
	
	
//	public static int sayhello() {   // 리턴타입이 다르다고 오버로딩이 안된다
//		
//	}
	
	
	public static void sayhello(String name) {
		System.out.println("sayhello(String) 호출");
		System.out.println("HI~");
		System.out.println("제 이름은 " + name + "입니다");
	}
	
	
	
	//3-1
	public static void sayhello(int age) {
		System.out.println("sayhello(int) 호출");
		System.out.println("my age is " + age);
	}
	
	//3-2
	
	
	public static void sayhello(short age) {
		System.out.println("sayhello(short) 호출");
		System.out.println("my age is " + age);
	}
	
	
	
	
	//4
	public static void sayhello(String name, int age) {
		System.out.println("sayhello(String,int) 호출");
		System.out.println(name + age);
	}
	public static void sayhello(int age,String name ) {
		System.out.println("sayhello(int,String) 호출");
		System.out.println(name + age);
	}
} // end class










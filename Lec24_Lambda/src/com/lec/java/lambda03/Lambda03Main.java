package com.lec.java.lambda03;

/*
	 세가지 방법으로 자유자재로 구현할수 있어야 합니다.
	 방법 1) 클래스 implements 인터페이스 + 오버라이딩.
	 방법 2) 익명클래스
	 방법 3) 람다 표현식 lambda expression
*/
public class Lambda03Main {

	public static void main(String[] args) {
		System.out.println("익명 클래스, 람다 표현식 연습");
		
//		 방법 1) 클래스 implements 인터페이스 + 오버라이딩.
		
		
		
//		 방법 2) 익명클래스
		Operable Test02 = new Operable() {
			
			@Override
			public double operater(double x, double y) {
				
				return x-y;
			}
			
		}; 
		
		System.out.println(Test02.operater(3.2, 2.2));
		
//		 방법 3) 람다 표현식 lambda expression
		Operable lambda = (x,y) ->{
			
			return x*y;
		};
		System.out.println(lambda.operater(1.2, 2.5));
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
} // end class

interface Operable{
	public abstract double operater(double x,double y);
}

package com.lec.java.operator07;

/* 게으른 계산(Lazy Evaluation)
 * SCE: Short-Circuit Evaluation
 *
 * A && B를 계산할 때
 *	A가 거짓이면, B의 결과에 상관 없이 결과가 항상 거짓이 되기 때문에
 *	B는 연산이 이루어지지 않는다.
 *
 * A || B를 계산할 때
 * 	A가 참이면, B의 결과에 상관 없이 결과가 항상 참이 되기 때문에
 * 	B는 연산이 이루어지지 않는다.
 */
public class Operator07Main {

	public static void main(String[] args) {
		System.out.println("게으른 계산(Lazy Evaluation)");
		System.out.println("SCE: Short-Circuit Evaluation");
		
		int num1 = 0, num2 = 0;
		boolean b;
		
		b = ((num1 += 10) < 0) && ((num2 +=10) > 0); 
		// --> 먼저 계산하는 왼쪽에서 이미 false가 나왔으니까 오른쪽은 계산도 x
		
		System.out.println("b = " + b);
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		
		
		
		
		

		System.out.println("\n 프로그램 종료");
	} // end main ()

} // end class




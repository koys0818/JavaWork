package com.lec.java.loop05;

public class Loop05Main {

	public static void main(String[] args) {
		System.out.println("순환문 연습 - 언제 100을 넘나?");
		// 1 + (-2) + 3 + (-4) + ...+ (n) >= 100 ?
		// 언제(n) 합이 100을 넘나?  그 합은?
		int i, j;
		int total = 0;
		for(i = 1 ; i< 10000; i += 2) {
			for(j= -2;j > -10000; j -= 2)
			{
				total = total + i;
				if(total >=100)
				{
					System.out.println(i+"\t"+ j+ "\t"+total);
					break;
				}
				total = total + j;
			}
		}
		
		System.out.println();
		System.out.println("순환문 연습 - 두 주사위 눈의 합");
		// 두 주사위 눈의 합 = 6
		// (1, 5), (2, 4), (3, 3), (4, 2), (5, 1)
		// x + y = 6를 만족하는 x, y 쌍을 찾으면 됨.
		
		for(i = 1; i < 7; i++) {
			for(j = 1; j < 7; j++) {
				if(i + j == 6) {
					System.out.print("(" + i+ ", "+ j + "),  ");
				}
			}
		}
		
		

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class

















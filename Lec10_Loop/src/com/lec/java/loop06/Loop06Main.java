package com.lec.java.loop06;

/* break 레이블;   // 레이블(label) 위치까지 순환문 탈출
 * 
 * 프로그래밍의 구조적 설계에 악영향을 줄수 있으니 가급적 지양하기 바랍니다 
 */

public class Loop06Main {

	public static void main(String[] args) {
		System.out.println("레이블 (label)");

		System.out.println();
		// 구구단이 결과가 50을 넘어가면 출력 종료. 어떻게 하나?
		// 맨 밑의 '프로그램 종료' 까지 진행해야 한다.

		int a = 1;
		int b = 1;
		z: //레이블은 반드시 순환문 직전에 표시
		while(a<10)
		{
			while(b<10)
			{
				if(a*b > 50) {
					break z;
				}
				System.out.println(a + " * " + b + " = " + a*b);
				b++;
			}
			if(a*b > 50) {
				
			}
			b = 1;
			a++;
			
		}

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class










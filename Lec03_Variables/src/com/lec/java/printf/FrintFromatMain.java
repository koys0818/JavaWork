package com.lec.java.printf;

/* 서식화된 문자열 (formatted string)
 *  ● 화면에 출력할때는 -> printf()
 *    
 *    printf("서식문자열", 값1, 값2....)
 *    
 *  ● 문자열(String)으로 만들때는 -> String.format()
 *       	
 *    String.format("서식문자열", 값1, 값2....)
 *    
 *  ● format specifier (서식 지정자)
 *  	%d  :  십진수 정수로 출력
 *  	%f  :  실수 출력
 *  	%s  :  문자열 출력
 *  	%c  :  '문자하나' 출력
 *  	%x  :  16진수 정수로 출력
 *  	%%  :  % 출력
*/


public class FrintFromatMain {

	public static void main(String[] args) {
		System.out.println("서식화된 출력 : printf() , String.format()");
		
		double pi = Math.PI;
		System.out.println(pi);
		
		//printf : print with format
		//prntf("서식 문자열", 값1 , 값2 ...)
		// 서식문자열 안에는 %로 시작하는 '서식지정자'들
		System.out.printf("원주율 %f\n",pi);	
		//실수값 앞에 (.숫자)를 쓰면 소숫점 숫자를 쓴 만큼 제한할 수 있다
		System.out.printf("원주율%.3f\n",pi);
		
		int age = 10;
		short grade = 3;
		
		System.out.printf("제 나이는 %d살입니다 학년은 %d학년입니다\n",age,grade);
		
		// 소숫점 이하 제한
		double height = 182.3;
		System.out.printf("저는 %d살입니다. 키는 %.1f입니다\n",age,height);
		
		// 출력폭 지정, 좌우 정렬
		System.out.printf("|%d|%d|%d|\n",100,200,300);
		System.out.printf("|%5d|%5d|%5d|\n",100,200,300);
		// 출력폭 5칸, 우측 정렬 (기본)
		// 좌측 정렬하고 싶으면 숫자앞에 -를 붙인다
		
		System.out.printf("제 이름은 [%10s]입니다\n혈액형은 %c형입니다\n","고유성",'A');
		
		// % 출력		***
		double rate = 134423.0 / 345678.0;
		System.out.printf("합격률은 %.1f%%입니다\n",rate);
		
		// 숫자의 패딩
		System.out.printf("|%05d|%05d|%05d|\n",100,200,300);
		
		// format 문자열을 따로 설정해서 운영
		String fmt = "주소 : %s, 우편번호[%05d]";
		System.out.printf(fmt + "\n","서울",12145);
		
		//String.format() ***
		String.format("합격률은 %.1f%% 입니다" , rate);
		String result = String.format("합격률은 %.1f%% 입니다", rate);
		System.out.println(result);
		
		
		
		
		
		
	}

}

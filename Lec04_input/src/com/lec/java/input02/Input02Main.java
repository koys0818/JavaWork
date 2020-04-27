package com.lec.java.input02;

import java.util.Scanner;
//CTRL SHIFT O import 단축키

public class Input02Main {

	public static void main(String[] args) {
		System.out.println("표준입력 : String, char");
		
		Scanner sc = new Scanner(System.in);
		
/*		//String 입력
		System.out.println("이름을 입력하세요: ");
		
		String name = sc.nextLine();
		String nick = sc.nextLine();
		// 엔터를 입력할때까지 모든 문자들을 문자열로 바꾼다
		
		
//		System.out.println("이름은 " + name + "\n별명은 " + nick + "입니다");
		
		// char 입력
		// nextchar() --> 이런 명령은 없다
		
		
		System.out.println("성별을 입력하세요 M/F: ");
		char gender = sc.next().charAt(0);
		
		System.out.println("이름은 " + name + "\n별명은 " + nick + "\n성별은 " + gender);
*/		
		System.out.println("나이를 입력하세요: ");
		
		int age = sc.nextInt();
		
		System.out.println("주소도 입력하세요: ");
		
		//숫자 입력 받은 뒤에 문자열 입력시에는 반드시 줄바꿈 '\n'을 consume (버퍼에서 제거) 해야함
		sc.nextLine();  //***
		
		String addr = sc.nextLine();
		
		System.out.println("나이: " + age + "\n주소: " + addr);
		
		
		
		
		sc.close();

	}

}

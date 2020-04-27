package com.lec.java.regexp04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 정규표현식 연습
 * 
 * 이번에 우리 쇼핑몰에서 할인 쿠폰을 발행하려 한다.
 * 발행되는 쿠폰의 일련번호 형식은 다음과 같다.
 * 
 *    알파벳두자리-숫자4자리-숫자3자리-알파벳3자리 
 * 
 * 알파벳은 대소문자 구문 없슴
 * 숫자는 0으로 시작하면 안됨.
 * 사용자는 발급받은 쿠폰번호를 입력해야 하는데, 
 * 위와 같은 형식만 받아들일수 있도록 만들자
 * 
 * 허용예]
 * 	Ab-7890-786-zuy
 * 	ki-2010-893-Zip
 * 
 * 불가]
 * 	xX-1200-089-zuy
 * 	p9-324-089-zopl
 * 
 *  쿠폰번호를 계속해서 입력 받으면서 
 * "유효한 쿠폰입니다"  혹은 "유효한 쿠폰이 아닙니다" 판정결과를 출력
 * 
 * 'quit' 입력하면 프로그램 종료

 */

public class RegExp04Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 예제");
		Scanner sc = new Scanner(System.in);
		String input;
		String regex;
		Pattern pat;
		Matcher matcher;
		
		while(true) {
			int count = 0;
			input = sc.nextLine();
			if(input.equals("quit")) {
				System.out.println("종료됩니다");
				break;
			}
			regex = "-";
			matcher = Pattern.compile(regex).matcher(input);
			while(matcher.find()) {
				count++;
//				System.out.println(matcher.group());
				
				
			}
			
			if(count != 3) {
				System.out.println("유효한 쿠폰이 아닙니다");
				continue;
				
			}
			count = 0;
			regex = "\\d";
			matcher.reset();
			matcher = Pattern.compile(regex).matcher(input);
			
			while(matcher.find()) {
				count++;
//				System.out.println(matcher.group());
				
				
				
			}
			if(count != 7) {
				System.out.println("유효한 쿠폰이 아닙니다");
				continue;
			}
			count = 0;
			regex = "[a-zA-Z]";
			matcher.reset();
			matcher = Pattern.compile(regex).matcher(input);
			
			while(matcher.find()) {
				count++;
//				System.out.println(matcher.group());
				
				
			}
			if(count != 5) {
				System.out.println("유효한 쿠폰이 아닙니다");
				continue;
			}
			count = 0;
			regex = "[a-zA-Z][0-9]";
			matcher.reset();
			matcher = Pattern.compile(regex).matcher(input);
			while(matcher.find()) {
				count++;
//				System.out.println(matcher.group());
			}
			if(count > 0) {
				System.out.println("유효한 쿠폰이 아닙니다");
				continue;
			}
			count = 0;
			regex = "[-][0]";
			matcher.reset();
			matcher = Pattern.compile(regex).matcher(input);
			while(matcher.find()) {
				count++;
//				System.out.println(matcher.group());
			}
			if(count > 0) {
				System.out.println("유효한 쿠폰이 아닙니다");
				continue;
			}
			
			System.out.println("유효한 쿠폰입니다");
			
			
		}
	} // end main

} // end class
//System.out.println("정규표현식\n");
//
//String regex, intput, title;
//String [] arrInput;
//
////─────────────────────────────────────────
//title = "^ : 바로 문자뒤의 문자열로 시작됨";
//regex = "^the"; // The로 시작하는 문자열 패턴
//arrInput = new String[] {
//		"the Things",
//		"on the",
//		" the the ",   // 앞에 공백 x
//		"the the the"
//};
////─────────────────────────────────────────
//title = "$ : 문자열의 마지막이 이 문자열로 마무리 됨";
//regex = "Man$"; // Man으로 끝나는 문자열 패턴
//arrInput = new String[] {
//		"SuperMan",
//		"AquaMan",
//		"wonderwoman",
//		"wonderwoMan",
//		"PostMan"
//};
//	
////─────────────────────────────────────────
//title = "^표현식$ : 정확하게 전체패턴매칭되는 문자열";
//regex = "^su...man$"; // su로 시작하고 임의의 문자 3개와 man으로 끝나야함
//arrInput = new String[] {
//		"superman",
//		"super man",
//		"Superman",
//		"SupermaN",
//};
//
////─────────────────────────────────────────
//title = " . : 어떤 문자든지 임의의 '한문자'를 말한다.꼭 하나의 문자와 매칭";
//regex = "x.y"; // TODO
//arrInput = new String[] {
//		"xyz",
//		"xxzdfdk",
//		"aa10x9zbxbz",
//		"xz",
//		"90x zxx_zdf",  // 공백도 하나의 문자다! 매칭된다
//		"xbz",				
//		"xyyz x1y xxyyyxyxyxxyxyxxyxyxyxxxxxyxyxx"
//};
//
////─────────────────────────────────────────
//title = " * : 바로 앞의 문자가 없거나 한개 이상의 경우를 매칭";
//regex = "ab*"; // TODO
//arrInput = new String[] {
//		"abc",
//		"ab",
//		"abbbaaaabababbab",   //8개
//		"bbba", //1개
//		"cdef"	//  x
//};
//
////─────────────────────────────────────────
//title = " + : 바로 앞의 문자를 나타내면 꼭 한개 혹은 그 이상을 매칭";
//regex = "ab+"; // TODO
//arrInput = new String[] {
//		"abc",  //1
//		"ab",	//1
//		"abbbaaaabababbab",
//		"bbba", //x
//		"cdef"	//x
//};
//
////─────────────────────────────────────────
//title = " ? : 바로 앞의 문자가 한개 있거나 없는것을 매칭";
//regex = "ab?"; // TODO
//arrInput = new String[] {
//		"abc",	//1
//		"ab",	//1
//		"abbbaaaabababbab",	//8
//		"bbba",	//1
//		"cdef"
//};
//title = " [] : 안에 존재하는 문자들중 한 문자만을 매칭";
//regex = "[abc]"; // abc중에 한 문자에 매칭
//arrInput = new String[] {
//		"able",	//1
//		"bible",	//2
//		"cable",	//3
//		"xenosys"	//x
//};
//regex ="[abc]+";
//regex ="[a-z]+";	//a부터 z까지 문자 1개 이상이면
//arrInput = new String[] {
//		"abc100",
//		"abcDefGHIUJ-KLM123opQrstuz"
//	};
//regex = "[a-zA-Z]+";
//regex = "[a-zA-Z0-9-]+";













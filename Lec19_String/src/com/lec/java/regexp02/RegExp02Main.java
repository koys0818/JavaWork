package com.lec.java.regexp02;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 그룹(group) 
 * 정규표현식에 () 을 사용하여  패턴 내에서 '그룹'을 지정 하면
 * () 의 개수만큼 그룹이 만들어진다.
 */
public class RegExp02Main {

	public static void main(String[] args) {
		System.out.println("정규표현식 : group");
		
		String input;
		String regex;
		Pattern pat;
		Matcher matcher;
//Matcher matcher = Pattern.compile(regex).matcher(input);
		
		System.out.println();
		regex = "(My)(....)";  // 정규표현식에 () 사용
		pat = Pattern.compile(regex);
		
		input = "-My98KK-myABCD--My1234567--MyZZ---My789";
		
		matcher = pat.matcher(input);
		
		System.out.println(matcher.groupCount());
		
		System.out.println("입력 문자열 : " + input);
		
		while(matcher.find() == true) {
			System.out.println(matcher.group() + matcher.start()+"~"+matcher.end());
			
			
			//매칭된 그릅 출력
			//group(in group), start(int group), end(int group)
			
			System.out.println("\t group(0) : " + matcher.group(0) + " { " + matcher.start(0) + "~" + matcher.end(0) +"}");
			System.out.println("\t group(0) : " + matcher.group(1) + " { " + matcher.start(1) + "~" + matcher.end(1) +"}");
			System.out.println("\t group(0) : " + matcher.group(2) + " { " + matcher.start(2) + "~" + matcher.end(2) +"}");
		}
		
		
		// 도우미 함수를 사용해보자
		System.out.println();
		re("My....","-My1234-");
		re("(My)(....)","-My1234-");
		re("My....",input);
		re("(My)(....)",input);
		
		
		System.out.println("프로그램 종료");
	} // end main
	
	// 도우미 함수
	public static void re(String regex,String input) {
		System.out.println("정규표현식 매칭 테스트 --------------");
		System.out.println("정규표현식 : " + regex);
		System.out.println("입력문자열 : " + input);
		
		Matcher matcher = Pattern.compile(regex).matcher(input);
		int groupcount = matcher.groupCount();	//그룹개수
		
		
		int matchercount = 0;
		while(matcher.find()) {
			matchercount++;
			System.out.println("     매치" + matcher.group() + matcher.start()+"~"+matcher.end());
			
			//그룹이 있었다면 group별 출력

			if(groupcount > 0 ) {
				for(int i = 0 ; i <= groupcount; i++) {
					System.out.printf("\t gorup(%d): %s {%d~%d}\n",
							i, matcher.group(i), matcher.start(i), matcher.end(i));
				}
			}
			
			
			
		} // while
		
		if(matchercount == 0)System.out.println("매칭 없음");
		System.out.println();
	}
	
} // end class


























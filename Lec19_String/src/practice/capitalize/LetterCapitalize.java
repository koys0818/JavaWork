package practice.capitalize;

import java.util.Arrays;
import java.util.Scanner;

/* LetterCapitalize
 * 	문장을 입력하고,  단어의 앞 문자를 대문자로 만들어 출력하기를 반복하다가
 *  quit 을 입력 받으면 종료하기
 * 
 * 	[입력예]
 * 		hello my world
 *  [출력예]
 * 		Hello My World  
 */

public class LetterCapitalize {
	
	// TODO : 필요한 메소드 있으면 추가 작성
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a;
		a = sc.nextLine();
		String[] str1 = a.split("\\s+");
		System.out.println(Arrays.toString(str1));
		System.out.println(str1[0]);
		String[] str2;
		str2 = str1[0].split("");
		System.out.print(str1[0].toUpperCase());
		sc.close();
	} // end main()
} // end class

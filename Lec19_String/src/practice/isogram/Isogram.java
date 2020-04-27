package practice.isogram;

import java.util.Arrays;
import java.util.Scanner;

/*	Isogram
	 문자열을 입력받으면 isogram 여부를 판단하여 true/false 를 출력하다가, quit 가 입력되면 종료
	isogram 이란?  : 중복된 알파벳이 없는 단어
	
	 isogram 예) Machine, isogram, Alphabet, quit
 */
public class Isogram {

	private static final Object[] String = null;

	// TODO : 필요한 메소드 있으면 추가 작성
  
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	int i, j;
    	
    	while(true) {
    		
    		String str = sc.nextLine();
    		if(str == "quit") {
    			break;
    		}
    		String[] str1 = str.split("");
    		
    		for(i = 0; i < str.length(); i++) {
    			for(j = str.length()-1; j > i ;j--) {
    				if(str1[i] == str1[j]) {
    					System.out.println("false");
    				}
    			}
    		}
    		
    	}
    	
    	sc.close();
    } // end main()
} // end class
 
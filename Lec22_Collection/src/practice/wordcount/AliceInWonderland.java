package practice.wordcount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

/* 1] 문서(문자열) 안의 단어의 빈도수를 계수해서 출력하기
 * 	- 대소문자 구분하지 않기 :   The 와 the 는 같은 단어
 *  - 2글자 이상만 계수하기
 *  - 구두점/기호 ",.\"\'`!?;:-()" 잘라내기
 *  - 공백 짤라내기
 * ex)
 * 	an : 234
 * 	the : 314
 * ...
 * 
 * hint]
 * 	split("\\s+")  --> String[]   
 * 	--> StringTokenizer  (혹은 정규표현식)
 *  	  --> HashMap<String, Integer>   <단어, 빈도수>  사용
 * ───────────────────────────────────────────────────────────    
 * 2] 빈도수 내림차순으로 정렬하여 출력하기
 * 	ex)
 *	1 the:113개
 *	2 she:95개
 *	3 to:85개
 *	...   
 *
 * hint]
 * 	Comparable<> 이나 Comparator<> 적용
 */

// TODO : 필요한 객체들 작성
// hint> 빈도수 담을 객체, Comparator<> ..

public class AliceInWonderland {

	public static void main(String[] args) {		
		System.out.println("실습: 단어 발생 빈도");
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		String[] words = C.ALICE30.trim().toLowerCase().split("\\W+|//d+");

		// 발생빈도 작성
		for(int i = 0 ; i < words.length; i++) {
			if(words[i].length() > 1) {
				printFreq(words);
				
			}
		}
		
		// 결과 출력
		// TODO
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	
	static void printFreq(String[] word) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		// 발생빈도 
		for (int i = 0; i < word.length; i++) {
			Integer v = hmap.get(word[i]);   
			
			if(v == null)   
				hmap.put(word[i], 1);   
			else
				hmap.put(word[i], v + 1);  
		}
		
		// 결과 출력
		 for(String key : hmap.keySet()){
			 
	            Integer value = hmap.get(key);
	 
	            System.out.println(key+" : "+value+"개");}

		
		
	}

} // end class

//while (keySetIterator.hasNext()) {
//	String key = keySetIterator.next();
//	System.out.println(key + " " + map.get(key));



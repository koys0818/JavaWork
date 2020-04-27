package com.lec.java.access03;

import com.lec.java.access04.TestPublic2;


// 다른 패키지의 (defalut) 클래스는 import 불가
//import com.lec.java.access04.MyDefalut2;


//다른 패키지 이름과 같은 이름의 클래스는 사용불가 (사용하려면 풀네임 써야됨)
//import com.lec.java.access04.TestPublic;



// 클래스의 접근 권한 수식어: public, (default)
// 1. public class: 어디에서나 인스턴스 생성이 가능한 클래스
//   (주의) public 클래스의 이름은 .java 파일 이름과 반드시 같아야 함
// 2. (default) class: 같은 패키지에 있는 클래스들에서만 인스턴스 생성이 가능

public class Access07Main {

	public static void main(String[] args) {
		System.out.println("public, default 클래스");
		
		TestPublic t1 = new TestPublic();
		
		
		//같은 패키지에 있는 클래스에서는 사용가능
		MyDefalut t2 = new MyDefalut();
		
		//다른 패키지에 있는 public 클래스 
		// --->인스턴스 사용가능
		
		TestPublic2 t3 = new TestPublic2();
		
		//다른 패키지에 있는 defalut 클래스
		// --->인스턴스 생성 불가
//		MyDefault2 t4;
		
		com.lec.java.access04.TestPublic t11 = 
				new com.lec.java.access04.TestPublic();
		
		
	} // end main()

} // end class Access05Main











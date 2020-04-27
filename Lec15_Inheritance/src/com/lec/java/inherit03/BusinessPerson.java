package com.lec.java.inherit03;
//하나의 부모한테서만 상속 가능함
public class BusinessPerson extends Person {
	
	String company;
	
	public void showInfo() {
		WhoAmI();
		System.out.println("회사는 " + company + "입니다");
	}
	

}

package com.lec.java.inherit02;


//basictv
//  - SmartTV
public class SmartTV extends BasicTV{
	
	String ip;
	
	public void displayInfo() {
		super.displayInfo();
		System.out.println("ip : " + ip);
	}

}

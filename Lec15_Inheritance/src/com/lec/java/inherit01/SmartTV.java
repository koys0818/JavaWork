package com.lec.java.inherit01;

public class SmartTV {
	//멤버변수
	boolean isPowerin;
	int channel;
	int volume;
	String ip;	//smarttv에서 새로 추가됨

	//메소드
	public void displayInfo() {
		System.out.println("----- TV 현재 상태 -----");
		System.out.println("전원 : " + isPowerin);
		System.out.println("채널 : " + channel);
		System.out.println("불륨 : " + volume);
		System.out.println("ip주소: " + ip);	// SmartTV에서 추가된 코드 
	}
	
}

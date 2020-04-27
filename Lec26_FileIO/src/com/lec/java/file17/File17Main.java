package com.lec.java.file17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* HTML 데이터, 웹데이터 (텍스트)
 * Java 에서 웹 연결을 위한 객체 두가지
 * 	1.URL : 웹 상의 주소, 
 * 	2.HttpURLConnection : 웹연결
 * 		URLConnection
 * 		 └─ HttpURLConnection
 * 
 * 	java.io.Reader    프로그램이 '문자 단위' 데이터를 읽어들이는(read) 통로
 * 		├─ java.io.InputStreamReader    // 스트림 기반의 reader
 * 		└─ java.io.BufferedReader 		// 문자(character) 기반 reader
 */

public class File17Main {

	public static void main(String[] args) {
		System.out.println("웹데이터 가져오기(텍스트)");
		
		String url = "https://www.naver.com/srchrank?frm=main&ag=20s&gr=0&ma=-2&si=-2&en=-2&sp=-2";
		
		StringBuffer sb = readFromUrl(url);
		System.out.println(sb);
		
		System.out.println("\n프로그램 종료");
	} // end main()
	
	/**
	 * 
	 * @param urlAddress : 주어진 url주소
	 * @return  서버로부터 받은 텍스트데이터(HTML) 리턴
	 */
	public static StringBuffer readFromUrl(String urlAddress) {
		
		StringBuffer sb = new StringBuffer();  // response 받은 데이터 담을 객체
		
		URL url = null;    // java.net.URL
		HttpURLConnection conn = null; // java.net.HttpURLConnection
		
		InputStream in = null;
		InputStreamReader reader = null;   // byte 스트림 --> 문자기반 Reader
		BufferedReader br = null; 
		
		char [] buf = new char[512];   // 문자용 버퍼
		
		// BufferedReader <- InputStreamReader <- InputStream <- HttpURLConnection 
		
		try {
			url = new URL(urlAddress);
			conn = (HttpURLConnection)url.openConnection();  // Connection 객체 생성
			
			if(conn != null) {
				conn.setConnectTimeout(2000);	//2초이내에 연결이 수립이 안되면 에러발생
				
				
				conn.setRequestMethod("GET");	//GET 방식 request
				//GET, PST....
				conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
				
				conn.setUseCaches(false);	//캐시 사용안함
				
				System.out.println("request 시작 : " + urlAddress);
				conn.connect();		// request 발생 --> 이후 response 받을때까지 delay
				System.out.println("response 완료");
				
				
				int responsecode = conn.getResponseCode();
				System.out.println("response 코드값 : " + responsecode);
				
				
				if(responsecode == HttpURLConnection.HTTP_OK) {
					
					
					in = conn.getInputStream();
					reader = new InputStreamReader(in,"utf-8");
					br = new BufferedReader(reader);	//BufferedReader <- inputStreamReader
					
					int cnt;	//읽은 글자의 개수
					while((cnt = br.read(buf)) != -1) {
						sb.append(buf,0,cnt);		//response 받은 텍스트를 추가
					}
					
					
					
				}else {
					System.out.println("response 실패");
					return null;
				}
				
			}else {
				System.out.println("conn null ");
				return null;
			}
			
				
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			if(conn != null) conn.disconnect();
		}
		
		
		return sb;
	}

} // end class











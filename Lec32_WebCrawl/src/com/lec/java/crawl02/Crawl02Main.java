package com.lec.java.crawl02;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl02Main {

	public static void main(String[] args) throws IOException {
		System.out.println("네이트 인기 검색어");
		
		String url;  // 크롤링할 주소 url
		Response response;  // response 객체
		Document doc;  // JSOUP의 document object model 객체
		Element element;  // HTML 의 element 표현 객체
		
		url = "https://www.nate.com";
		
		response = Jsoup.connect(url).execute();
		System.out.println(response.statusCode());
		
		doc = response.parse();
		
		Elements newsElements = doc.select(".search_keyword dd a");	
		//검색된 element들이 담겨있는 element 리턴
		System.out.println(newsElements.size());
		
		for(Element e : newsElements) {
			System.out.println(e.text().trim());
			System.out.println(e.attr("href").trim()); //주소
		}
		

	}

}

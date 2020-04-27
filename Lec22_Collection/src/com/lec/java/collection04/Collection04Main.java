package com.lec.java.collection04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.lec.java.collection03.Score;
import com.lec.java.collection03.Student;

public class Collection04Main {

	public static void main(String[] args) {
		System.out.println("ArrayList 연습");

		ArrayList<MemberModel> list = new ArrayList<MemberModel>();
		Scanner sc = new Scanner(System.in);
		System.out.println();
		for(int i = 0; i < 3; i++) {
			System.out.println("id : ");
			String id = sc.nextLine();
			System.out.println("passwd : ");
			String passwd = sc.nextLine();
			MemberModel member = new MemberModel(id,passwd);
			
			
			list.add(member);
		}
		sc.close();
		
		Iterator<MemberModel> itr = list.iterator();
		while(itr.hasNext()) {
			itr.next().displayInfo();
		}

		System.out.println("\n프로그램 종료");
	} // end main()

} // end class













package test;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("INSERT INTO " + "TBL_NAME" 
				+ "(pb_uid, pb_name, pb_phonenum, pb_memo) "
				+ "VALUES(" + "SEQ_NAME" + ".nextval, ?, ?, ?)");
		

	}

}

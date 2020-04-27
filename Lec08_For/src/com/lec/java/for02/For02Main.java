package com.lec.java.for02;

public class For02Main {

	public static void main(String[] args) {
		System.out.println("For문 - 구구단 출력");
		int i;
		int j;
		for(i=1;i<=9;i++)
		{
			for(j=1;j<=9;j++)
			{
				System.out.println(i + "*" + j + " = " + i*j);
			}
		}
		
		for(i=2,j=2;i<10;i++,j++)
		{
			System.out.println(i + "*" + j + " = " + i*j);
		}

	} // end main()

} // end class For02Main













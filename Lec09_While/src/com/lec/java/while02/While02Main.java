package com.lec.java.while02;

public class While02Main {

	public static void main(String[] args) {
		System.out.println("while 연습");
		int i = 1;
		while(i<10)
		{
			System.out.println("2 * " + i +" = " + 2*i);
			i++;
		}
		i = 0;
		while(i<10)
		{
			if(i % 2 == 1)
			{
				System.out.println(i);
			}
			i++;
		}
		


	} // end main()

} // end class While02Main










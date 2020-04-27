package 선택제어문.형성평가03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a % 400 == 0)
		{
			System.out.println("leap year");
		}
		else if(a % 4 == 0)
		{	
			if(a % 100 != 0)
			{
				System.out.println("leap year");
			}
			else
			{
				System.out.println("common year");
				
			}
		}
		else
		{
			System.out.println("common year");
		}

	}

}

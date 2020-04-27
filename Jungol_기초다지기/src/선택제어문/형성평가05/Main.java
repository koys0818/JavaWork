package 선택제어문.형성평가05;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a<8)
		{
			if(a == 2)
			{
				System.out.println("28");
				System.exit(0);
			}
			if(a % 2 == 0)
			{
				System.out.println("30");
			}
			else
			{
				System.out.println("31");
			}
		}
		else
		{
			if(a % 2 == 0)
			{
				System.out.println("31");
			}
			else
			{
				System.out.println("30");
			}
		}
		

	}

}

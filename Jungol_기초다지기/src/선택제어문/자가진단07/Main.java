package 선택제어문.자가진단07;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		if(a == 'A')
		{
			System.out.println("Excellent");
		}
		else if(a == 'B')
		{
			System.out.println("Good");
		}
		else if(a == 'C')
		{
			System.out.println("Usually");
		}
		else if(a == 'D')
		{
			System.out.println("Effort");
		}
		else if (a == 'F')
		{
			System.out.println("Failure");
			
		}
		else
		{
			System.out.println("error");
		}

	}

}

package 선택제어문.자가진단04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		if(a<=50.80)
		{
			System.out.println("Flyweight");
		}
		else if (a<=61.23)
		{
			System.out.println("Lightweight");
		}
		else if(a<=72.57)
		{
			System.out.println("Middleweight");
		}
		else if(a<=88.45)
		{
			System.out.println("Cruiserweight");
		}
		else if(a>88.45)
		{
			System.out.println("Heavyweight");
		}

	}

}

package 선택제어문.자가진단03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a>=20)
		{
			System.out.println("adult");
		}
		else {
			System.out.println((20-a) + " years later");
		}

	}

}

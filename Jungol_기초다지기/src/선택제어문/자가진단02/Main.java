package 선택제어문.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		a = sc.nextInt();
		b= sc.nextInt();
		System.out.println(b+100-a);
		if((b+100-a) > 0)
		{
			System.out.println("Obesity");
		}

	}

}

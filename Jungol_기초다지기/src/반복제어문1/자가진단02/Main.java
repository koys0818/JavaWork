package 반복제어문1.자가진단02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int total = 0;
		while(a != 0)
		{
			total = total + a;
			a= a- 1;
		}
		System.out.println(total);

	}

}

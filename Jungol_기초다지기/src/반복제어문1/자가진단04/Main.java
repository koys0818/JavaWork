package 반복제어문1.자가진단04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 0 ;
		float b = 0;
		Scanner sc = new Scanner(System.in);
		int total = 0;
		while(a < 100) {
			a = sc.nextInt();
			total = a + total;
			b++;
			
		}
		System.out.println(total);
		System.out.printf("%.1f",total/b);
		
		sc.close();

	}

}

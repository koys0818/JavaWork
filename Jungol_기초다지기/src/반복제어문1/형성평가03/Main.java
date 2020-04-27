package 반복제어문1.형성평가03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int i = 0, j = 0;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		while(i <= 100) {
			total = total + i;
			i = sc.nextInt();
			j++;
		}
		System.out.println("sum : " + total);
		System.out.printf("avg : %.1f",(double)total/(j-1));
		sc.close();
		

	}

}

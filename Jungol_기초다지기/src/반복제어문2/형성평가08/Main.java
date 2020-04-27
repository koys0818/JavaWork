package 반복제어문2.형성평가08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int i,j;
		int c = 1;
		for (i = 1;i <= a;i++) {
			for(j = 1; j <= b ; j++) {
				System.out.print(i * c + " ");
				c++;
			}
			c = 1;
			System.out.println();
		}

	}

}

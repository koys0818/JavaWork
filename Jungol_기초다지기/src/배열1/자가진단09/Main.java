package 배열1.자가진단09;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, j, k;
		int a [] = new int [10];
		for(i=0;i<10;i++) {
			a[i] = sc.nextInt();
		}
		for(k=0;k<10;k++) {
			for(i=1;i<10;i++) {
				if(a[i] > a[i-1]) {
					j = a[i];
					a[i] = a[i-1];
					a[i-1] = j;
				}
			}
		}
		for(i=0;i<10;i++) {
			System.out.print(a[i] + " ");
		}
		
		
	}

}

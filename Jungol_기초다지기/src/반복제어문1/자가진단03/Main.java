package 반복제어문1.자가진단03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		Scanner sc = new Scanner(System.in);
		while(a != 0)
		{
			a = sc.nextInt();
			if(a>0)
			{
				System.out.println("positive integer");
			}
			else if(a<0)
			{
				System.out.println("negative number");
			}
		}
		
	}

}

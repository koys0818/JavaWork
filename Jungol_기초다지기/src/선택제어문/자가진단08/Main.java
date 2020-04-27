package 선택제어문.자가진단08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextDouble();
		switch((int)a) {
		case 4 : 
			System.out.println("scholarship");
			break;
		case 3 : 
			System.out.println("next semester");
			break;
		case 2 : 
			System.out.println("seasonal semester");
			break;
		case 1 :
			System.out.println("retake");
			break;
		case 0 :
			System.out.println("retake");
			break;
		}
		

	}

}

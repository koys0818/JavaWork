package practice.game369;

public class Game369 {

	public static void main(String[] args) {
		int i, j;
		for(i = 1 ; i < 11; i++) {
			if(i % 3 == 0) {
				System.out.print("*   ");
			}
			else {
				System.out.print(i + "   ");
			}
		}
		System.out.println();
		for(i = 1 ; i < 10 ; i++) {
			for(j = 1; j < 10 ; j++) {
				if(i % 3 == 0 || j % 3 == 0) {
					System.out.print("*   ");
				}
				else {
					System.out.print(10*i + j + "  ");
				}
			}
			
			if((i+1) % 3 == 0) {
				System.out.print("*   ");
			}
			else {
				System.out.print(10*(i+1) + " ");
			}
			System.out.println();
		}

	}

}

package practice.gugu2;

public class Gugu2 {

	public static void main(String[] args) {
		int i ,j;
		int a=0;
		for(i=2;i<9;i+=3)
		{
			for(j=1;j<10;j+=3)
			{
				System.out.print(i + " * " + j + " = "
				+ i*j + "\t");
				
				i++;
				System.out.print(i + " * " + j + " = "
					+ i*j + "\t");
				i++;
				if(i <10)
				{
					System.out.print(i + " * " + j + " = "
				+ i*j + "\t");
				}
				System.out.println("");
				i -= 2;
				j -= 2;
			}
			System.out.println();
		}

	}

}

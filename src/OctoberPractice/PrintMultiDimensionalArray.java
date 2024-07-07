package OctoberPractice;

public class PrintMultiDimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		a[0][0] = 2;
		a[0][1] = 3;
		a[1][0] = 4;
		a[1][1] = 5;
		
		for (int i=0; i<2; i++)
		{
			for (int j = 0; j<2; j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
		System.out.println("--------------------");
		
		int b[][] = {{2,3},{4,5}};
		for (int i=0; i<2; i++)
		{
			for (int j = 0; j<2; j++)
			{
				System.out.println(b[i][j]);
			}
		}
		

	}

}

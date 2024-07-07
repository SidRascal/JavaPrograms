package OctoberPractice;

public class MinimumNumberAndMaxNumberFromSameColumn {
	
	public static void main(String[] args) {
		
		
		int abc[][] = {{2,3,4}, {4,6,7}, {3
			,1,2}};
		int min = abc[0][0];
		int minColumn = 0;
		
		for (int i = 0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (abc[i][j]<min)
				{
					min = abc[i][j];
					minColumn = j;
				}
			}
		}
		int max = abc[0][minColumn];
		int k = 0;
		while (k<3)
		{
			if(abc[k][minColumn]>max)
			{
				max = abc[k][minColumn];
			}
			k++;
		}
		System.out.println("Max Number in particular column is " +max);
	}

}

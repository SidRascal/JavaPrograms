package OctoberPractice;

public class MinimumNumberInArray {
	
	public static void main(String[] args) {
		
		
		int abc[][] = {{2,3,4}, {4,6,7}, {1,1,2}};
		int min = abc[0][0];
		
		for (int i = 0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				if (abc[i][j]<min)
				{
					min = abc[i][j];
				}
			}
		}
		System.out.println("Minimum Number from multidimensional array is " +min);
	}

}

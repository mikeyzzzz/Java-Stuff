import java.util.Arrays;
import java.util.Random;

public class Problem03 
{

	public static void main(String[] args) 
	{
		int n = 3; 
		
		int[][] filledMatrix = createArray(n);
		
		System.out.println(Arrays.deepToString(filledMatrix));
		
		System.out.println(sumOfMajorDiagonal(filledMatrix,n));

	}

	public static int[][] createArray(int n)
	{
		int[][] filledMatrix = new int[n][n];
		Random r = new Random();
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				filledMatrix[i][j] = r.nextInt(100-1)+1;
			}
		}
		
		return filledMatrix;
	}
	
	public static int sumOfMajorDiagonal(int[][] array, int n)
	{
		int sum = 0;
		
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(i==j)
				{
					sum += array[i][j];
				}
			}
		}
		
		return sum;
	}

}

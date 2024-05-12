
public class Problem01 
{
	/**********************************************
	 * Develop a method that given an double array
	 * of scored in a test returns the number of 
	 * grades below the average grade 
	 **********************************************/

	public static void main(String[] args)
	{
		double testScores[] = {1,2,3,4,5,1,2,3,4,5,100,99,98,97,96,95,100,99,98,97,96,95};
		
		System.out.print(numberOfGradesBelowAverage(testScores));
		
	}
	
	public static double averageGrade(double scores[])
	{
		double sum = 0;
		
		for(int i=0;i<scores.length-1;i++)
		{
			sum += scores[i];
		}
		
		return sum/scores.length;
	}
	
	public static int numberOfGradesBelowAverage(double scores[])
	{
		double average = averageGrade(scores);
		int count = 0;
		
		for(int i=0;i<scores.length;i++)
		{
			if (scores[i]<average)
			{
				count += 1;
			}
		}
		
		return count;
		
	}

}

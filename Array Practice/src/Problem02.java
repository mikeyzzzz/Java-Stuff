
public class Problem02 
{

	public static void main(String[] args) 
	{
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		
		int[] frequencyArray=frequency(array);
		
		System.out.print(frequencyArray[9]);

	}
	
	public static int[] frequency(int array[])
	{
		int[] frequency = new int[10];
		int value = -1;
		
		for(int i=0;i<array.length;i++)
		{
			value = array[i];
			for(int j=0;j<frequency.length;j++)
			{
				if (value == j)
				{
					frequency[j] += 1;
				}
			}
		}
		
		return frequency;
	}

}

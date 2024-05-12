import javax.swing.JOptionPane;

public class TwoDArray 
{
	private int[][] array;
	private int rows;
	private int columns;
	private int low;
	private int high;
	
public TwoDArray(int r, int c, int l, int h)
{
	rows = r;
	columns = c;
	low = l;
	high = h;
	array = new int[rows][columns];
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			array[i][j] = low + (int)((high-low+1)*Math.random());
		}
	}
}
public TwoDArray()
{
	rows = 10;
	columns = 10;
	low = 1;
	high = 100;
	array = new int[rows][columns];
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			array[i][j] = low + (int)((high-low+1)*Math.random());
		}
	}
	
}
public void createArray()
{
	String input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
			"Rows for One-Dimensional Array",JOptionPane.QUESTION_MESSAGE);
    rows=Integer.parseInt(input);
    input = JOptionPane.showInputDialog(null,"Please enter an integer > 0:",
			"Columns for Two-Dimensional Array",JOptionPane.QUESTION_MESSAGE);
    columns = Integer.parseInt(input);
    array = new int[rows][columns];
    input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
			"Lowest Value in the Array",JOptionPane.QUESTION_MESSAGE);
    low = Integer.parseInt(input);
    input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
			"Highest Value in the Array",JOptionPane.QUESTION_MESSAGE);
    high = Integer.parseInt(input);
    
    for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			array[i][j] = low + (int)((high-low+1)*Math.random());
		}
	}
}
public int getMaximum()
{
	int max = Integer.MIN_VALUE;
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			if(array[i][j] > max)
			{
				max = array[i][j];
			}
			
		}
	}
	return max;
}
public int getMinimum()
{
	int min = Integer.MAX_VALUE;
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			if(array[i][j] < min)
			{
				min = array[i][j];
			}
			
		}
	}
	return min;
}
public double getAverage()
{
	int sum = 0;
	
	for (int i=0; i<rows; i++)
	{
		for (int j=0;j<columns;j++)
		{
			sum += array[i][j];
		}
	}
	return sum/(rows*columns);
}
public int[][] getArray()
{
	return array;
}
public boolean search(int key)
{
	for(int i=0;i<array.length;i++)
	{
		for(int j=0;j<array[0].length;j++)
		{
			if(array[i][j] == key)
			{
				return true;
			}
		}
	}
	return false;
}


}

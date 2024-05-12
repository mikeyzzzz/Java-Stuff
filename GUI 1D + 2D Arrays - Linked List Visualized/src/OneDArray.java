import java.util.Arrays;

import javax.swing.JOptionPane;


public class OneDArray 
{
	private int[] array;
	private int size;
	private int low;
	private int high;
	
public OneDArray(int s, int l, int h)
{
	array = new int[s];
	for (int i=0; i<s; i++)
    	array[i] = l + (int)((h-l+1)*Math.random());
}
public OneDArray()
{
	size = 100;
	low = 1;
	high = 100;
	array = new int[size];
	for (int i=0; i<size; i++)
    	array[i] = low + (int)((high-low+1)*Math.random());
}
public void createArray()
{
	String input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
			"Size of One-Dimensional Array",JOptionPane.QUESTION_MESSAGE);
    size=Integer.parseInt(input);
    array = new int[size];
    input = JOptionPane.showInputDialog(null,"Please enter an integer > 0:",
			"Lowest Value in the Array",JOptionPane.QUESTION_MESSAGE);
    low = Integer.parseInt(input);
    input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
			"Highest Value in the Array",JOptionPane.QUESTION_MESSAGE);
    high = Integer.parseInt(input);
    for (int i=0; i<size; i++)
    	array[i] = low + (int)((high-low+1)*Math.random());
}
public int getMaximum()
{
	int maximum = Integer.MIN_VALUE;
		
		for(int i=0;i<this.array.length;i++)
		{
			if(this.array[i]>maximum)
			{
				maximum = this.array[i];
			}
		}
		
		return maximum;
}
public int getMinimum()
{
	int minimum = Integer.MAX_VALUE;
	
	for(int i=0;i<this.array.length;i++)
	{
		if(this.array[i]<minimum)
		{
			minimum = this.array[i];
		}
	}
	
	return minimum;
}
public double getAverage()
{
	int sum = 0;
	
	for(int i=0;i<this.array.length;i++)
	{
		
		sum += this.array[i];
		
	}
	return sum/this.array.length;
}

public boolean search(int key)
{
	for(int i=0;i<this.getArray().length;i++)
	{
		if(this.getArray()[i] == key)
		{
			return true;
		}
	}
	
	return false;
}
public int[] sortFull() //to show my understanding of how sort works
{
	int[] copyArray = this.array;
	int tempSort = 0;
	
	for(int currIndex=0;currIndex<copyArray.length;currIndex++)
	{
		for(int nextIndex=currIndex+1;nextIndex<copyArray.length;nextIndex++)
		{
			if(copyArray[currIndex] > copyArray[nextIndex])
			{
				tempSort = copyArray[currIndex];
				copyArray[currIndex] = copyArray[nextIndex];
				copyArray[nextIndex] = tempSort;
			}
		}
	}
	
	return copyArray;
}

public int[] sort()
{
	Arrays.sort(this.getArray());
	return this.getArray();
}
public int[] getArray() { return array;}
public int getSize() { return size;}
public int getLow() { return low;}
public int getHigh() { return high;}
}

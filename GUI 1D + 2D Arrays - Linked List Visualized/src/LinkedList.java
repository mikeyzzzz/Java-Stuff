import java.util.Arrays;

import javax.swing.JOptionPane;

public class LinkedList 
{
	private Node head;
	private Node tail;
	private int size;
	private int low;
	private int high;
	
	public LinkedList()
	{
		head = null;
		tail = null;
		size = 0;
		low = 0;
		high = 100;
	}
	public LinkedList(Node h, Node t, int s, int l, int hi)
	{
		head = h;
		tail = t;
		size = s;
		low = l;
		high = hi;
	}
	public void createList()
	{
		String input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
				"Size of Linked List",JOptionPane.QUESTION_MESSAGE);
	    size=Integer.parseInt(input);
	    System.out.println("Size = "+size);
	    input = JOptionPane.showInputDialog(null,"Please enter an integer > 0:",
				"Lowest Value in the Linked List",JOptionPane.QUESTION_MESSAGE);
	    low = Integer.parseInt(input);
	    input = JOptionPane.showInputDialog(null,"Please enter an integer < 1000:",
				"Highest Value in the Linked List",JOptionPane.QUESTION_MESSAGE);
	    high = Integer.parseInt(input);
	    
	  // Create the linked list by adding the new nodes to the end of the list
	    int s = size;
	    size = 0;
	    for (int i=0; i<s; i++)
	    {
	    	int k = low + (int)((high-low+1)*Math.random());
	    	addEnd(k);
	    }
	    
	}
	public void addBegining(int v)
	{
		Node t = new Node();
		t.setData(v);
		t.setNext(null);
		if (head == null)
		{
			head = t;
			tail = t;
		}
		else
		{
			t.setNext(head);
			head = t;
		}
		size++;
	}
	public void addEnd(int v)
	{	
		Node t = new Node();
		t.setData(v);
		
		if (head == null)
		{
			head = t;
			tail = t;
		}
		else
		{
			tail.setNext(t);
			tail = t;
		}
		size++;
	}
	public int getMinimum()
	{
		int min = head.getData();
		Node t = head;
		while (t != null)
		{
			if (min > t.getData())
				min = t.getData();
			t = t.getNext();
		}
		return min;
	}
	public int getMaximum()
	{
		int max = head.getData();
		Node t = head;
		while (t != null)
		{
			if (max < t.getData())
				max = t.getData();
			t = t.getNext();
		}
		return max;
	}
	public double getAverage()
	{
		Node t = head;
		int sum = 0;
		
		while (t != null)
		{
			sum += t.getData();
			t = t.getNext();
		}
		return sum/size;
	}
	public boolean search(int key)
	{
		Node t = head;
		while (t != null)
		{
			if(t.getData() == key)
			{
				return true;
			}
			t = t.getNext();
		}
		return false;
	}
	public void sort()
	{
		int[] array = new int[size];
		Node t = head;
		int count = 0;
		
		while (t != null)
		{
			array[count] = t.getData();
			t = t.getNext();
			count += 1;
		}
		
		Arrays.sort(array);
		
		t = head;
		count = 0;
		while (t != null)
		{
			t.setData(array[count]);
			t = t.getNext();
			count += 1;
		}
	}
	public Node getHead() { return head;}
	public Node getTail() {return tail;}
	public int getSize()  { return size;}
	public int getLow()   { return low;}
	public int getHigh()  { return high;}
}

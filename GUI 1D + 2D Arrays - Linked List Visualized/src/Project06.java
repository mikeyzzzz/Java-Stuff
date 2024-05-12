import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Project06 extends Frame implements ActionListener
{
	String command = "";
	int key;
	int newNodeVal;
	boolean found;
	Font f = new Font("SansSerif",Font.BOLD,12);
	Font f1 = new Font("SansSerif",Font.BOLD,16);
	
	OneDArray originalArray;
	TwoDArray twoDArray;
	int[] originalCopy;
	
	LinkedList list;
	
	public static void main(String[] args)
	{
		Frame frame = new Project06();	
		frame.setResizable(true);
		frame.setSize(1000,800);
		frame.setVisible(true);
	}
	
	public Project06()
	{
		setTitle("CSC 229 - Project 6 - Lists");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File");
		mb.add(fileMenu);
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		
		Menu actionMenu = new Menu("One Dimensional Array");
		mb.add(actionMenu);
		
		MenuItem miCreate1D = new MenuItem("Create Array");
		miCreate1D.addActionListener(this);
		actionMenu.add(miCreate1D);
		
		Menu statsMenu1D = new Menu("Statistics");
		actionMenu.add(statsMenu1D);
		
		MenuItem miMinimum1D = new MenuItem("Array Minimum");
		miMinimum1D.addActionListener(this);
		statsMenu1D.add(miMinimum1D);
		
		MenuItem miMaximum1D = new MenuItem("Array Maximum");
		miMaximum1D.addActionListener(this);
		statsMenu1D.add(miMaximum1D);
		
		MenuItem miAverage1D = new MenuItem("Array Average");
		miAverage1D.addActionListener(this);
		statsMenu1D.add(miAverage1D);
		
		MenuItem miSort = new MenuItem("Sort Array");
		miSort.addActionListener(this);
		actionMenu.add(miSort);
		
		MenuItem miSearch1D = new MenuItem("Search Array");
		miSearch1D.addActionListener(this);
		actionMenu.add(miSearch1D);
		
		// Linked List
		
		Menu actionMenu1 = new Menu("Linked List");
		mb.add(actionMenu1);
		
		MenuItem createList = new MenuItem("Create List");
		createList.addActionListener(this);
		actionMenu1.add(createList);
		
		Menu statsMenuList = new Menu("Statistics");
		actionMenu1.add(statsMenuList);
		
		MenuItem miMinimumList = new MenuItem("List Minimum");
		miMinimumList.addActionListener(this);
		statsMenuList.add(miMinimumList);
		
		MenuItem miMaximumList = new MenuItem("List Maximum");
		miMaximumList.addActionListener(this);
		statsMenuList.add(miMaximumList);
		
		MenuItem miAverageList = new MenuItem("List Average");
		miAverageList.addActionListener(this);
		statsMenuList.add(miAverageList);
		
		MenuItem miSortList = new MenuItem("Sort List");
		miSortList.addActionListener(this);
		actionMenu1.add(miSortList);
		
		MenuItem miSearchList = new MenuItem("Search List");
		miSearchList.addActionListener(this);
		actionMenu1.add(miSearchList);
		
		MenuItem miAddBeginningList = new MenuItem("Add to Beginning");
		miAddBeginningList.addActionListener(this);
		actionMenu1.add(miAddBeginningList);
		
		MenuItem miAddEndList = new MenuItem("Add to End");
		miAddEndList.addActionListener(this);
		actionMenu1.add(miAddEndList);
		
		//Two D Array
		
		Menu actionMenu2 = new Menu("Two Dimensional Array");
		mb.add(actionMenu2);
		
		MenuItem create2D = new MenuItem("Create 2D Array");
		create2D.addActionListener(this);
		actionMenu2.add(create2D);
		
		Menu statsMenu2D = new Menu("Statistics");
		actionMenu2.add(statsMenu2D);
		
		MenuItem miMinimum2D = new MenuItem("2D Array Minimum");
		miMinimum2D.addActionListener(this);
		statsMenu2D.add(miMinimum2D);
		
		MenuItem miMaximum2D = new MenuItem("2D Array Maximum");
		miMaximum2D.addActionListener(this);
		statsMenu2D.add(miMaximum2D);
		
		MenuItem miAverage2D = new MenuItem("2D Array Average");
		miAverage2D.addActionListener(this);
		statsMenu2D.add(miAverage2D);
		
		MenuItem miSearch2D = new MenuItem("Search 2D Array");
		miSearch2D.addActionListener(this);
		actionMenu2.add(miSearch2D);
	
		// End program when window is closed
		
		WindowListener l = new WindowAdapter()
		{
						
			// window closed - exit program						
			public void windowClosing(WindowEvent ev)
			{
				System.exit(0);
			}
			// menu option selected - go to redraw and display method
			public void listener(WindowEvent ev)
			{
				repaint();
			}
			// window resized or refocused - redraw
			public void windowStateChanged(WindowEvent ev)
			{
				repaint();
			}
		
		};
		
		ComponentListener k = new ComponentAdapter()
		{
			public void componentResized(ComponentEvent e) 
			{
        		repaint();           
    		}
		};
		
		// register listeners
			
		this.addWindowListener(l);
		this.addComponentListener(k);

	}
	
//******************************************************************************
//  called by windows manager whenever the application window performs an action
//  (select a menu item, close, resize, ....
//******************************************************************************

	public void actionPerformed (ActionEvent ev)
		{
			// figure out which command was issued
			
			command = ev.getActionCommand();
			
			// take action accordingly
			if("About".equals(command))
			{
				repaint();
			}
			else
			if("Exit".equals(command))
			{
				System.exit(0);
			}
			else
			if("Create Array".equals(command))
			{
				originalArray = new OneDArray();
				originalArray.createArray();
				
				repaint();
			}
			else
			if("Array Minimum".equals(command))    
			{
				repaint();
			}
			else
			if("Array Maximum".equals(command))    
			{
				repaint();
			}
			else
			if("Array Average".equals(command))    
			{
				repaint();
			}
			else
			if("Sort Array".equals(command))
			{
				originalCopy = originalArray.getArray();
				repaint();
			}
			else
			if("Search Array".equals(command))
			{
				
				String input = JOptionPane.showInputDialog(null,"Please enter an integer Number to Search for:",
						"Search Key",JOptionPane.QUESTION_MESSAGE);
			    key = Integer.parseInt(input);
			    found = originalArray.search(key);
				repaint();
			}
			// Linked List Operations
			else
			if("Create List".equals(command))
			{
				list = new LinkedList();
				list.createList();
				
				repaint();
			}
			else
			if("List Minimum".equals(command))    
			{
				repaint();
			}
			else
			if("List Maximum".equals(command))    
			{
				repaint();
			}
			else
			if("List Average".equals(command))    
			{
				repaint();
			}
			else
			if("Sort List".equals(command))    
			{
				repaint();
			}
			else
			if("Search List".equals(command))    
			{
				String input = JOptionPane.showInputDialog(null,"Please enter an integer Number to Search for:",
						"Search Key",JOptionPane.QUESTION_MESSAGE);
				found = false; //in case it was true from search array
			    key = Integer.parseInt(input);
			    found = list.search(key);
				repaint();
			}
			else
			if("Add to Beginning".equals(command))    
			{
				String input = JOptionPane.showInputDialog(null,"Please enter an integer number to add to beginning:",
						"Add",JOptionPane.QUESTION_MESSAGE);
				
				newNodeVal = Integer.parseInt(input);
				repaint();
			}
			else
			if("Add to End".equals(command))    
			{
				String input = JOptionPane.showInputDialog(null,"Please enter an integer number to add to beginning:",
						"Add",JOptionPane.QUESTION_MESSAGE);
				
				newNodeVal = Integer.parseInt(input);
				repaint();
			}
			//2D array
			else
			if("Create 2D Array".equals(command))
			{
				twoDArray = new TwoDArray();
				twoDArray.createArray();
				
				repaint();
			}
			else
			if("2D Array Minimum".equals(command))    
			{
				repaint();
			}
			else
			if("2D Array Maximum".equals(command))    
			{
				repaint();
			}
			else
			if("2D Array Average".equals(command))    
			{
				repaint();
			}
			else
			if("Search 2D Array".equals(command))
			{
				
				String input = JOptionPane.showInputDialog(null,"Please enter an integer Number to Search for:",
						"Search Key",JOptionPane.QUESTION_MESSAGE);
				found = false; //in case it was true from search array
			    key = Integer.parseInt(input);
			    found = twoDArray.search(key);
				repaint();
			}

			
		}
//********************************************************
// called by repaint() to redraw the screen
//********************************************************
		
		public void paint(Graphics g)
		{
			
			// Check Command issued, take action accordingly
			int ww = this.getWidth();
			int currentY;
			
			g.setFont(f);
			if("Create Array".equals(command))
			{
				int x=100;
				int y = 100;
				int[] t = originalArray.getArray();
				currentY = displayArray(g,t,x,y,ww,"Original Array");
			}
			
			else
			if("Array Minimum".equals(command))
			{
				int x=100;
				int y = 100;
				int[] t = originalArray.getArray();
				currentY = displayArray(g,t,x,y,ww,"Original Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Minimum = "+Integer.toString(originalArray.getMinimum()), ww/2-50, currentY);
					
			}
			else
			if("Array Maximum".equals(command))
			{
				int x=100;
				int y = 100;
				int[] t = originalArray.getArray();
				currentY = displayArray(g,t,x,y,ww,"Original Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Maximum = "+Integer.toString(originalArray.getMaximum()), ww/2-50, currentY);
					
			}
			else
			if("Array Average".equals(command))
			{
				int x=100;
				int y = 100;
				int[] t = originalArray.getArray();
				currentY = displayArray(g,t,x,y,ww,"Original Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Average = "+Double.toString(originalArray.getAverage()), ww/2-50, currentY);
					
			}
			else
			if("Sort Array".equals(command))
			{
				int x=100;
				currentY = 100;
				
				currentY = displayArray(g,originalCopy,x,currentY,ww,"Original Array");
				originalArray.sort();
				currentY = displayArray(g,originalArray.getArray(),x,currentY,ww,"Sorted Array");
				
			}
			else
			if("Search Array".equals(command))
			{
				int x=100;
				int y = 100;
				int[] t = originalArray.getArray();
				currentY = displayArray(g,t,x,y,ww,"Original Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				
				if(found)
				{
					g.drawString("Search Key ****"+ key + "****" + "Found", ww/2-100, currentY+25);

				}
				else
				{
					g.drawString("Search Key ****"+ key + "****" + "NOT Found", ww/2-100, currentY+25);
				}
				
				
			}
			// Linked List Operations ********** Add Code         **********************************
			else
			if("Create List".equals(command))
			{
				int x=100;
				int y = 100;
				LinkedList t = list;
				currentY = displayList(g,t,x,y,ww,"Linked List");
			}
			else
			if("List Minimum".equals(command))
			{
				int x=100;
				int y = 100;
				LinkedList t = list;
				currentY = displayList(g,t,x,y,ww,"Linked List");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Minimum = "+Integer.toString(t.getMinimum()), ww/2-50, currentY+30);
			}
			else
			if("List Maximum".equals(command))
			{
				int x=100;
				int y = 100;
				LinkedList t = list;
				currentY = displayList(g,t,x,y,ww,"Linked List");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Maximum = "+Integer.toString(t.getMaximum()), ww/2-50, currentY+30);
			}
			else
			if("List Average".equals(command))
			{
				int x=100;
				int y = 100;
				LinkedList t = list;
				currentY = displayList(g,t,x,y,ww,"Linked List");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Average = "+Double.toString(t.getAverage()), ww/2-50, currentY+30);
			}
			else
			if("Sort List".equals(command))
			{
				int x=100;
				currentY = 100;
				
				currentY = displayList(g,list,x,currentY,ww,"Linked List");
				list.sort();
				currentY += 70;
				currentY = displayList(g,list,x,currentY,ww,"Sorted List");
			}
			else
			if("Search List".equals(command))
			{ 
				int x=100;
				int y = 100;
				LinkedList t = list;
				currentY = displayList(g,t,x,y,ww,"Linked List");
				g.setFont(f1);
				g.setColor(Color.RED);
				
				if(found)
				{
					g.drawString("Search Key ****"+ key + "****" + "Found", ww/2-100, currentY+25);

				}
				else
				{
					g.drawString("Search Key ****"+ key + "****" + "NOT Found", ww/2-100, currentY+25);
				}
			}
			else
			if("Add to Beginning".equals(command))
			{
				int x=100;
				currentY = 100;
				
				currentY = displayList(g,list,x,currentY,ww,"Linked List");
				list.addBegining(newNodeVal);
				currentY += 70;
				currentY = displayList(g,list,x,currentY,ww,"New Linked List");
			}
			else
			if("Add to End".equals(command))
			{
				int x=100;
				currentY = 100;
				
				currentY = displayList(g,list,x,currentY,ww,"Linked List");
				list.addEnd(newNodeVal);
				currentY += 70;
				currentY = displayList(g,list,x,currentY,ww,"New Linked List");
			}
			// 2D Array
			else
			if("Create 2D Array".equals(command))
			{
				int x=ww/2;
				int y = 100;
				int[][] t = twoDArray.getArray();
				currentY = display2DArray(g,t,x-t[0].length*17,y,ww,"2D Array");
			}
			else
			if("2D Array Minimum".equals(command))
			{
				int x=ww/2;
				int y = 100;
				int[][] t = twoDArray.getArray();
				currentY = display2DArray(g,t,x-t[0].length*17,y,ww,"2D Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Minimum = " + twoDArray.getMinimum(),ww/2-60, currentY+10);
			}
			else
			if("2D Array Maximum".equals(command))
			{
				int x=ww/2;
				int y = 100;
				int[][] t = twoDArray.getArray();
				currentY = display2DArray(g,t,x-t[0].length*17,y,ww,"2D Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Maximum = " + twoDArray.getMaximum(),ww/2-60, currentY+10);
			}
			else
			if("2D Array Average".equals(command))
			{
				int x=ww/2;
				int y = 100;
				int[][] t = twoDArray.getArray();
				currentY = display2DArray(g,t,x-t[0].length*17,y,ww,"2D Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				g.drawString("Average = " + twoDArray.getAverage(),ww/2-60, currentY+10);
			}
			else
			if("Search 2D Array".equals(command))
			{ 
				int x=ww/2;
				int y = 100;
				int[][] t = twoDArray.getArray();
				currentY = display2DArray(g,t,x-t[0].length*17,y,ww,"2D Array");
				g.setFont(f1);
				g.setColor(Color.RED);
				
				if(found)
				{
					g.drawString("Search Key ****"+ key + "****" + "Found", ww/2-100, currentY+25);

				}
				else
				{
					g.drawString("Search Key ****"+ key + "****" + "NOT Found", ww/2-100, currentY+25);
				}
			}
		}
		public int displayArray(Graphics g, int[] a, int x, int y, int ww, String title)
		{
			int xs = x;
			
			g.setFont(f1);
			g.setColor(Color.RED);
			g.drawString(title, ww/2-40, y-20);
			
			g.setFont(f);
			g.setColor(Color.BLACK);
			
			for(int i=0;i<a.length;i++)
			{
				g.drawString(Integer.toString(a[i]), xs, y);
				xs += 35;
				
				if(xs>ww-100)
				{
					y += 20;
					xs = x;
				}
			}
			return y+40;
		}
		public int displayList(Graphics g, LinkedList l, int x, int y, int ww, String title)
		{
			int xs = x;
			Node t = l.getHead();
			
			g.setFont(f1);
			g.setColor(Color.RED);
			g.drawString(title, ww/2-40, y-20);
			
			g.setFont(f);
			g.setColor(Color.BLACK);
			
			while ( t != null)
			{
				g.drawRect(xs, y, 50, 25);
				g.drawString(Integer.toString(t.getData()), xs+15, y+17);
				xs += 75;
				g.drawString("->", xs-15, y+17);
				if(xs>ww-100)
				{
					y += 35;
					xs = x;
				}
				t = t.getNext();
			}
			g.drawString("End", xs+15, y+17);
			
			return y+30;
		}
		public int display2DArray(Graphics g, int[][] a, int x, int y, int ww, String title)
		{
			int xs = x;
			
			g.setFont(f1);
			g.setColor(Color.RED);
			g.drawString(title, ww/2-40, y-20);
			
			g.setFont(f);
			g.setColor(Color.BLACK);
			
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<a[0].length;j++)
				{
					g.drawString(Integer.toString(a[i][j]), xs, y);
					xs += 35;
				}
				y+=20;
				xs = x;
			}
			return y;
		}
	}

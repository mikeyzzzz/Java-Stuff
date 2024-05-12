

	import java.awt.*;
	import java.awt.event.*;

import javax.swing.*;
	import javax.swing.JOptionPane;

	public class Homework4 extends Frame implements ActionListener
	{
		double[] oneD = new double[50];
		int[][] a = new int[5][6];
		int[][] b = new int[5][6];
		int[][] c = new int[5][6];
		String command = "";
			
		public static void main(String[] args)
		{
			Frame frame = new Homework4();
			
				
			frame.setResizable(true);
			frame.setSize(900,800);
			frame.setVisible(true);
			
		}
		
		public Homework4()
		{
			setTitle("Homework4 - Arrays and methods");
			
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
			
			
			Menu actionMenu = new Menu("Problems");
			mb.add(actionMenu);
			
			MenuItem miP1 = new MenuItem("Problem 1");
			miP1.addActionListener(this);
			actionMenu.add(miP1);
			
			MenuItem miP2 = new MenuItem("Problem 2");
			miP2.addActionListener(this);
			actionMenu.add(miP2);
			
			MenuItem miP3 = new MenuItem("Problem 3");
			miP3.addActionListener(this);
			actionMenu.add(miP3);
			
			MenuItem bonus = new MenuItem("Bonus");
			bonus.addActionListener(this);
			actionMenu.add(bonus);
			
			// initialize arrays
			for (int i=0; i<oneD.length; i++)
		    	oneD[i] = 10 + (int)(41*Math.random());
			for (int i=0; i<a.length; i++)
				for (int j=0; j<a[i].length; j++)
				{
					a[i][j] = 1 + (int)((10)*Math.random());
					b[i][j] = 1 + (int)((10)*Math.random());
					c[i][j] = 1 + (int)((10)*Math.random());
				}
			
			// End program when window is closed
			
			WindowListener l = new WindowAdapter()
			{
							
				public void windowClosing(WindowEvent ev)
				{
					System.exit(0);
				}
				
				public void windowActivated(WindowEvent ev)
				{
					repaint();
				}
				
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
				switch(command)
				{
					case "About":
					{
						repaint();
						break;
					}
					case "Exit":
					{
						System.exit(0);
					}
					case "Problem 1":
					{
						
						repaint();
						break;
					}
					case "Problem 2":
					{
						repaint();
						break;
					}
					case "Problem 3":
					{
						repaint();
						break;
					}
					case "Bonus":
					{
						repaint();
						break;
					}
					
				}
				
			}
	//********************************************************
	// called by repaint() to redraw the screen
	//********************************************************
			
			public void paint(Graphics g)
			{
				int ww = (int) this.getWidth();     // current width of the window
				int wh = (int) this.getHeight();    // current height of the window
				int s = 40;
				// Check Command issued, take action accordingly
				switch(command)
				{
					case "About":
					{
						
						break;
					}
					case "Exit":
					{
						System.exit(0);
					}
					case "Problem 1":
					{
						int xs = s;
						int y = 100;
						double[] stats;
						
						for(int i=0;i<oneD.length;i++)
						{
							g.drawString(Double.toString(oneD[i]), xs, y);
							xs += 35;
							
							if(xs>ww-40)
							{
								y += 20;
								xs = s;
							}
						}
						
						stats = arrayStatistics(oneD);
						
						y += 20;
						g.drawString("Minimum: " + Double.toString(stats[0]) , ww/9, y);
						g.drawString("Maximum: " + Double.toString(stats[1]) , (ww/9)*2+35 , y);
						g.drawString("Average/Mean: " + Double.toString(stats[2]) ,(ww/9)*4, y);
						g.drawString("Standard Deviation: " + Double.toString(stats[3]), (ww/9)*6 , y);

						break;
					}
					case "Problem 2":
					{
						int xs = s;
						int y = 100;
						int[] reverseArray;
						
						for(int i=0;i<oneD.length;i++)
						{
							g.drawString(Double.toString(oneD[i]), xs, y);
							xs += 35;
							
							if(xs>ww-40)
							{
								y += 20;
								xs = s;
							}
						}
						
						reverseArray = reverseArray(oneD);
						
						y += 40;
						g.setColor(Color.RED);
						g.drawString("Reverse Array",(ww/2)-20,y);
						g.setColor(Color.BLACK);

						y += 40;
						xs=s;
						
						for(int i=0;i<oneD.length;i++)
						{
							g.drawString(Integer.toString(reverseArray[i]), xs, y);
							xs += 35;
							
							if(xs>ww-40)
							{
								y += 20;
								xs = s;
							}
						}
						
						break;
					}
					case "Problem 3":
					{
						int xs = s;
						int y = 100;
						
						for(int i=0;i<oneD.length;i++)
						{
							g.drawString(Double.toString(oneD[i]), xs, y);
							xs += 35;
							
							if(xs>ww-40)
							{
								y += 20;
								xs = s;
							}
						}
						
						g.drawString("Median =  " + median(oneD), ww/2-50, y+20);
						
						break;
					}
					case "Bonus":
					{
						int xs = s;
						int y = 100;
						
						for(int i=0;i<a.length;i++)
						{
							for(int j=0;j<a[0].length;j++)
							{
								g.drawString(Integer.toString(a[i][j]), xs, y);
								xs += 35;
							}
							if(i==a.length/2)
							{
								g.drawString("+", xs, y);
							}
							xs = s;
							y += 35;
						} 
						
						xs = s+35*a[0].length+35;
						y = 100;
						for(int i=0;i<b.length;i++)
						{
							for(int j=0;j<b[0].length;j++)
							{
								g.drawString(Integer.toString(b[i][j]), xs, y);
								xs += 35;
							}
							if(i==b.length/2)
							{
								g.drawString("=", xs, y);
							}
							xs = s+35*b[0].length+35;
							y += 35;
						}
						
						c = sumOf2DArrays(a,b);
						
						xs = s+35*b[0].length*2+70;
						y = 100;
						for(int i=0;i<c.length;i++)
						{
							for(int j=0;j<c[0].length;j++)
							{
								g.drawString(Integer.toString(c[i][j]), xs, y);
								xs += 35;
							}
							xs = s+35*c[0].length*2+70;
							y += 35;
						}
					}	
			}
	}
	public double[] arrayStatistics(double[] a)
	{
		double[] stats = {Integer.MAX_VALUE,Integer.MIN_VALUE,0,0};
		
		for(int i=0;i<a.length;i++) //loops through array of numbers
		{
			if(a[i]<stats[0]) //sets lowest number
			{
				stats[0] = a[i];
			}
			if (a[i]>stats[1]) //sets highest number
			{
				stats[1] = a[i];
			}
			
			stats[2] += a[i]; //sums the numbers in array
		}
		
		stats[2] = stats[2]/a.length; //calculates average/mean
		
		for(int i=0;i<a.length;i++) //1st part of sd calculation
		{
			stats[3] += Math.pow(a[i] - stats[2], 2);
		}
		
		stats[3] = Math.sqrt(stats[3]/a.length); //2nd part of sd calculation
		
		return stats; //returns stats
	}
	
	public int[] reverseArray(double[] a)
	{
		int[] array = new int[a.length];
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = (int) a[a.length-i-1];
		}
		
		return array;
		
	}
	
	public int median(double[] a)
	{
		int median;
		
		median = a.length/2;
		
		return (int) a[median-1];
	}
	
	public int[][] sumOf2DArrays(int[][] array1, int[][] array2)
	{
		int sumArray[][] = c;
		
		if((array1.length != array2.length) || (array1[0].length != array2[0].length))
		{
			JOptionPane.showMessageDialog(null, "Arrays are not compatible to compute sum. "
					+ "They must have the same number of rows and columns", "Error",JOptionPane.WARNING_MESSAGE);
			
			return sumArray;
			
		}	
		
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[0].length;j++)
			{
				sumArray[i][j] = array1[i][j] + array2[i][j];	
			}
		}
		
		return sumArray;
		
	}
}


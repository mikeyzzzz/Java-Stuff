
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Homework2 extends Frame implements ActionListener
{
	
	String command = "";
		
	public static void main(String[] args)
	{
		Frame frame = new Homework2();
		
			
		frame.setResizable(true);
		frame.setSize(900,800);
		frame.setVisible(true);
		
	}
	
	public Homework2()
	{
		setTitle("Homework2 - CSC 229 - Aiello");
		
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
		
		
		Menu actionMenu = new Menu("Shapes");
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
		
		MenuItem miBonus = new MenuItem("Bonus");
		miBonus.addActionListener(this);
		actionMenu.add(miBonus);
		
		MenuItem miTriangles = new MenuItem("Triangles");
		miTriangles.addActionListener(this);
		actionMenu.add(miTriangles);
		
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
				case "Triangles":
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
					//set up dimensions
					int x = 20;
					int y = 60;
					int w = ww-40;
					int h = wh-80;
					
					//draw border rectangle
					g.drawRect(x,y,w,h);
					
					//draw line
					g.drawLine(x+w/4, y, x+w-w/4, y+h);
					g.drawLine(x+w-w/4, y, x+w/4, y+h);
					
					break;
				}
				case "Problem 2":
				{
					//set up dimensions
					int x = 20;
					int y = 60;
					int w = ww-40;
					int h = wh-80;
					
					//draw border rectangle
					g.drawRect(x,y,w,h);
					
					//draw 4 quadrants
					g.drawLine(x+w/2, y, x+w/2,y+h);
					g.drawLine(x, y+h/2, x+w, y+h/2);
					
					//draw circles
					g.drawOval(x, y, w/2, h/2);
					g.drawOval(x+w/2, y+h/2, w/2, h/2);
					
					//draw triangles
					g.drawLine(x, y+h/2, x+w/4, y+h);
					g.drawLine(x+w/4, y+h, x+w-w/4, y);
					g.drawLine(x+w-w/4,y,x+w,y+h/2);
					
					break;
				}
				case "Problem 3":
				{
					//set up dimensions
					int x = 20;
					int y = 60;
					int w = ww-40;
					int h = wh-80;
					
					//draw border rectangle
					g.drawRect(x,y,w,h);
					
					//draw lines (slant down right)
					g.drawLine(x, y+h-h/3, x+w/3, y+h);
					g.drawLine(x, y+h/3, x+w-w/3,y+h);
					g.drawLine(x, y, x+w, y+h);
					g.drawLine(x+w/3, y, x+w, y+h-h/3);
					g.drawLine(x+w-w/3, y, x+w, y+h/3);
					
					//draw lines (slant down left)
					g.drawLine(x+w/3, y, x , y+h/3);
					g.drawLine(x+w-w/3, y, x, y+h-h/3);
					g.drawLine(x+w, y, x, y+h);
					g.drawLine(x+w,y+h/3,x+w/3,y+h);
					g.drawLine(x+w, y+h-h/3, x+w-w/3, y+h);
					
					break;
				}
				case "Bonus":
				{
					//set up dimensions
					int centerX = ww/2;
					int centerY = wh/2;
					int diameter = 40;
					int space = 20;
					
					//draw border rectangle
					while(centerX>0 && centerY-space>60 && centerY-space+diameter<wh)
					{
						g.drawOval(centerX-space,centerY-space,diameter,diameter);
						diameter += 40;
						space+=20;
						
					}
					
					
					break;
				}
				case "Triangles":
				{
					
					
					
					break;
				}
			}
		}
		
	}


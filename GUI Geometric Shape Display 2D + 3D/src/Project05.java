
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.Color;

public class Project05 extends Frame implements ActionListener
{
	//  Objects
	String command = "";
	Line l;
	Rectangle r;
	Ellipse e;
	Polygon p;
	Sphere s;
	Cube c;
	Cone cone;
	Cylinder cylinder;

	// Colors
	JColorChooser colorChooser = new JColorChooser();
	Color backgroundColor = new Color(0,0,0);
	Color foregroundColor = new Color(255,255,255);
		
	public static void main(String[] args)
	{
		Frame frame = new Project05();	
		frame.setResizable(true);
		frame.setSize(1000,840);
		frame.setVisible(true);
		
	}
	
	public Project05()
	{
		setTitle("Graphics");
		
		// Create Menu
		   			
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu fileMenu = new Menu("File");
		mb.add(fileMenu);
		
		MenuItem miAbout = new MenuItem("About");
		miAbout.addActionListener(this);
		fileMenu.add(miAbout);
		
		MenuItem miColor = new MenuItem("Color");
		miColor.addActionListener(this);
		fileMenu.add(miColor);
		
		MenuItem miExit = new MenuItem("Exit");
		miExit.addActionListener(this);
		fileMenu.add(miExit);
		
		// 2D Shapes menu
		
		Menu twoDMenu = new Menu("2D Shapes");
		mb.add(twoDMenu);
		
		MenuItem miLine = new MenuItem("Line");
		miLine.addActionListener(this);
		twoDMenu.add(miLine);
		
		MenuItem miRectangle = new MenuItem("Rectangle");
		miRectangle.addActionListener(this);
		twoDMenu.add(miRectangle);
		
		MenuItem miEllipse = new MenuItem("Ellipse");
		miEllipse.addActionListener(this);
		twoDMenu.add(miEllipse);
		
		MenuItem miPolygon = new MenuItem("Polygon");
		miPolygon.addActionListener(this);
		twoDMenu.add(miPolygon);
	
		// 3D Shapes Menu
		
		Menu threeDMenu = new Menu("3D Shapes");
		mb.add(threeDMenu);
		
		MenuItem miSphere = new MenuItem("Sphere");
		miSphere.addActionListener(this);
		threeDMenu.add(miSphere);
		
		MenuItem miCube = new MenuItem("Cube");
		miCube.addActionListener(this);
		threeDMenu.add(miCube);
		
		MenuItem miCone = new MenuItem("Cone");
		miCone.addActionListener(this);
		threeDMenu.add(miCone);
		
		MenuItem miCylinder = new MenuItem("Cylinder");
		miCylinder.addActionListener(this);
		threeDMenu.add(miCylinder);
		
		
		
		
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
	switch (command)
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
		case "Color":
		{
			backgroundColor = JColorChooser.showDialog(
										                     null,
										                     "Choose Background Color",
										                     colorChooser.getBackground());
	
			foregroundColor = JColorChooser.showDialog(
										                     null,
										                     "Choose Drawing Color",
										                     colorChooser.getBackground());
			repaint();
			break;
		}
		
		case "Line":
		{
			l = new Line();
			l.getAttributes();
			repaint();
			break;
		}
		
		case "Rectangle":
		{
			r = new Rectangle();
			r.getAttributes();
			repaint();
			break;
		}
		
		case "Ellipse":
		{
			e = new Ellipse();
			e.getAttributes();
			repaint();
			break;
		}
		
		case "Polygon":
		{
			p = new Polygon();
			p.getAttributes();
			repaint();
			break;
		}
		
		case "Sphere":
		{
			s = new Sphere();
			s.getAttributes();
			repaint();
			break;
		}
		
		case "Cube":
		{
			c = new Cube();
			c.getAttributes();
			repaint();
			break;
		}
		
		case "Cone":
		{
			cone = new Cone();
			cone.getAttributes();
			repaint();
			break;
		}
		
		case "Cylinder":
		{
			cylinder = new Cylinder();
			cylinder.getAttributes();
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
	
	// Check Command issued, take action accordingly
	switch(command)
	{
	case "About":
	{
		g.drawString(" Geometric Shapes",400, 100);
		g.drawLine (350,120, 550,120);
		g.drawString(" This program supports the entry of values of primary attributes and calculation of secondary " , 200, 140);
		g.drawString(" attributes (sides, angels, perimeter, area, surface, volume of the following shapes: " , 200, 160);
		
		g.drawString(" 1.      Line", 400, 200);
		g.drawString(" 2.      Rectangle", 400, 220);
		g.drawString(" 3.      Ellipse", 400, 240);
		g.drawString(" 4.      Regular Polygon", 400, 260);
		g.drawString(" 5.      Sphere", 400, 280);
		g.drawString(" 6.      Cube", 400, 300);
		break;
	}
	case "Color":
	{
		this.setBackground(backgroundColor);
		this.setForeground(foregroundColor);
		break;	
	}
	case "Line":
	{
		g.drawString("Line Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("FirstPoint ", 85, 140);
		g.drawString("= (" + l.getFirstX() + "," + l.getFirstY() + ")", 170, 140);
		g.drawString("SecondPoint ", 85, 160);
		g.drawString("= (" + l.getSecondX() + "," + l.getSecondY() + ")", 170, 160);
		g.drawString("Length ", 85, 180);
		g.drawString("= " + String.format("%.2f",l.getLength()), 170, 180);
		g.drawRect(70, 80, 175, 110);
		
		//draw shape
		g.drawLine(l.getFirstX(), l.getFirstY(), l.getSecondX(), l.getSecondY());
		
		//draw coordinates
		g.drawString(l.getFirstCoordinate(),l.getFirstX(),l.getFirstY());
		g.drawString(l.getSecondCoordinate(),l.getSecondX(),l.getSecondY());
		
		//draw dimension
		g.drawString(Double.toString(l.getLength()),l.getFirstX()+Math.abs((l.getSecondX()-l.getFirstX())/2), Math.abs((l.getSecondY()+l.getFirstY())/2));
		
		break;
	}
	case "Rectangle":
	{
		//Properties box
		g.drawString("Rectangle Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("TopLeft Corner ", 85, 140);
		g.drawString("= (" + r.getxTopLeft() + "," + r.getyTopLeft() + ")", 170, 140);
		g.drawString("Width", 85, 160);
		g.drawString("= " + r.getWidth(), 170, 160);
		g.drawString("Height", 85, 180);
		g.drawString("= " + r.getHeight(), 170, 180);
		g.drawString("Perimeter", 85, 200);
		g.drawString("= " + r.getPerimeter(), 170, 200);
		g.drawString("Area", 85, 220);
		g.drawString("= " + r.getArea(), 170, 220);
		g.drawRect(70, 80, 175, 150);
		
		//draw shape
		g.drawRect(r.getxTopLeft(), r.getyTopLeft(), r.getWidth(), r.getHeight());
		
		//draw coordinate
		g.drawString(r.getTopLeftCoordinateString(),r.getxTopLeft()-10 ,r.getyTopLeft()-15);
		
		//draw dimensions
		g.drawString(Integer.toString(r.getWidth()),r.getxTopLeft()+r.getWidth()/2,r.getyTopLeft()-10);
		g.drawString(Integer.toString(r.getHeight()),r.getxTopLeft()-25,r.getyTopLeft()+r.getHeight()/2);

		break;
	}
	
	case "Ellipse":
	{
		//properties box
		g.drawString("Ellipse Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("TopLeft Corner ", 85, 140);
		g.drawString("= (" + e.getTopLeftXCoordinate() + "," + e.getTopLeftYCoordinate() + ")", 170, 140);
		g.drawString("Width", 85, 160);
		g.drawString("= " + e.getWidth(), 170, 160);
		g.drawString("Height", 85, 180);
		g.drawString("= " +  e.getHeight(), 170, 180);
		g.drawString("Perimeter", 85, 200);
		g.drawString("= " + String.format("%.2f", e.getPerimeter()), 170, 200);
		g.drawString("Area", 85, 220);
		g.drawString("= " + String.format("%.2f", e.getArea()), 170, 220);
		g.drawRect(70, 80, 175, 150);
		
		//draw shape
		g.drawOval(e.getTopLeftXCoordinate(), e.getTopLeftYCoordinate(), e.getWidth(), e.getHeight());
		
		//draw guidelines
		g.drawLine(e.getTopLeftXCoordinate()+e.getWidth()/2, e.getTopLeftYCoordinate(), e.getTopLeftXCoordinate()+e.getWidth()/2, e.getTopLeftYCoordinate()+e.getHeight() );
		g.drawLine(e.getTopLeftXCoordinate(),e.getTopLeftYCoordinate()+e.getHeight()/2, e.getTopLeftXCoordinate()+e.getWidth(), e.getTopLeftYCoordinate()+e.getHeight()/2 );
		
		//draw coordinate
		g.drawString(e.getTopLeftCoordinateString(),e.getTopLeftXCoordinate()+10,(e.getTopLeftYCoordinate()+e.getHeight()/2)+15);
		
		//draw dimensions
		g.drawString(Integer.toString(e.getWidth()), e.getTopLeftXCoordinate()+e.getWidth()/2+20, e.getTopLeftYCoordinate()+(e.getHeight()/2)-15);
		g.drawString(Integer.toString(e.getHeight()), e.getTopLeftXCoordinate()+e.getWidth()/2+10, e.getTopLeftYCoordinate()+40);
		
		break;
	}
	
	case "Polygon":
	{
		//properties box
		g.drawString("Regular Polygon Properties",80,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("Center Point", 85, 140);
		g.drawString("= (" + p.getCenterXCoordinate() + "," + p.getCenterYCoordinate() + ")", 170, 140);
		g.drawString("Radius", 85, 160);
		g.drawString("= " + p.getRadiusOfBoundingCircle(), 170, 160);
		g.drawString("#Sides", 85, 180);
		g.drawString("= " +  p.getNumberOfSides(), 170, 180);
		g.drawLine(75,185,230,185);
		g.drawString("Vertices",135,210);
		g.drawLine(75,220,230,220);
		
		int x = 95;
		int y = 220;
		for(int i=1;i<=p.getNumberOfSides();i++)
		{
			y += 15;
			g.drawString("Point "+i+"     = "+"("+p.getXCoordinates()[i-1] + "," + p.getYCoordinates()[i-1] + ")",x ,y );
		}
		
		g.drawLine(75,y+20,230,y+20);
		
		g.drawString("Side", 85, y+35);
		g.drawString("= " + String.format("%.2f", p.getSideLength()), 170, y+35);
		g.drawString("Perimeter", 85, y+50);
		g.drawString("= " + String.format("%.2f", p.getPerimeter()), 170, y+50);
		g.drawString("Area", 85, y+65);
		g.drawString("= " + String.format("%.2f", p.getArea()), 170, y+65);
		g.drawRect(70, 80, 175, y);
		
		
		//draw shape
		g.drawPolygon(p.getXCoordinates(), p.getYCoordinates(), p.getNumberOfSides());
		
		//draw guideline
		g.drawLine(p.getCenterXCoordinate(),p.getCenterYCoordinate(),p.getXCoordinates()[0],p.getYCoordinates()[0]);
		
		//draw coordinate
		g.drawString(p.getCenterCoordinateString(),p.getCenterXCoordinate(),p.getCenterYCoordinate()+15);
		
		//draw dimensions
		g.drawString(Integer.toString(p.getRadiusOfBoundingCircle()),p.getCenterXCoordinate()-25,p.getCenterYCoordinate()+35);
		g.drawString(String.format("%.2f", p.getSideLength()),p.getXCoordinates()[7]-65,p.getYCoordinates()[7]);
		
		break;
	}
	
	case "Sphere":
	{
		//properties box
		g.drawString("Sphere Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("Center ", 85, 140);
		g.drawString("= " + s.getCenterCoordinateString(), 155, 140);
		g.drawString("Radius", 85, 160);
		g.drawString("= " + s.getRadius(), 155, 160);
		g.drawString("Surface", 85, 180);
		g.drawString("= " +  String.format("%.2f",s.getSurfaceArea()), 155, 180);
		g.drawString("Volume", 85, 200);
		g.drawString("= " + String.format("%.2f", s.getVolume()), 155, 200);
		g.drawRect(70, 80, 175, 130);
		
		//draw shape
		g.drawOval(s.getCenterXCoordinate()-s.getRadius(), s.getCenterYCoordinate()-s.getRadius(), s.getRadius()*2,s.getRadius()*2);
		g.drawOval(s.getCenterXCoordinate()-s.getRadius(), s.getCenterYCoordinate()-20, s.getRadius()*2, s.getRadius()/2);
		
		//draw guideline
		g.drawLine(s.getCenterXCoordinate()-s.getRadius(), s.getCenterYCoordinate(),s.getCenterXCoordinate(),s.getCenterYCoordinate());
		
		//draw coordinates
		g.drawString(s.getCenterCoordinateString(), s.getCenterXCoordinate()-20, s.getCenterYCoordinate()+20);
		break;
	}
	
	case "Cube":
	{
		//Properties box
		g.drawString("Cube Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("TopLeft Corner ", 85, 140);
		g.drawString("= (" + c.getxTopLeft() + "," + c.getyTopLeft() + ")", 170, 140);
		g.drawString("Side", 85, 160);
		g.drawString("= " + c.getSideLength(), 170, 160);
		g.drawString("Surface Area", 85, 180);
		g.drawString("= " + c.getSurfaceArea(), 170, 180);
		g.drawString("Volume", 85, 200);
		g.drawString("= " + c.getVolume(), 170, 200);
		g.drawRect(70, 80, 175, 150);
		
		//draw shape
		g.drawRect(c.getxTopLeft(), c.getyTopLeft(), c.getSideLength(), c.getSideLength());
		g.drawLine(c.getxTopLeft(), c.getyTopLeft(), c.getxTopLeft()+c.getSideLength()/4, c.getyTopLeft()-c.getSideLength()/3);
		g.drawLine(c.getxTopLeft()+c.getSideLength(), c.getyTopLeft(), c.getxTopLeft()+c.getSideLength()+c.getSideLength()/4, c.getyTopLeft()-c.getSideLength()/3);
		g.drawLine(c.getxTopLeft()+c.getSideLength()/4, c.getyTopLeft()-c.getSideLength()/3, c.getxTopLeft()+c.getSideLength()+c.getSideLength()/4, c.getyTopLeft()-c.getSideLength()/3);
		g.drawLine(c.getxTopLeft()+c.getSideLength()+c.getSideLength()/4, c.getyTopLeft()-c.getSideLength()/3, c.getxTopLeft()+c.getSideLength()+c.getSideLength()/4, c.getyTopLeft()-(c.getSideLength()/3)+c.getSideLength());
		g.drawLine(c.getxTopLeft()+c.getSideLength()+c.getSideLength()/4, c.getyTopLeft()-(c.getSideLength()/3)+c.getSideLength(), c.getxTopLeft()+c.getSideLength(), c.getyTopLeft()+c.getSideLength());
		
		//draw coordinate
		g.drawString(c.getTopLeftCoordinateString(),c.getxTopLeft()-10 ,c.getyTopLeft()-15);
		
		//draw dimension
		g.drawString(Integer.toString(c.getSideLength()), c.getxTopLeft()-25, c.getyTopLeft()+c.getSideLength()/2);
	}
	
	case "Cone":
	{
		//properties box
		g.drawString("Cone Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("Center ", 85, 140);
		g.drawString("= " + cone.getCenterCoordinateString(), 155, 140);
		g.drawString("Radius", 85, 160);
		g.drawString("= " + cone.getRadius(), 155, 160);
		g.drawString("Height", 85, 180);
		g.drawString("= " + cone.getHeight(), 155, 180);
		g.drawString("Surface", 85, 200);
		g.drawString("= " + String.format("%.2f", cone.getSurfaceArea()), 155, 200);
		g.drawString("Volume", 85, 220);
		g.drawString("= " + String.format("%.2f", cone.getVolume()), 155, 220);
		g.drawRect(70, 80, 175, 150);
		
		//draw shape
		g.drawOval(cone.getCenterXCoordinate()-cone.getRadius(),cone.getCenterYCoordinate()-cone.getHeight()/10 ,cone.getRadius()*2, cone.getHeight()/5);
		g.drawLine(cone.getCenterXCoordinate()-cone.getRadius(),cone.getCenterYCoordinate(), cone.getCenterXCoordinate(),cone.getCenterYCoordinate()-cone.getHeight());
		g.drawLine(cone.getCenterXCoordinate()+cone.getRadius(),cone.getCenterYCoordinate(), cone.getCenterXCoordinate(),cone.getCenterYCoordinate()-cone.getHeight());

		//draw guidelines
		g.drawLine(cone.getCenterXCoordinate(), cone.getCenterYCoordinate(), cone.getCenterXCoordinate(),cone.getCenterYCoordinate()-cone.getHeight());
		g.drawLine(cone.getCenterXCoordinate(), cone.getCenterYCoordinate(), cone.getCenterXCoordinate()+cone.getRadius(),cone.getCenterYCoordinate());
		
		//draw dimensions
		g.drawString(Integer.toString(cone.getHeight()), cone.getCenterXCoordinate()+5,cone.getCenterYCoordinate()-cone.getHeight()/2);
		g.drawString(Integer.toString(cone.getRadius()), cone.getCenterXCoordinate()+cone.getRadius()/2,cone.getCenterYCoordinate()-5);

		break;
		
	}
	
	case "Cylinder":
	{
		//properties box
		g.drawString("Cylinder Properties",100,100);
		g.drawLine(75, 120, 230, 120);
		g.drawString("Center ", 85, 140);
		g.drawString("= " + cylinder.getCenterCoordinateString(), 155, 140);
		g.drawString("Radius", 85, 160);
		g.drawString("= " + cylinder.getRadius(), 155, 160);
		g.drawString("Height", 85, 180);
		g.drawString("= " + cylinder.getHeight(), 155, 180);
		g.drawString("Surface", 85, 200);
		g.drawString("= " + String.format("%.2f", cylinder.getSurfaceArea()), 155, 200);
		g.drawString("Volume", 85, 220);
		g.drawString("= " + String.format("%.2f", cylinder.getVolume()), 155, 220);
		g.drawRect(70, 80, 175, 150);
		
		//draw shape
		g.drawOval(cylinder.getCenterXCoordinate()-cylinder.getRadius(),cylinder.getCenterYCoordinate()-cylinder.getHeight()/10 ,cylinder.getRadius()*2, cylinder.getHeight()/5);
		g.drawOval(cylinder.getCenterXCoordinate()-cylinder.getRadius(),cylinder.getCenterYCoordinate()-(cylinder.getHeight()/10)-cylinder.getHeight() ,cylinder.getRadius()*2, cylinder.getHeight()/5);
		g.drawLine(cylinder.getCenterXCoordinate()-cylinder.getRadius(), cylinder.getCenterYCoordinate(), cylinder.getCenterXCoordinate()-cylinder.getRadius(),cylinder.getCenterYCoordinate()-cylinder.getHeight() );
		g.drawLine(cylinder.getCenterXCoordinate()+cylinder.getRadius(), cylinder.getCenterYCoordinate(),cylinder.getCenterXCoordinate()+cylinder.getRadius(),cylinder.getCenterYCoordinate()-cylinder.getHeight() );
		
		//draw guidelines
		g.drawLine(cylinder.getCenterXCoordinate(), cylinder.getCenterYCoordinate(), cylinder.getCenterXCoordinate(),cylinder.getCenterYCoordinate()-cylinder.getHeight());
		g.drawLine(cylinder.getCenterXCoordinate(), cylinder.getCenterYCoordinate(), cylinder.getCenterXCoordinate()+cylinder.getRadius(),cylinder.getCenterYCoordinate());
		
		//draw dimensions
		g.drawString(Integer.toString(cylinder.getHeight()), cylinder.getCenterXCoordinate()+5,cylinder.getCenterYCoordinate()-cylinder.getHeight()/2);
		g.drawString(Integer.toString(cylinder.getRadius()), cylinder.getCenterXCoordinate()+cylinder.getRadius()/2,cylinder.getCenterYCoordinate()-5);

		break;
		
	}
	
	}
}
		
}
import java.awt.Color;

import javax.swing.JOptionPane;

public class Ellipse 
{
	//attributes of Ellipse
	private  int topLeftXPoint,topLeftYPoint;
	private  int width,height;
		
	//constructors
	public Ellipse() 
	{
		topLeftXPoint=0;
		topLeftYPoint=1;
		width=2;
		height=1;
	}
	public Ellipse(int xPoint, int yPoint, int widthEllipse, int heightEllipse) 
	{
		topLeftXPoint = xPoint;
		topLeftYPoint = yPoint;
		width = widthEllipse;
		height = heightEllipse;
	}
		
	//access variable methods
	public int getTopLeftXCoordinate() 
	{
		return topLeftXPoint;
	}
	public int getTopLeftYCoordinate()
	{
		return topLeftYPoint;
	}
	public int getWidth() 
	{
		return width;
	}
	public int getHeight()
	{
		return height;
	}
	public String getTopLeftCoordinateString()
	{
		return "(" +  topLeftXPoint + "," + topLeftYPoint + ")";
	}
	
	//secondary attributes
	public double getPerimeter()
	{
		return (Math.PI)*(3*(width/2+height/2) - Math.sqrt((3*width/2+height/2)*(width/2+3*height/2)));
	}
	public double getArea()
	{
		return Math.PI*width/2*height/2;
	}
		 
	//other methods 
	public void getAttributes()
	{
		String input;
		
	    input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Left X Corner of Ellipse",JOptionPane.QUESTION_MESSAGE);
        topLeftXPoint=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Top Left Y Corner of Ellipse",JOptionPane.QUESTION_MESSAGE);
        topLeftYPoint=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Width of the Ellipse",JOptionPane.QUESTION_MESSAGE);
        width=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Height of the Ellipse",JOptionPane.QUESTION_MESSAGE);
        height = Integer.parseInt(input);
        
	}
				
				

}

import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * CSC 229 - Project 04 - Mike Aiello
 * 
 * Line class
 * 
 */
public class Line 
{

	//attributes of line
	private  int x1,x2;
	private  int y1,y2;
	
	//constructors
	public Line() //no args default line of length 1
	{
		x1=0;
		y1=0;
		x2=1;
		y2=0;
	}
	public Line(int x1Point, int y1Point, int x2Point, int y2Point) 
	{
		x1 = x1Point;
		y1 = y1Point;
		x2 = x2Point;
		y2 = y2Point;
	}
	
	//access methods
	public int getX1Coordinate() 
	{
		return x1;
	}
	public int getY1Coordinate()
	{
		return y1;
	}
	public int getX2Coordinate() 
	{
		return x2;
	}
	public int getY2Coordinate()
	{
		return y2;
	}
	public String getFirstPointCoordinateString()
	{
		return "(" +  x1 + "," + y1 + ")";
	}
	public String getSecondPointCoordinateString()
	{
		return "(" +  x2 + "," + y2 + ")";
	}

	//secondary attributes
	public double getLength()
	{
		return Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-x2), 2));
	}
	 
	//other methods 
	public void userInput()
	{
		x1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the First Point (INTEGER)","X(Start Point of Line)",JOptionPane.QUESTION_MESSAGE));
		y1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the First Point (INTEGER)","Y(Start Point of Line)",JOptionPane.QUESTION_MESSAGE));
		x2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Second Point (INTEGER)","X(End Point of Line)",JOptionPane.QUESTION_MESSAGE));
		x2 = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Second Point (INTEGER)","Y(End Point of Line)",JOptionPane.QUESTION_MESSAGE));
	}
	
	
	
	public void displayProperties()
	{
		JOptionPane.showMessageDialog(null, ""
				+ "                           Line Properties\n"
				+ "_____________________________________\n"
				+ "                         First Point = " + getFirstPointCoordinateString() + "\n"
				+ "                     Second Point = " + getSecondPointCoordinateString() + "\n"
				+ "                         Length = " + String.format("%.2f", getLength()) + "\n"
				+ "_____________________________________\n"
				,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
	}
}

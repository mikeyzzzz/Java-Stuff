import javax.swing.JOptionPane;

public class Rectangle 
{

		//attributes of Rectangle
		private  int topLeftXPoint,topLeftYPoint;
		private  int widthRectangle,heightRectangle;
		
		//constructors
		public Rectangle() //no args default rectangle of 1 height 2 width in 1st quadrant coordinate plane
		{
			topLeftXPoint=0;
			topLeftYPoint=1;
			widthRectangle=2;
			heightRectangle=1;
		}
		public Rectangle(int xPoint, int yPoint, int width, int height) 
		{
			topLeftXPoint = xPoint;
			topLeftYPoint = yPoint;
			widthRectangle = width;
			heightRectangle = height;
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
			return widthRectangle;
		}
		public int getHeight()
		{
			return heightRectangle;
		}
		public String getTopLeftCoordinateString()
		{
			return "(" +  topLeftXPoint + "," + topLeftYPoint + ")";
		}
		

		//secondary attributes
		public double getPerimeter()
		{
			return (widthRectangle*2 + heightRectangle*2);
		}
		public double getArea()
		{
			return (widthRectangle*heightRectangle);
		}
		 
		//other methods 
		public void userInput()
		{
			topLeftXPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Top Left Point (INTEGER)","Top Left X Corner of Rectangle",JOptionPane.QUESTION_MESSAGE));
			topLeftYPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Top Left Point (INTEGER)","Top Left Y Corner of Rectangle",JOptionPane.QUESTION_MESSAGE));
			widthRectangle = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Width of the Rectangle(INTEGER)","Width of the Rectangle",JOptionPane.QUESTION_MESSAGE));
			heightRectangle = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Height of the Rectangle(INTEGER)","Height of the Rectangle",JOptionPane.QUESTION_MESSAGE));
		}
		
		
		
		public void displayProperties()
		{
			JOptionPane.showMessageDialog(null, ""
					+ "                         Rectangle Properties\n"
					+ "_____________________________________\n"
					+ "                     TopLeft Corner  = " + getTopLeftCoordinateString() + "\n"
					+ "                              Width  = " + widthRectangle + "\n"
					+ "                             Height  = " + heightRectangle + "\n"
					+ "                          Perimeter  = " + getPerimeter() + "\n"
					+ "                              Area   = " + getArea() + "\n"
					+ "_____________________________________\n"
					,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
		}

}

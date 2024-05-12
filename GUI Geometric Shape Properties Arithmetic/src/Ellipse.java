import javax.swing.JOptionPane;

public class Ellipse 
{
		//attributes of Ellipse
		private  int topLeftXPoint,topLeftYPoint;
		private  int widthEllipse,heightEllipse;
			
		//constructors
		public Ellipse() //no args default ellipse of 1 height 2 width in 1st quadrant coordinate plane
		{
			topLeftXPoint=0;
			topLeftYPoint=1;
			widthEllipse=2;
			heightEllipse=1;
		}
		public Ellipse(int xPoint, int yPoint, int width, int height) 
		{
			topLeftXPoint = xPoint;
			topLeftYPoint = yPoint;
			widthEllipse = width;
			heightEllipse = height;
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
			return widthEllipse;
		}
		public int getHeight()
		{
			return heightEllipse;
		}
		public String getTopLeftCoordinateString()
		{
			return "(" +  topLeftXPoint + "," + topLeftYPoint + ")";
		}
			
		//secondary attributes
		public double getPerimeter()
		{
			return (Math.PI)*(3*(widthEllipse/2+heightEllipse/2) - Math.sqrt((3*widthEllipse/2+heightEllipse/2)*(widthEllipse/2+3*heightEllipse/2)));
		}
		public double getArea()
		{
			return Math.PI*widthEllipse/2*heightEllipse/2;
		}
			 
		//other methods 
		public void userInput()
		{
			topLeftXPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Top Left Point (INTEGER)","Top Left X Corner of Ellipse",JOptionPane.QUESTION_MESSAGE));
			topLeftYPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Top Left Point (INTEGER)","Top Left Y Corner of Ellipse",JOptionPane.QUESTION_MESSAGE));
			widthEllipse = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Width of the Ellipse(INTEGER)","Width of the Ellipse",JOptionPane.QUESTION_MESSAGE));
			heightEllipse = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Height of the Ellipse(INTEGER)","Height of the Ellipse",JOptionPane.QUESTION_MESSAGE));
		}
				
		public void displayProperties()
		{
			JOptionPane.showMessageDialog(null, ""
					+ "                         Ellipse Properties\n"
					+ "_____________________________________\n"
					+ "                     TopLeft Corner  = " + getTopLeftCoordinateString() + "\n"
					+ "                              Width  = " + widthEllipse + "\n"
					+ "                             Height  = " + heightEllipse + "\n"
					+ "                          Perimeter  = " + String.format("%.2f",getPerimeter()) + "\n"
					+ "                              Area   = " + String.format("%.2f",getArea()) + "\n"
					+ "_____________________________________\n"
					,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
		}

}

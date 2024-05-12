import javax.swing.JOptionPane;

public class Cube 
{

		//attributes of Rectangle
		private  int topLeftXPoint,topLeftYPoint;
		private  int sideLength;
		
		//constructors
		public Cube() //no args default cube of 1 side length
		{
			topLeftXPoint=0;
			topLeftYPoint=0;
			sideLength = 1;
		}
		public Cube(int xPoint, int yPoint, int side) 
		{
			topLeftXPoint = xPoint;
			topLeftYPoint = yPoint;
			sideLength = side;
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
		public int getSideLength() 
		{
			return sideLength;
		}
		public String getTopLeftCoordinateString()
		{
			return "(" +  topLeftXPoint + "," + topLeftYPoint + ")";
		}
		

		//secondary attributes
		public double getSurface()
		{
			return 6.0*(sideLength*sideLength);
		}
		public double getVolume()
		{
			return Math.pow(sideLength, 3);
		}
		 
		//other methods 
		public void userInput()
		{
			topLeftXPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Top Left Point (INTEGER)","Top Left X Corner of Cube",JOptionPane.QUESTION_MESSAGE));
			topLeftYPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Top Left Point (INTEGER)","Top Left Y Corner of Cube",JOptionPane.QUESTION_MESSAGE));
			sideLength = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Side Length of the Cube(INTEGER)","Side of Cube",JOptionPane.QUESTION_MESSAGE));
		}
		
		
		
		public void displayProperties()
		{
			JOptionPane.showMessageDialog(null, ""
					+ "                         Cube Properties\n"
					+ "_____________________________________\n"
					+ "            TopLeft Corner  = " + getTopLeftCoordinateString() + "\n"
					+ "                                Side  = " + sideLength + "\n"
					+ "                          Surface = " + String.format("%.2f",getSurface()) + "\n"
					+ "                          Volume  = " + String.format("%.2f", getVolume()) + "\n"
					+ "_____________________________________\n"
					,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
		}

}

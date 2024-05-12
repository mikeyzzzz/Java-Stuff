import javax.swing.JOptionPane;

public class Polygon 
{
		//attributes of Polygon
		private  int centerXPoint,centerYPoint;
		private  int numberOfSides,radiusOfBoundingCircle;
			
		//constructors	
		public Polygon() //no args default polygon with 3 sides and radius 1 
		{
			centerXPoint=0;
			centerYPoint=0;
			numberOfSides=3;
			radiusOfBoundingCircle=1;
		}
		
		public Polygon(int xPoint, int yPoint, int sides, int radius) 
		{
			centerXPoint = xPoint;
			centerYPoint = yPoint;
			numberOfSides = sides;
			radiusOfBoundingCircle = radius;
		}
			
		//access variable methods
		public int getCenterXCoordinate() 
		{
			return centerXPoint;
		}
		public int getCenterYCoordinate()
		{
			return centerYPoint;
		}
		public int getNumberOfSides() 
		{
			return numberOfSides;
		}
		public int getRadiusOfBoundingCircle()
		{
			return radiusOfBoundingCircle;
		}
		public String getCenterCoordinateString()
		{
			return "(" +  centerXPoint + "," + centerYPoint + ")";
		}
			
		//secondary attributes
		public double getSideLength()
		{
			return 2*radiusOfBoundingCircle*Math.sin(Math.PI/numberOfSides);
		}
		public double getPerimeter()
		{
			return this.getSideLength()*numberOfSides;

		}
		public double getArea()
		{
			return numberOfSides*Math.pow(radiusOfBoundingCircle,2)*Math.sin(2*Math.PI/numberOfSides)/2;
		}
			 
		//other methods 
		public void userInput()
		{
			centerXPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Center Point (INTEGER)","X Coordinate of the Center",JOptionPane.QUESTION_MESSAGE));
			centerYPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Center Point (INTEGER)","Y Coordinate of the Center",JOptionPane.QUESTION_MESSAGE));
			numberOfSides = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Number of sides for Polygon (INTEGER)","Number of Sides",JOptionPane.QUESTION_MESSAGE));
			radiusOfBoundingCircle = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Radius of Bounding Circle(INTEGER)","Radius of Bounding Circle",JOptionPane.QUESTION_MESSAGE));
		}
			
			
			
		public void displayProperties()
		{
			JOptionPane.showMessageDialog(null, ""
					+ "                    Regular Polygon Properties\n"
					+ "_____________________________________\n"
					+ "                          Center  = " + getCenterCoordinateString() + "\n"
					+ "                         # Sides  = " + numberOfSides + "\n"
					+ "                          Radius  = " + radiusOfBoundingCircle + "\n"
					+ "                  SideLength  = " + String.format("%.2f",getSideLength()) + "\n"
					+ "                    Perimeter  = " + String.format("%.2f",getPerimeter()) + "\n"
					+ "                              Area  = " + String.format("%.2f",getArea()) + "\n"
					+ "_____________________________________\n"
					,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
		}

}

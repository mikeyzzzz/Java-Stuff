import javax.swing.JOptionPane;

public class Sphere 
{
		//attributes of Sphere
		private  int centerXPoint,centerYPoint;
		private  int radius;
			
		//constructors	
		public Sphere() //no args default Sphere with radius 1 
		{
			centerXPoint=0;
			centerYPoint=0;
			radius=1;
		}
		public Sphere(int xPoint, int yPoint, int radiusOfSphere) 
		{
			centerXPoint = xPoint;
			centerYPoint = yPoint;
			radius = radiusOfSphere;
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
		public int getRadius() 
		{
			return radius;
		}
		public String getCenterCoordinateString()
		{
			return "(" +  centerXPoint + "," + centerYPoint + ")";
		}
			
		//secondary attributes
		public double getSurfaceArea()
		{
			return 4.0*Math.PI*Math.pow(this.radius, 2);
		}
		public double getVolume()
		{
			return (4.0/3.0)*(Math.PI)*(Math.pow(this.radius, 3));
		}
			 
		//other methods 
		public void userInput()
		{
			centerXPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the X-Coordinate of the Center Point (INTEGER)","X Coordinate of the Center",JOptionPane.QUESTION_MESSAGE));
			centerYPoint = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Y-Coordinate of the Center Point (INTEGER)","Y Coordinate of the Center",JOptionPane.QUESTION_MESSAGE));
			radius = Integer.parseInt(JOptionPane.showInputDialog(null,"Please Enter the Radius of Sphere(INTEGER)","Radius of Sphere",JOptionPane.QUESTION_MESSAGE));
		}
			
			
		public void displayProperties()
		{
			JOptionPane.showMessageDialog(null, ""
					+ "                    Sphere Properties\n"
					+ "_____________________________________\n"
					+ "                          Center  = " + getCenterCoordinateString() + "\n"
					+ "                          Radius  = " + radius + "\n"
					+ "               Surface Area = " + String.format("%.2f",getSurfaceArea()) + "\n"
					+ "                          Volume = " + String.format("%.2f",getVolume()) + "\n"
					+ "_____________________________________\n"
					,"Geometric Shapes",JOptionPane.INFORMATION_MESSAGE);
		}

}

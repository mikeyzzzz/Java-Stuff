import javax.swing.JOptionPane;

public class Cylinder 
{
		//attributes of Sphere
		private  int centerXPoint,centerYPoint;
		private  int radius;
		private  int height;
			
		//constructors	
		public Cylinder() //no args default Cone with radius 1 
		{
			centerXPoint=0;
			centerYPoint=0;
			radius=1;
			height=1;
		}
		public Cylinder(int xPoint, int yPoint, int radiusOfCylinder,int heightOfCylinder) 
		{
			centerXPoint = xPoint;
			centerYPoint = yPoint;
			radius = radiusOfCylinder;
			height = heightOfCylinder;
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
		public int getHeight()
		{
			return height;
		}
		public String getCenterCoordinateString()
		{
			return "(" +  centerXPoint + "," + centerYPoint + ")";
		}
			
		//secondary attributes
		public double getSurfaceArea()
		{
			return 2*Math.PI*this.radius*this.height+2*Math.PI*Math.pow(this.radius, 2);
		}
		public double getVolume()
		{
			return Math.PI*Math.pow(this.radius,2)*this.height;
		}
			 
		//other methods 
		public void getAttributes()
		{
			String input;
			
			input = JOptionPane.showInputDialog(null,"Please enter an integer:",
					"Center X Point",JOptionPane.QUESTION_MESSAGE);
	        centerXPoint=Integer.parseInt(input);

	        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Center Y Point",JOptionPane.QUESTION_MESSAGE);
	        centerYPoint=Integer.parseInt(input);
	        
	        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
					"Radius of Cylinder",JOptionPane.QUESTION_MESSAGE);
		        radius=Integer.parseInt(input);
		        
	        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
					"Height of Cylinder",JOptionPane.QUESTION_MESSAGE);
		        height=Integer.parseInt(input);
		}

}

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
					"Radius of Sphere",JOptionPane.QUESTION_MESSAGE);
		        radius=Integer.parseInt(input);
		}

}

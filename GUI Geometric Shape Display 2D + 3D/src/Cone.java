import javax.swing.JOptionPane;

public class Cone 
{
	//attributes of Sphere
	private  int centerXPoint,centerYPoint;
	private  int radius;
	private  int height;
		
	//constructors	
	public Cone() //no args default Cone with radius 1 
	{
		centerXPoint=0;
		centerYPoint=0;
		radius=1;
		height=1;
	}
	public Cone(int xPoint, int yPoint, int radiusOfCone,int heightOfCone) 
	{
		centerXPoint = xPoint;
		centerYPoint = yPoint;
		radius = radiusOfCone;
		height = heightOfCone;
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
		return Math.PI*this.radius*(this.radius+Math.sqrt(Math.pow(this.getHeight(), 2)+Math.pow(this.getRadius(), 2)));
	}
	public double getVolume()
	{
		return Math.PI*Math.pow(this.radius, 2)*(this.height/3);
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
				"Radius of Cone",JOptionPane.QUESTION_MESSAGE);
	        radius=Integer.parseInt(input);
	        
        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Height of Cone",JOptionPane.QUESTION_MESSAGE);
	        height=Integer.parseInt(input);
	}

}

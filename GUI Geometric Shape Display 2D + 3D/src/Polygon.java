import java.util.ArrayList;

import javax.swing.JOptionPane;



public class Polygon 
{
	//attributes of Polygon
			private  int centerXPoint,centerYPoint;
			private  int numberOfSides,radiusOfBoundingCircle;
			private int[] xCoordinates;
			private int[] yCoordinates;
				
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
			public void getAttributes() //original project 4 inputs
			{
				String input;
				
				input = JOptionPane.showInputDialog(null,"Please enter an integer:",
						"Center X Point",JOptionPane.QUESTION_MESSAGE);
		        centerXPoint=Integer.parseInt(input);

		        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
					"Center Y Point",JOptionPane.QUESTION_MESSAGE);
		        centerYPoint=Integer.parseInt(input);

		        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
					"Number of sides",JOptionPane.QUESTION_MESSAGE);
		        numberOfSides=Integer.parseInt(input);
		        
		        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
						"Radius of bounding circle",JOptionPane.QUESTION_MESSAGE);
			        radiusOfBoundingCircle=Integer.parseInt(input);
			}
			
			public int[] getXCoordinates()
			{
				int[] xPoints = new int[this.getNumberOfSides()];
				double trigTheta = Math.PI/2;
				double trigDTheta = 2*Math.PI/this.getNumberOfSides();
				int x;
		
				for(int i=0;i<this.getNumberOfSides();i++)
				{
					trigTheta += trigDTheta;
					x = (int) (this.getCenterXCoordinate()+this.getRadiusOfBoundingCircle()*Math.cos(trigTheta));
					xPoints[i] = x;
				}
				
				return xPoints;
				
			}
			
			public int[] getYCoordinates()
			{
				int[] yPoints = new int[this.getNumberOfSides()];
				
				double trigTheta = Math.PI/2;
				double trigDTheta = 2*Math.PI/this.getNumberOfSides();
				int y;
		
				
				for(int i=0;i<this.getNumberOfSides();i++)
				{
					trigTheta += trigDTheta;
					y = (int) (this.getCenterYCoordinate()+this.getRadiusOfBoundingCircle()*Math.sin(trigTheta));

					yPoints[i] = y;
				}
				
				return yPoints;
				
			}
			

}

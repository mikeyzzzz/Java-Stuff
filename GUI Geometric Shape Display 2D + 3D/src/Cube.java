import javax.swing.JOptionPane;

public class Cube 
{
	private int xTopLeft;
	private int yTopLeft;
	private int sideLength;
	
	
	public  Cube()
	{
		xTopLeft = 0;
		yTopLeft = 0;
		sideLength = 0;
	}
	public  Cube(int x, int y, int side)
	{
		xTopLeft = x;
		yTopLeft = y;
		sideLength = side;
	}
	public int getxTopLeft()
	{
		return xTopLeft;
	}
	public int getyTopLeft()
	{
		return yTopLeft;
	}
	public int getSideLength()
	{
		return sideLength;
	}
	public String getTopLeftCoordinateString()
	{
		return "(" +  xTopLeft + "," + yTopLeft + ")";
	}
	public void getAttributes()
	{
		String input;
		
	    input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Top Left X Corner of Rectangle",JOptionPane.QUESTION_MESSAGE);
        xTopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Top Left Y Corner of Rectangle",JOptionPane.QUESTION_MESSAGE);
        yTopLeft=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Length of the Sides",JOptionPane.QUESTION_MESSAGE);
        sideLength=Integer.parseInt(input);
        
	}
	public int getSurfaceArea()
	{
		return (sideLength*sideLength)*6;
		
	}
	public int getVolume()
	{
		return (int) Math.pow(sideLength, 3);
		
	}

}

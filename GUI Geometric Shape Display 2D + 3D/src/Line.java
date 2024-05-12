import javax.swing.JOptionPane;

public class Line 
{
	private int x1,x2;
	private int y1,y2;
	
	public  Line()
	{
		x1 = 0;
		y1 = 0;
		x2 = 0;
		y2 = 0;
	}
	public  Line(int firstX, int firstY,int secondX, int secondY)
	{
		x1 = firstX;
		y1 = firstY;
		x2 = secondX;
		y2 = secondY;
	}
	public int getFirstX()
	{
		return x1;
	}
	public int getFirstY()
	{
		return y1;
	}
	public int getSecondX()
	{
		return x2;
	}
	public int getSecondY()
	{
		return y2;
	}
	public String getFirstCoordinate()
	{
		return "("+this.x1+","+this.y1+")";
	}
	public String getSecondCoordinate()
	{
		return "("+this.x2+","+this.y2+")";
	}
	public void getAttributes()
	{
		String input;
		
	    input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"First X Point",JOptionPane.QUESTION_MESSAGE);
        x1=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"First Y Point",JOptionPane.QUESTION_MESSAGE);
        y1=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
				"Second X Point",JOptionPane.QUESTION_MESSAGE);
        x2=Integer.parseInt(input);

        input = JOptionPane.showInputDialog(null,"Please enter an integer:",
			"Second Y Point",JOptionPane.QUESTION_MESSAGE);
        y2=Integer.parseInt(input);
        
	}
	public double getLength()
	{
		return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow(y2-y1, 2));
	}
	

}

import javax.swing.JOptionPane;

public class Project04 
{

	public static void main(String[] args) 
	{
		menu();

	}
	
	public static void menu()
	{
		int option = 0;
		String input = "";
		
		while(option != 7)
		{
			input = JOptionPane.showInputDialog(null,""
					+ "                       Geometric Shapes\n"
					+ "_____________________________________\n"
					+ "               Select a shape by Entering \n"
					+ "          the Number Associated with Shape\n"
					+ "                Press 7 to Exit the Program\n"
					+ "_____________________________________\n"
					+ "                 Two-Dimensional Shapes\n"
					+ "_____________________________________\n"
					+ "                            1) Line\n"
					+ "                            2) Rectangle\n"
					+ "                            3) Ellipse\n"
					+ "                            4) Regular Polygon\n"
					+ "_____________________________________\n"
					+ "                Three-Dimensional Shapes\n"
					+ "_____________________________________\n"
					+ "                            5) Sphere\n"
					+ "                            6) Cube\n"
					+ "_____________________________________\n"
					+ "                            7) EXIT\n"
					+ "_____________________________________\n"
					,"CSC 229 - Project04 - Shapes", JOptionPane.QUESTION_MESSAGE);
			
			option = Integer.parseInt(input);
			
			switch (option)
			{
				case 1:
				{
					Line line = new Line();
					line.userInput();
					line.displayProperties();
					break;
				}
				case 2:
				{
					Rectangle rectangle = new Rectangle();
					rectangle.userInput();
					rectangle.displayProperties();
					break;	
				}
				case 3:
				{
					Ellipse ellipse = new Ellipse();
					ellipse.userInput();
					ellipse.displayProperties();
					break;
				}
				case 4:
				{
					Polygon polygon = new Polygon();
					polygon.userInput();
					polygon.displayProperties();
					break;
				}
				case 5:
				{
					Sphere sphere = new Sphere();
					sphere.userInput();
					sphere.displayProperties();
					break;
				}
				case 6:
				{
					Cube cube = new Cube();
					cube.userInput();
					cube.displayProperties();
					break;
				}
				case 7:
				{
					JOptionPane.showMessageDialog(null, "               Good Bye", "Thank You For Using Geometric Shapes", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				default:
				{
					JOptionPane.showMessageDialog(null, "Please Enter Numbers Between 1 and 7","Incorrect Selection",JOptionPane.ERROR_MESSAGE);
				}
				
			
			}
		
		}
	}
	
}

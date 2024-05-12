import javax.swing.JOptionPane;

public class Project03 
{
	public static void main(String[] args) 
	{
		menu();
	}

	public static void menu()
	{
		int option = 0;
		String input = "";
		
		while(option != 5)
		{
			input = JOptionPane.showInputDialog(null,""
					+ "                CSC 229 - Project 03 (Math Series)\n"
					+ "______________________________________________\n"
					+ "     Select a series by pressing number key associated\n"
					+ "                       5 to exit the program             \n"
					+ "______________________________________________\n"
					+ "                1) 1+2+3+       ...... +N\n"
					+ "                2) 1+4+9+       ...... +N^2\n"
					+ "                3) 5+25+125+    ...... +5^N\n"
					+ "                4) 1/1!+1/2+    ...... +1/N!\n"
					+ "\n"
					+ "                5) EXIT"
					
					,"Math Series", JOptionPane.QUESTION_MESSAGE);
			
			option = Integer.parseInt(input);

			
			switch (option)
			{
				case 1:
				{
					String userInput = JOptionPane.showInputDialog(null,
							"Enter a positive integer number",
							"1+2+3+.....+N",
							JOptionPane.QUESTION_MESSAGE);
					
					int n = Integer.parseInt(userInput);
					long result = m1(n);
					displayResult(option,n,result);
							
					break;
				}
				case 2:
				{
					String userInput = JOptionPane.showInputDialog(null,
							"Enter a positive integer number",
							"1+4+9+.....+N^2",
							JOptionPane.QUESTION_MESSAGE);
					
					int n = Integer.parseInt(userInput);
					long result = m2(n);
					displayResult(option,n,result);
							
					break;
					
				}
				case 3:
				{
					String userInput = JOptionPane.showInputDialog(null,
							"Enter a positive integer number",
							"5+25+125+.....+5^N",
							JOptionPane.QUESTION_MESSAGE);
					
					int n = Integer.parseInt(userInput);
					long result = m3(n);
					displayResult(option,n,result);
							
					break;
				}
				case 4:
				{
					String userInput = JOptionPane.showInputDialog(null,
							"Enter a positive integer number",
							"1/1!+1/2!+1/3!+.....+1/N!",
							JOptionPane.QUESTION_MESSAGE);
					
					int n = Integer.parseInt(userInput);
					double result = m4(n);
					displayResult(option,n,result);
							
					break;
					
				}
				case 5:
				{
					break;
				}
				default:
				{
					JOptionPane.showMessageDialog(null, "Please Enter Numbers Between 1 and 5","Incorrect Selection",JOptionPane.ERROR_MESSAGE);
				}
				
			
			}
		}
		
		JOptionPane.showMessageDialog(null,"Good Bye","Thank You For Using Math Series", JOptionPane.INFORMATION_MESSAGE);

		
		
	}
	
	public static long m1(int n)
	{
		long sum = 0;
		
		for (int i=1;i<=n;i++)
		{
			sum = sum + i;
		}
			
			
		return sum;
	}
	
	public static long m2(int n)
	{
		long sum = 0;
		
		for (int i=1;i<=n;i++)
		{
			sum = (long) (sum + Math.pow(i, 2));
		}
			
			
		return sum;
	}
	
	public static long m3(int n)
	{
		long sum = 0;
		
		for (int i=1;i<=n;i++)
		{
			sum = (long) (sum + Math.pow(5, i));
		}
			
			
		return sum;
	}
	
	public static float m4(int n)
	{
		double sum = 0;
		long factorial = 1;
		
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j>0;j--)
			{
				factorial = factorial*j;
			}
			sum = sum + (double)1/factorial;
			factorial = 1;
		}
			
		
		return (float) sum;
	}
	
	public static void displayResult(int option, int n, double result)
	{
		switch(option)
		{
			case 1:
			{
				JOptionPane.showMessageDialog(null, ""
						+ "        CSC 229 - Project 03 (Math Series)\n"
						+ "__________________________________________\n"
						+ "     1 + 2 + 3 + ....... + " + n + " = " + (long)result + "\n"
						+ "__________________________________________"
						,"Math Series",
						JOptionPane.INFORMATION_MESSAGE);
				
				break;
			}
			case 2:
			{
				JOptionPane.showMessageDialog(null, ""
						+ "        CSC 229 - Project 03 (Math Series)\n"
						+ "__________________________________________\n"
						+ "     1 + 4 + 9 + ....... + " + (int)Math.pow(n, 2) + " = " + (long)result + "\n"
						+ "__________________________________________"
						,"Math Series",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 3:
			{
				JOptionPane.showMessageDialog(null, ""
						+ "        CSC 229 - Project 03 (Math Series)\n"
						+ "__________________________________________\n"
						+ "     5 + 25 + 125 + ....... + " + (int)Math.pow(5, n) + " = " + (long)result + "\n"
						+ "__________________________________________"
						,"Math Series",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			case 4:
			{
				JOptionPane.showMessageDialog(null, ""
						+ "        CSC 229 - Project 03 (Math Series)\n"
						+ "__________________________________________\n"
						+ "     1/1! + 1/2! + 1/3! + ....... + " + "1/" + n + "! = " + formatDecimalPoint(result,7) + "\n"
						+ "___________________________________________"
						,"Math Series",
						JOptionPane.INFORMATION_MESSAGE);
				break;
			}
		
		}
		
	}
	
	public static double formatDecimalPoint(double result,int decimalPoint)
	{
		return Math.round(result * Math.pow(10, decimalPoint))/Math.pow(10, decimalPoint);
	}
	

}

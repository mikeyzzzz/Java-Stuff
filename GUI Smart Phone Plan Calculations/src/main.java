

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) 
	{
		//initializes variables needed for program
		String firstName;
		String lastName;
		String address;
		String cityName;
		String stateCode;
		String zipCode;
		String smartPhoneCode;
		String entertainmentServiceCode;
		String servicePlanCode;
		double totalCost = 0.00;
		double finalCost = 0.00;
		int discount = 0;
		int serviceCounter = 0;
		
		//initializes prices and options
		double[] smartPhonePrices = {99.33,83.55,50.72,41.25,0.00};
		String[] smartPhoneOptions = {"Apple iPhone 14 Pro","Samsung Galaxy S20 FE 5g UW","Google Pixel 6 Pro","Motorola Moto g pure","NO Service"};
		double[] servicePlanPrices = {35.00,55.00,65.00,75.00,85.00,0.00};
		String[] servicePlanOptions = {"Unlimited (Start)","Unlimited (Play More)","Unlimited (Get More)","Shared Data (S 5G)","Shared Data (M 10GB)", "NO Service"};
		double[] entertainmentServicePrices = {5.99,7.99,10.99,0.00};
		String[] entertainmentServiceOptions = {"Disney","Hulu","Sports + Disney + Hulu","NO Service"};
		
		//initializes 
		firstName = JOptionPane.showInputDialog(null, "Please enter your first name: ", "First name", JOptionPane.QUESTION_MESSAGE);
		lastName = JOptionPane.showInputDialog(null, "Please enter your last name: ", "Last name", JOptionPane.QUESTION_MESSAGE);
		address = JOptionPane.showInputDialog(null, "Please enter your address: ", "Address", JOptionPane.QUESTION_MESSAGE);
		cityName = JOptionPane.showInputDialog(null, "Please enter your city: ", "City name", JOptionPane.QUESTION_MESSAGE);
		stateCode = JOptionPane.showInputDialog(null, "Please enter your state (two letter): ", "Two Letter State Code", JOptionPane.QUESTION_MESSAGE);
		zipCode = JOptionPane.showInputDialog(null, "Please enter your zip code: ", "Zip Code", JOptionPane.QUESTION_MESSAGE);
		
		//gets input for smart phone code
		smartPhoneCode = JOptionPane.showInputDialog(null, "\n" +
				"                   Please Select Your Smart Phone                   \n" +
			    "                        Price/ Month for 24 Months                     \n" +
			    "_______________________________________________\n" +
			    "                                                                    \n" +
			    "            1. Apple iPhone 14 Pro                               $ 99.33          \n" +
			    "            2. Samsung Galaxy S20 FE 5g UW          $ 83.55          \n" +
			    "            3. Google Pixel 6 Pro                                  $ 50.72          \n" +
			    "            4. Motorola Moto g pure                            $ 41.25          \n" +
			    "                                                                    \n" +
			    "            5. NO Service                                           \n" +
			    "_______________________________________________\n" +
			    "                                                                    \n" 
			    ,"Smart Phone", JOptionPane.QUESTION_MESSAGE);
		
		//checks to see if a service was selected
		if(Integer.parseInt(smartPhoneCode)!=5)
			serviceCounter++;
		
		//gets input for service plan code
		servicePlanCode = JOptionPane.showInputDialog(null, "\n" +
				"           Please Select a Service Plan        \n" +
				"                       Price/ Month                \n" +
				"_____________________________________\n" +
				"       Unlimited:                              \n" +
				"           1. Start                       $35.00          \n" +
				"           2. Play More              $55.00          \n" +
				"           3. Get More                $65.00          \n" +
				"                                               \n" +
				"       Shared Data:                            \n" +
				"           4. S (5GB)                  $75.00    \n" +
				"           5. M (10GB)               $85.00    \n" +
				"                                               \n" +
				"           6. NO Service                       \n" +
				"                                               \n" 
				,"Service Plan", JOptionPane.INFORMATION_MESSAGE);
		
		if(Integer.parseInt(servicePlanCode)!=6)
			serviceCounter++;
		
		//gets input for entertainment service code
		entertainmentServiceCode = JOptionPane.showInputDialog(null, "\n" +
				"                Please Select Your Entertainment Service                   \n" +
			    "                                          Monthly Cost                     \n" +
			    "_______________________________________________\n" +
			    "                                                                    \n" +
			    "            1. Disney                                                $ 99.33          \n" +
			    "            2. Hulu                                                    $ 83.55          \n" +
			    "            3. Sports + Disney + Hulu                  $ 50.72          \n" +
			    "                                                                    \n" +
			    "            4. NO Service                                           \n" +
			    "_______________________________________________\n" +
			    "                                                                    \n" 
			    ,"Smart Phone", JOptionPane.QUESTION_MESSAGE);
		
		if(Integer.parseInt(entertainmentServiceCode)!=4)
			serviceCounter++;
		
		//sets total cost to the sum of the users options 
		 totalCost = smartPhonePrices[Integer.parseInt(smartPhoneCode)-1] + servicePlanPrices[Integer.parseInt(servicePlanCode)-1] + entertainmentServicePrices[Integer.parseInt(entertainmentServiceCode)-1];
		 
		//checks what discount should be given based on number of selected services
		 if (serviceCounter==3)
			 discount = 25;
		 else if (serviceCounter==2)
			 discount = 20;
		 else
			 discount = 0;
		 
		//calculates final cost by subtracting discount from original total cost
		finalCost = totalCost - (totalCost*(discount*.01));
		 			 
		//prints results 		
		JOptionPane.showMessageDialog(null, "\n" +
				"                           CSC 229 - Project 02                           \n" +
				"__________________________________________________________\n" +
				"                                                                          \n" +
				"              First Name : " + firstName + "\n" +
				"              Last Name : " + lastName + "\n" +
				"              Address      : " + address + "\n" +
				"                                      " + cityName + ", " + stateCode + " " + zipCode + "\n" +
				"__________________________________________________________\n" +
				"                               Service List                               \n" +
				"__________________________________________________________\n" +
				"   Phone                                       : " + smartPhoneOptions[Integer.parseInt(smartPhoneCode)-1] + "                ---" + smartPhonePrices[Integer.parseInt(smartPhoneCode)-1] + "\n" +
				"   Service Plan                            : " + servicePlanOptions[Integer.parseInt(servicePlanCode)-1] + "                  ---" + servicePlanPrices[Integer.parseInt(servicePlanCode)-1] + "\n" +
				"   Entertainment Service          : " + entertainmentServiceOptions[Integer.parseInt(entertainmentServiceCode)-1] + "         ---" + entertainmentServicePrices[Integer.parseInt(entertainmentServiceCode)-1] + "\n" + 
				"__________________________________________________________\n" + 
				"                            Total Cost: $" + String.format("%.2f",totalCost) + "\n" +
				"                            Discount  : %" + discount + "\n" +
				"                            Final Cost: $"+ String.format("%.2f",finalCost) + "\n" +
				"__________________________________________________________\n" 
				, "Final Cost of Services",JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

}

import javax.swing.JOptionPane;

public class Homework03 {

	public static void main(String[] args) 
	{
		Account account = new Account(1122,20000);
		
		account.withdraw(2500);
		account.deposit(3000);
		
		JOptionPane.showMessageDialog(null, account.toString(), "Account Details", JOptionPane.INFORMATION_MESSAGE);
	}

}

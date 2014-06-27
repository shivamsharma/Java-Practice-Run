/*To open the bank account in "Bank of Holysense"*/
import javax.swing.JOptionPane;
class Assign3_6
{
	static String name;
	static int initial;
	static String co_owner;
	static void account_info()		//For single access account
	{
		name=JOptionPane.showInputDialog("Enter the name of person who applied for new account :-");
		initial=Integer.parseInt(JOptionPane.showInputDialog("Enter the initial amount :-"));
	}
	static void account_info(String co_ownername)		//For joint account
	{
		name=JOptionPane.showInputDialog("Enter the name of person who applied for new account :-");
		 co_ownername=JOptionPane.showInputDialog("For joint account enter the name of person :-");
		initial=Integer.parseInt(JOptionPane.showInputDialog("Enter the initial amount :-"));
		co_owner=co_ownername;
	}
	public static void main(String arg[])
	{
		int num=Integer.parseInt(JOptionPane.showInputDialog("PRESS \"1 FOR SINGLE ACCOUNT AND \"2 JOINT ACCOUNT \"\""));
		if(num==1)
		{
			account_info();
			JOptionPane.showMessageDialog(null,"Entered info of account holder---\n NAME-"+name+"\nAMOUNT:-Rs"+initial);
		}
		else{
			account_info(co_owner);
			JOptionPane.showMessageDialog(null,"Entered info of account holder---\n NAME OF ACCOUNT HOLDER-"+name+"\nNAME OF NOMINEE-"+co_owner+"\nAMOUNT:-Rs"+initial);
			}
	}
}
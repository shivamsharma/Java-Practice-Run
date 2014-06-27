import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import java.awt.GridLayout;
class Main extends JFrame
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		Win frame=new Win();
		frame.setVisible(true);
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

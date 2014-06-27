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
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
class Win extends JFrame
{
	private final JPanel eventThreadJPanel =new JPanel( new GridLayout( 2, 2, 5, 5 ) );
	private final JPanel panel1=new JPanel(new GridLayout(2,2,5,5));
	private final JButton button=new JButton("Find!!!");
	private final JTextArea area=new JTextArea();
	private final JLabel label=new JLabel();
	public Win()
	{
		super("Fibonacci Numbers");
		setLayout( new GridLayout( 2, 1, 10, 10 ) );
		panel1.setBorder( new TitledBorder(new LineBorder( Color.BLACK ), "With SwingWorker" ) );
		panel1.add( new JLabel( "Get Fibonacci of:" ) );
		add(panel1);
		panel1.add(button);
		panel1.add(area);
		panel1.add(label);
		add(label);
	}
}

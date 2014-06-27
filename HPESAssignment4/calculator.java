import add.Addition;
import sub.Subtract;
import div.Division;
import multi.Multiply;
public class calculator
{
	public static void main(String[] arg)
	{
		Addition a=new Addition();
		Subtract b=new Subtract();
		Division c=new Division();
		Multiply d=new Multiply();
		String s=System.console().readLine("");
		int num1=Integer.parseInt(s);
		s=System.console().readLine("");
		int num2=Integer.parseInt(s);
		a.show(num1,num2);
		b.show(num1,num2);
		c.show(num1,num2);
		d.show(num1,num2);
	}
}
		
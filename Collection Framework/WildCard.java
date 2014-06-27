/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.util.ArrayList;
class Main
{
	static double sum(ArrayList<? extends Number> list)
	{
		double sum=0;
		for(Number n:list)
		sum+=n.doubleValue();
		return sum;
	}
	public static void main(String args[])
	{
		Integer in[]={1,2,3,4,5};
		Double dou[]={1.1,2.2,3.3};
		ArrayList<Number> list=new ArrayList<Number>();
		for(int i=0;i<5;i++)
		list.add(in[i]);
		for(int i=0;i<3;i++)
		list.add(dou[i]);
		System.out.println("ArrayList is"+list);
		System.out.println("Total sum:"+sum(list));
	}
}

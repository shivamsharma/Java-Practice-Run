/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
class Main
{
	static String[] type(int n)
	{
		String[] temp=new String[10];
		if(n==2)
		{
			for(int i=0;i<10;i++)
			{
				temp[i]=""+(int)(Math.random()*1000);
			}
		}
		else
		{
			for(int i=0;i<10;i++)
			{
				int t=97+(int)(Math.random()*1000)%26;		//Randomly generate alphabets from a to z
				char ch=(char)(t);
				temp[i]=""+ch;
			}
		}
		return temp;
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Ask for alphabets or number
		System.out.println("Enter the following the choice:");
		System.out.print("1.Alphabets\n2.Number\nInput is:");
		int n=Integer.parseInt(br.readLine());
		String input[]=type(n);
		List<String> list=new ArrayList<String>();
		for(String str:input)
		{
			list.add(str);
		}
		System.out.println("Random Series is:"+list);
		//Sorting the elements
		Collections.sort(list);
		System.out.println("Sorted list is:"+list);
		System.out.println("Enter the following the choice:");
		System.out.print("1.Alphabets\n2.Number\nInput is:");
		n=Integer.parseInt(br.readLine());
		input=type(n);
		list=new ArrayList<String>();
		for(String str:input)
		{
			list.add(str);
		}
		System.out.println("Random Series is:"+list);
		//Sorting in the reverseOrder
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("Reversly Sorted list is:"+list);
		//Finding the min and max element in list
		System.out.println("Minimum Value:"+Collections.min(list)+"\nMaximum value:"+Collections.max(list));
		Collections.fill(list,input[0]);
		System.out.println("After using fill:"+list);
	}
}
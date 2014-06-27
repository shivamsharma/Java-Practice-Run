/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
class Main
{
	/**ArrayList Program*/
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the No. of colors you want to enter:");
		int n=Integer.parseInt(br.readLine());
		String[] colors=new String[n];
		for(int i=0;i<n;i++)
		{
			colors[i]=br.readLine();
		}
		System.out.println("Adding the colors to the Array List...\n");
		List<String> colorlist=new ArrayList<String>();
		//Adding the element at the end of list
		for(int i=0;i<n;i++)
		{
			colorlist.add(colors[i]);
		}
		System.out.println("All colors are added in the given List!!!\n");
		//Iterator over specified list
		Iterator<String> iterator=colorlist.iterator();
		System.out.println("Colors in List are Following:");
		int i=1;
		while(iterator.hasNext())
		{
			System.out.println((i++)+"."+iterator.next());
		}
		System.out.println("\nEnter the No. of colors for different List:");
		int m=Integer.parseInt(br.readLine());
		String[] remcolors=new String[m];
		for(i=0;i<m;i++)
		{
			remcolors[i]=br.readLine();
		}
		System.out.println("Adding colors to the 2nd List...\n");
		List<String> remlist=new ArrayList<String>();
		//Adding the colors to remlist
		for(i=0;i<m;i++)
		{
			remlist.add(remcolors[i]);
		}
		System.out.println("Colors has been added in the 2nd list!!!\n");
		Iterator<String> it=remlist.iterator();
		System.out.println("Colors in the 2nd list are Following:");
		i=0;
		while(it.hasNext())
		{
			System.out.println((++i)+"."+it.next());
		}
		System.out.println("Removing the elements of 2nd list from 1st list...\n");
		iterator=colorlist.iterator();
		while(iterator.hasNext())
		{
			if(remlist.contains(iterator.next()))
			{
				iterator.remove();
			}
		}
		System.out.println("All respective elements are removed from 1st list!!!\n");
		System.out.println("Printing the rest of elements in 1st list:");
		i=0;
		Iterator<String> finalIterator=colorlist.iterator();
		while(finalIterator.hasNext())
		{
			System.out.println((++i)+"."+finalIterator.next());
		}
	}
}

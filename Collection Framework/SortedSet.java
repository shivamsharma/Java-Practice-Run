/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Iterator;
class Main
{
	public static void main(String... args)throws IOException
	{
	    String[] colors={"red","black","white","blue","yellow","brown","pink","green","voilet","cyan","peach","grey","orange","red"};
	    SortedSet<String> tree=new TreeSet<String>(Arrays.asList(colors));
	    System.out.println("Tree is:"+tree);
	    //Printing the elements before "orange" and after "orange"
	    System.out.println("Elements before the orange:"+tree.headSet("orange"));
	    System.out.println("Elements after the orange"+tree.tailSet("orange"));
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    System.out.println("Enter the no. of colors you want to add different from above:");
	     int n=Integer.parseInt(br.readLine());
	     for(int i=0;i<n;i++)
	     {
			String str=br.readLine();
			tree.add(str);
		}
		Iterator iterator=tree.iterator();
		while(iterator.hasNext())
		{
			iterator.next();
			System.out.println(tree);
			iterator.remove();
		}
		System.out.println("Tree is empty........");
	}
}

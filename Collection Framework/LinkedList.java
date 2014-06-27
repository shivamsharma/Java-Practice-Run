/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Collection;
class Main
{
	static void stringToLinkedList(String[] color,Collection<String> list)
	{
		for(String str:color)
		{
			list.add(str);
		}
		return;
	}
	public static void main(String[] args)
	{
		String color1[]={"cyan","red","blue","pink","orange","purple","green"};
		String color2[]={"margentta","blue","green","yellow","grey","gunmetal"};
		//List 1st
		List<String> list1=new LinkedList<String>();
		//List 2nd
		List<String> list2=new LinkedList<String>();
		//Adding elements to list 1st
		stringToLinkedList(color1,list1);
		//Adding elements to list 2nd
		stringToLinkedList(color2,list2);
		//Concatinating two lists
		list1.addAll(list2);
		//Iterator to 1st List
		ListIterator<String> iterator=list1.listIterator(0);
		String color3[]={"maroon","black","gunmetal","purple"};
		//3rd List
		List<String> list3=new LinkedList<String>();
		//Adding elements to list 3rd
		stringToLinkedList(color3,list3);
		System.out.println("\n...Setting pink to pinky and blue to billu in list 1 ...\n");
		//converting pink to pinky and blue to billu
		while(iterator.hasNext())
		{
			String str=iterator.next();
			if(str.equals("pink"))
			iterator.set("pinky");
			else if(str.equals("blue"))
			iterator.set("billu");
		}
		//Seting iterator to start
		iterator=list1.listIterator(0);
		int i=0;
		System.out.println("List in forward manner:");
		while(iterator.hasNext())
		{
			System.out.println((++i)+"."+iterator.next());
		}
		System.out.println("\nList in reverse manner:");
		i=0;
		while(iterator.hasPrevious())
		{
			System.out.println((++i)+"."+iterator.previous());
		}
	}
}
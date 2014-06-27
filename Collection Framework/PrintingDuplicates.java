/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.Collection;
class Main
{
	static List<String> strToList(String[] str)
	{
		ArrayList<String> list=new ArrayList<String>();
		for(String temp:str)
		{
			list.add(temp);
		}
		return list;
	}
	static Set<String> remDuplicates(Collection<String> col)
	{
		Set<String> set=new HashSet<String>(col);
		System.out.println("Set is:"+set);
		return set;
	}
	static void printDuplicates(List<String> list,Set<String> set)
	{
		int count=0;
		for(String s:set)
		{
			list.remove(s);
		}
		Set<String> newset=new HashSet<String>(list);
		System.out.println("There are "+newset.size()+" duplicates:"+newset);
	}
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str[]={"bag","pen","file","bag","shoes","socks","file","program","code","red","code"};
		List<String> list=new ArrayList<String>();
		list=strToList(str);
		System.out.println("List is:"+list);
		Set<String> set=remDuplicates(list);
		//calculating the duplicates
		printDuplicates(list,set);
	}
}
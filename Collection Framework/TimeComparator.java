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
import java.util.Comparator;
class Time
{
	int hours,minutes,seconds;
	public Time(int hours,int minutes,int seconds)
	{
		this.hours=hours;
		this.minutes=minutes;
		this.seconds=seconds;
	}
	public int getHours()
	{
		return this.hours;
	}
	public int getMinutes()
	{
		return this.minutes;
	}
	public int getSeconds()
	{
		return this.seconds;
	}
	public String toString()
	{
		return String.format("%d:%02d:%02d %s",((hours==0||hours==12)?12:hours%12),this.minutes,this.seconds,((hours>=12)?"PM":"AM"));
	}
}
class TimeComparator implements Comparator<Time>
{
	public int compare(Time t1,Time t2)
	{
		int hours=t1.getHours()-t2.getHours();
		int minutes=t1.getMinutes()-t2.getMinutes();
		int seconds=t1.getSeconds()-t2.getSeconds();
		if(hours>0)
		return 1;
		else if(hours<0)
		return -1;
		if(minutes>0)
		return 1;
		else if(minutes<0)
		return -1;
		if(seconds>0)
		return 1;
		else if(seconds<0)
		return -1;
		return 0;
	}
	public boolean equals(Object obj)
	{
		return true;
	}
}
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		List<Time> list=new ArrayList<Time>();
		list.add(new Time(6,6,6));
		list.add(new Time(5,15,60));
		list.add(new Time(12,5,2));
		list.add(new Time(6,5,5));
		list.add(new Time(5,3,2));
		System.out.println("Present List of Time's is:"+list);
		//Sorting the Time
		Collections.sort(list,new TimeComparator());
		System.out.println("Sorted Time is:"+list);
	}
}
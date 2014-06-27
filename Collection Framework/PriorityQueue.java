/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.PriorityQueue;
class Main
{
	public static void main(String... args)
	{
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(12);
		Integer integer[]={11,2,5,6,8,1,1,2,0};
		System.out.println("Initial Integer array is:");
		for(Integer n:integer)
		System.out.print(n+" ");
		System.out.println();
		for(Integer n:integer)
		pq.offer(n);
		System.out.println("Priority Queue is:"+pq);
		System.out.println("Now Polling from Queue:");
		while(pq.size()>0)
		{
			System.out.println("Dequeued element is:"+pq.peek());
			pq.poll();
		}
	}
}

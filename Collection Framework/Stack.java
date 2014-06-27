/*This program is written by @Author Shivam Sharma(28shivamsharma@gmail.com).*
* This code has proprietary right to Author.*
* Read LICENCE to use it.*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
class StackProg< T >
{
	private  ArrayList< T > list;
	public StackProg()
	{
		this(10);
	}
	public StackProg(int capacity)
	{
		list=new ArrayList< T >(capacity);
	}
	public void push(T element)
	{
		list.add(element);
	}
	public T pop()
	{
		if(list.isEmpty())
		{
			throw new EmptyStackException("Stack is Empty");
		}
		return list.remove(list.size()-1);
	}
	public String toString()
	{
			String s="Status of Stack:";
			for(T element:list)
			s=s+""+element+"->";
		return s;
	}
}
class EmptyStackException extends RuntimeException
{
	public EmptyStackException()
	{
		this("Stack is Empty");
	}
	public EmptyStackException(String exception)
	{
		super(exception);
	}
}
class Main
{
	public static < T > void testPush(T[] array,StackProg< T > stack)
	{
		for(T element:array)
		{
			stack.push(element);
			System.out.println(stack);
		}
	}
	public static < T > void testPop(StackProg< T > stack)
	{
		T element;
		try
		{
			while(true)
			{
				element=stack.pop();
				System.out.println(stack);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String... args)
	{
		Integer integer[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
		Double double1[]={1.1,2.2,3.0,4.8,5.2,6.2};
		StackProg<Integer> integerStack=new StackProg<Integer>();
		StackProg<Double> doubleStack=new StackProg<Double>();
		//Now testing integer stack
		System.out.println("Now Pushing the Integers in Stack:-");
		testPush(integer,integerStack);
		System.out.println("\nNow Poping the Integer values from Stack:-");
		testPop(integerStack);
		//Now testing double stack
		System.out.println("Now Pushing the Doubles in Stack:-");
		testPush(double1,doubleStack);
		System.out.println("\nNow Poping the Double values from Stack:-");
		testPop(doubleStack);
	}
}

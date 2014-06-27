import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.Arrays;
class ArrayAsObject
{
	static int array[];
	public ArrayAsObject()
	{
		array=new int[5];
	}
	public void write(int val)throws InterruptedException
	{
		Thread.sleep(400);
		int i=0;
		if(i<5)
		array[i++]+=val;
		else new ArrayBoundException().printStackTrace();
		System.out.println("Array is:"+Arrays.toString(array));
	}
	public void display()
        {
                for(int temp:array)
                System.out.print(temp+" ");
                System.out.println();
        }
}
class ArrayBoundException extends Exception
{
	public ArrayBoundException()
	{
		throw new ArrayIndexOutOfBoundsException();
	}
}
class SharedArrayWriter implements Runnable
{
	String str;
	private final ArrayAsObject array;
	public SharedArrayWriter(String str,ArrayAsObject array)
	{
		this.str=str;
		this.array=array;
	}
	public void run()
	{
		try
		{
			for(int i=1;i<6;i++)
			{
				System.out.println(str+" Thread is running.");
				array.write(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
class Main
{
	public static void main(String... args)
	{
		ArrayAsObject array=new ArrayAsObject();
		ExecutorService thread=Executors.newCachedThreadPool();
		thread.execute(new SharedArrayWriter("Task 1",array));
		thread.execute(new SharedArrayWriter("Task 2",array));
		thread.shutdown();
	}
}

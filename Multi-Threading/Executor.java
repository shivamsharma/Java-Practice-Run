import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class Basic implements Runnable
{
	String str;
	int time=0;
	public Basic(String str)
	{
		this.str=str;
		time=(new Random()).nextInt(5000);
	}
	public void run()
	{
		try
		{
			System.out.println(str+" going to sleep for "+time+" milliseconds.");
			Thread.sleep(time);
			System.out.println(str+" ends...");
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
		System.out.println("USING EXECUTOR FRAMEWORK");
		ExecutorService threads=Executors.newCachedThreadPool();
		threads.execute(new Basic("Program-1"));
		threads.execute(new Basic("Program-2"));
		threads.execute(new Basic("Program-3"));
		threads.shutdown();
		System.out.println("Main ends....");
	}
}

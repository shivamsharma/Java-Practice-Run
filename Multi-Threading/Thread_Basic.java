import java.util.Random;
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
		Thread thread1=new Thread(new Basic("programe-1"));
		Thread thread2=new Thread(new Basic("program-2"));
		Thread thread3=new Thread(new Basic("program-3"));
		System.out.println("Thread-1 is going to be executed:");
		thread1.start();
		System.out.println("Thread-2 is going to be executed:");
		thread2.start();
		System.out.println("Thread-3 is going to be executed:");
		thread3.start();
		System.out.println("Main ends....");
	}
}

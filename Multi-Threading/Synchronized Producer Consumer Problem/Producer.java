import java.util.Random;
class Producer implements Runnable
{
	private static Random generator=new Random();
	private final Buffer buffer;
	public Producer(Buffer buffer)
	{
		this.buffer=buffer;
	}
	public void run()
	{
		int sum=0;
		try
		{
			for(int i=1;i<=10;i++)
			{
				Thread.sleep(generator.nextInt(1000));
				buffer.set(i);
				sum+=i;
				System.out.println("Produced sum:"+sum);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Producer produced:"+sum+"  ---Producer terminated.\n");
	}
}

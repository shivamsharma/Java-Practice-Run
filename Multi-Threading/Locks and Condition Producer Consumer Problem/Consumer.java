import java.util.Random;
class Consumer implements Runnable
{
	private static Random generator=new Random();;
	private final Buffer buffer;
	public Consumer(Buffer buffer)
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
				sum+=buffer.get();
				System.out.println("Consumed sum:"+sum);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Consumer read values totaling :"+sum+" -----Consumer terminated\n");
	}
}

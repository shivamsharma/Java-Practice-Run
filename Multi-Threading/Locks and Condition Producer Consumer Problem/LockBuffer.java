import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;
class LockBuffer implements Buffer
{
	private final Lock accessLock = new ReentrantLock();
	private final Condition canWrite = accessLock.newCondition();
	private final Condition canRead = accessLock.newCondition();
	private int buffer=-1;
	private boolean occupied=false;
	public LockBuffer()
	{
	}
	//put value to buffer
	public void set(int e)throws InterruptedException
	{
		accessLock.lock();
		try
		{
			while(occupied)
			{
				System.out.println("Producer cannot write in the buffer");
				canWrite.await();	
			}
			buffer=e;
			occupied=true;
			System.out.println("Producer writes in the buffer:"+e);
			canRead.signalAll();	
		}
		finally
		{
			accessLock.unlock();
		}
	}
	
	//get value from buffer
	public int get()throws InterruptedException
	{
		int readValue=0;
		accessLock.lock();
		try
		{
			while(!occupied)
			{
				System.out.println("Consumer tried to read but buffer empty");
				canRead.await();
			}
			occupied=false;
			readValue=buffer;
			System.out.println("Consumer reads from the buffer:"+readValue);
			canWrite.signalAll();
		}
		finally
		{
			accessLock.unlock();
		}
		return readValue;
	}
}

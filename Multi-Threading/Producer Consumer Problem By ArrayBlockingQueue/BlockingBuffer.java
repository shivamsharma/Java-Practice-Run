import java.util.concurrent.ArrayBlockingQueue;
class BlockingBuffer implements Buffer
{
	private ArrayBlockingQueue<Integer> buffer;
	public BlockingBuffer()
	{
		buffer=new ArrayBlockingQueue<Integer>(1);
	}
	//put value to buffer
	public void set(int e)throws InterruptedException
	{
		System.out.println("Producer writes in the buffer:"+e);
		buffer.put(e);
	}
	
	//get value from buffer
	public int get()throws InterruptedException
	{
		int val=buffer.take();
		System.out.println("Consumer reads from the buffer:"+val);
		return val;
	}
}

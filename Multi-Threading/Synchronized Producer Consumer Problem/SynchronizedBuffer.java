class SynchronizedBuffer implements Buffer
{
	private int buffer=-1;
	private boolean occupied=false;
	//put value to buffer
	public synchronized void set(int e)throws InterruptedException
	{
		while(occupied)
		{
			System.out.println("Buffer is already occupied.Producer waits...");
			wait();
		}
		buffer=e;
		occupied=true;
		System.out.println("Producer writes in the buffer:"+e);
		//notifyAll();
	}
	
	//get value from buffer
	public synchronized int get()throws InterruptedException
	{
		while(!occupied)
		{
			System.out.println("Buffer is already occupied.Consumer waits...");
			wait();
		}
		occupied=false;
		System.out.println("Consumer reads from the buffer:"+buffer);
		//notifyAll();
		return buffer;
	}
}

class UnsynchronizedBuffer implements Buffer
{
	private int buffer=-1;
	//put value to buffer
	public void set(int e)throws InterruptedException
	{
		System.out.println("Producer writes in the buffer:"+e);
		buffer=e;
	}
	
	//get value from buffer
	public int get()throws InterruptedException
	{
		System.out.println("Consumer reads from the buffer:"+buffer);
		return buffer;
	}
}

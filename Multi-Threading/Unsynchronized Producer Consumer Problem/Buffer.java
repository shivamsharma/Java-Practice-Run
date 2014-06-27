interface Buffer
{
	//put value to buffer
	public void set(int e)throws InterruptedException;
	
	//get value from buffer
	public int get()throws InterruptedException;
}

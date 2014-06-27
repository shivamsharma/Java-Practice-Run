import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ExecutorService threads=Executors.newCachedThreadPool();
		Buffer buffer=new LockBuffer();
		threads.execute(new Producer(buffer));
		threads.execute(new Consumer(buffer));
		threads.shutdown();
	}
}

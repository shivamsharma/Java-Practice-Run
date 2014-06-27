class Assign5_8
{
	public static void main(String arg[])
	{
		int i,j;
		String s=System.console().readLine("Enter the string:-");
		StringBuffer sb=new StringBuffer(s);
		int len=sb.length();
		sb=sb.reverse();
		char array[]=new char[1000];
		array=s.toCharArray();
		for(i=len-1;i>=0;i--)
		{
			for(j=len-1;j>=i;j--)
			System.out.print(array[j]);
			System.out.println("");
		}
	}
}
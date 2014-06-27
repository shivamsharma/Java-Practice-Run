class Assign5_3
{
	public static void main(String arg[])
	{
		String s=System.console().readLine("Enter the string:-");
		String st=System.console().readLine("Enter the position to change=");
		int pos=Integer.parseInt(st);
		String a=System.console().readLine("Enter a single character:-");
		char ch[]=new char[1];
		ch=a.toCharArray();
		int len=s.length();
		char array[]=new char[len];
		array=s.toCharArray();
		array[pos-1]=ch[0];
		for(int i=0;i<len;i++)
		System.out.print(array[i]);
	}
}
class Assign5_6
{		
	public static void main(String s[])
	{
		String d=System.console().readLine("Enter a String\n");
		String b="hp";
		char a[]=d.toCharArray();
		if(a[0]=='a'||a[0]=='e'||a[0]=='i'||a[0]=='o'||a[0]=='u')
		{
		}
		else
		a[0]=' ';
		String c=new String(a);
		c=c.concat(b);
		System.out.println("new string is "+c);
	}
}
class Assign5_5
{
	public static void main(String arg[])
	{
		String s=System.console().readLine("Enter the string:-");
		int len=s.length();
		char ch[]=new char[len];
		ch=s.toCharArray();
		int small=0,capital=0,space=0,symbol=0;
		int temp;
		for(int i=0;i<len;i++)
		{
			temp=ch[i];
			if(temp>64&&temp<91)
			capital++;
			else if(temp>96&&temp<123)
			small++;
			else if(temp==32)
			space++;
			else symbol++;
		}
		System.out.println("Length of string="+len);
		System.out.println("Capital letters="+capital);
		System.out.println("Small letters="+small);
		System.out.println("Spaces="+space);
		System.out.println("Symbol="+symbol);
	}
}
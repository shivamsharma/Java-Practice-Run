class Test
{
	int num;
	int getReverse(int n) 
	{
		int a,rev=0,temp;
		int count=1;
		temp=n;
		while(temp/10>0)
		{
			count++;
			temp=temp/10;
		}
		
		while(count>0)
		{
			a=n%10;
			rev+=a*Math.pow(10,count-1);
			n=n/10;
			count--;
		}
		return rev;
	}
	public static void main(String arg[])
	{
		Test classpass=new Test();
		String s=System.console().readLine("Enter the number whose reverse is to fine:-");
		classpass.num=Integer.parseInt(s);
		classpass.getReverse(classpass.num);
		System.out.println("Reverse of number is="+classpass.getReverse(classpass.num));
	}
}
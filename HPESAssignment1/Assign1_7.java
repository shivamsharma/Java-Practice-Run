class Assign1_7
{
	public static void main(String arg[])
	{
		int a,i,fact=1;
		String s=System.console().readLine("Enter the no. to find the factorial:");
		a=Integer.parseInt(s);
		for(i=a;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial is "+fact);
	}
}	
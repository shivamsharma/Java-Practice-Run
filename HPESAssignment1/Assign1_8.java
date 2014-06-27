class Assign1_8
{
	public static void main(String arg[])
	{
		int i,a,b,end,add=0;
		System.out.println("Enter the no. till which fibonacci series is to be printed");
		String s=System.console().readLine(" ");
		end=Integer.parseInt(s);
		System.out.print("0\t1 ");
		a=0;b=1;
		add=a+b;
		while(add<=end)
		{
			System.out.print("\t"+add);
			a=b;
			b=add;
			add=a+b;
		}
	}
}
class Assign1_5
{ 
 	public static void main(String arg[])
	 {
		int a,i,flag=0;
		System.out.print("Enter the no.=");
		String s=System.console().readLine("");
		a=Integer.parseInt(s);
		if(a==1||a==4)
		{
			System.out.println("IT IS NOT A PRIME NO.");
			System.exit (0);
		}
		else if(a==2||a==3)
		{
			System.out.println("IT IS A PRIME NO.");
			System.exit (0);
		}
		else for(i=2;i<=a/2;i++)
		{
			flag=0;
			if(a%i==0)
			{
				System.out.println("IT IS NOT A PRIME NO.");
				System.exit (0);
			}
			else flag=1;
		}
		if(flag==1)
		{
			System.out.println("IT IS A PRIME NO.");
		}
	}
}
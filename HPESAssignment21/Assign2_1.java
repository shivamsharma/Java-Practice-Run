class Assign2_1
{
	public static void main(String arg[])
	{
		int i,j,k,l;
		for(i=1;i<=5;i++)
		{
			for(j=4;j>=i;j--)
			{
				System.out.printf(" ");
			}
			for(k=53;k>=54-i;k--)
			{
				System.out.printf("%c",k);
			}
			for(l=55-i;l<=53;l++)
			{
				System.out.printf("%c",l);
			}
			System.out.println("");
		}

		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf(" ");

			}
			for(k=53;k>=49+i;k--)
			{
				System.out.printf("%c",k);
			}
			for(l=51;l<=54-i;l++)
			{
				System.out.printf("%c",l);
			}
			System.out.println("");
		}
	}
}
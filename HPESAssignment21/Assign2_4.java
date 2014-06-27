class Assign2_4
{
	public static void main(String arg[])
	{
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(k=(11-2*i);k>=1;k--)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}
	}
}
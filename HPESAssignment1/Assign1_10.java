class Assign1_10
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
			for(k=65;k<i+65;k++)
			{
				System.out.printf("%c",k);
			}
			for(l=63+i;l>64;l--)
			{
				System.out.printf("%c",l);
			}
			System.out.printf("\n");
		}
	}
}
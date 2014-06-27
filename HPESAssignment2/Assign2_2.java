class Assign2_2
{
	public static void main(String arg[])
	{
		int i,j,k,l;
		int a[]={1,2,3,4,5};
		for(i=1;i<=5;i++)
		{
			k=0;
			for(j=5;j>=i;j--)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			System.out.println("");
		}

		for(i=1;i<=4;i++)
		{
			k=0;
			for(j=i+1;j>=1;j--)
			{
				System.out.print(a[k]+" ");
				k++;
			}
			System.out.println("");

		}
	}
}
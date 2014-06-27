class Assign2_3
{
	public static void main(String arg[])
	{
		int a[]={1,0,1,0,1};
		int b[]={0,1,0,1,0};
		int i,j,k;
		for(i=1;i<=5;i++)
		{
			k=0;
			for(j=1;j<=i;j++)
			{
				if(i%2!=0)
				{
					System.out.print(a[k]);
				}
				else
				{	
					System.out.print(b[k]);
				}k++;
				
			}
			System.out.println("");
		}
	}
}
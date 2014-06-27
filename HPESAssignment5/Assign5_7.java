class Assign5_7
{
	public static void main(String ...ar)
	{
		int i,j,k,l;
		char a[]={'A','L','L','A','H','A','B','A','D'};
		for(i=0;i<9;i++)
		{
			for(j=8;j>i;j--)
			{
				System.out.print(" ");
			}
			l=0;
			for(k=1;k<=(2*i+1);k++)
			{
				
				if(k%2!=0)
				{
					System.out.print(a[l]);
					l++;
				}
				else System.out.print(" ");
			}
			System.out.println("");
		}
	}
}
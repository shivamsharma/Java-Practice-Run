class Assign1_6
{	public static void main(String s[])
 	{	int num,i,j,k,m,len=0;
		int a[]=new int[4];
		i=0;k=0;m=0;	
		j=num=100;
		while(i<5)
		{	
			{j=num;
			if(i<4)
			{	for(k=0;k<3;k++)
				{	a[k]=j%10;
					j=j/10;
				}
				m=a[2]*a[2]*a[2]+a[1]*a[1]*a[1]+a[0]*a[0]*a[0];
			}
			else
			{	for(k=0;k<4;k++)
				{	a[k]=j%10;
					j=j/10;
				}
				m=a[3]*a[3]*a[3]*a[3]+a[2]*a[2]*a[2]*a[2]+a[1]*a[1]*a[1]*a[1]+a[0]*a[0]*a[0]*a[0];
			}
			}
			if(num==m)
			{	System.out.println((i+1)+"Armstrong no.= "+m);
				i++;
			}
			num++;
		}
	}
}
			
		
			
			
			
						

public class ComparePrime {
public static void main(String[] args)
{int input1 = 3,input2 = 11,input3 = 37;
	int[] prime=new int[input3-input2];
	int i,j;
	int output1 = 0,count=0,count1=0;

	for(j=input2;j<=input3;j++)
	{
	for(i=2;i<j;i++)
	{
		if(j%i==0)
		{
		break;
		}
		
	}

	if(i==j)
	{
		prime[count]=j;
		count++;
	}
	}
	
	for(i=0;i<count;i++)
	{int c=prime[i];
	
	while(c>0)
	{int temp=c%10;
	if(temp==input1)
	{
		count1++;
		
	}
	c=c/10;
	}
	}
	output1=count1;
	System.out.println(output1);
}
}

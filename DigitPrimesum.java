import java.util.ArrayList;
import java.util.Arrays;

class UserMainCode4
{
public int howManyPrimeNumsWillGet(int input1)
{  
	int[] prime=new int[input1/2];
int inp1=input1;
int k=0;
int i,j;
int output1 = 0;
boolean flag=false;
for(j=0;j<=input1;j++)
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
	prime[k]=j;
	if(prime[k]==input1)
	{
		output1 = 1;
		flag=true;
	}
	k++;
}
}

int sum=0,count=0;
if(flag==false)
{count=0;
for(i=0;i<input1/2;i++)
{
	for(j=0;j<input1/2;j++)
	{if(flag==false)
	{
		sum=sum+prime[j];
		count++;
		System.out.println("d "+sum);
		if(sum==input1)
		{
			output1 =count;
			flag=true;
			break;
		}
	}
	
	}
}
	
	
	
}
	return output1;
	
}
}
public class DigitPrimesum {
	public static void main(String[] args)
	{
		int d;
	
	UserMainCode4 abc=new UserMainCode4();
	d=abc.howManyPrimeNumsWillGet(28);
	System.out.println(d);
	
}
}
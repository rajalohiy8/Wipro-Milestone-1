import java.util.Arrays;

public class Milestone13 {
	static boolean flag=false;
	static int n=0,n1=0;
	static int[]  stable=new int[5];
	static int[] unstable=new int[5];
public static boolean checkStable(int num)
{String num1=new String(Integer.toString(num));
	int len=num1.length();
	int[] input=new int[len];
	int count=0,countp=0;
	int temp=num;
	int j=0;
	while(temp!=0)
	{input[j]=temp%10;
	temp=temp/10;	
	j++;
	}
	int ans=1;
	for(int k=0;k<len;k++)
	{
		count=0;	
	for( j=0;j<len;j++)
	{
		if(input[k]==input[j])
		{
			count++;
			
			continue;
			
		}
	}
	if(countp==0)
	{
		countp=count;
	}
	
	if(countp!=count)
	{
		ans=0;
		break;
	}
		
	}

	if(ans==0){
		unstable[n1]=num;
		n1++;
		flag=false;
		}
	else{
		stable[n]=num;
	n++;
flag=true;
	}	
	return flag;
}
	public static void main(String ars[])
	{
		System.out.println(" 1 "+checkStable(538583)+" 2 "+checkStable(5255)+" 3 "+checkStable(5896)+" 4 "+checkStable(3)+" 5 "+checkStable(99999));
		Arrays.sort(stable);
		Arrays.sort(unstable);
		System.out.println(stable[4]);
		if(n1!=5)
		{
		System.out.println(unstable[5-(n1)]);
		System.out.println("Password = "+(stable[4]+unstable[5-(n1)]));
		}
		else
		{
			System.out.println(unstable[0]);
			System.out.println("Password = "+(stable[4]+unstable[0]));
		}
		}
	}
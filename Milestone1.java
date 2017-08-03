import java.util.Arrays;

public class Milestone1 {
	static boolean flag=false;
	static int n=0;
	static int[]  stable=new int[5];
public static boolean checkStable(int num)
{String num1=new String(Integer.toString(num));
	int len=num1.length();
	int[] input=new int[len];
	
	int temp=num;
	int j=0;
	while(temp!=0)
	{input[j]=temp%10;
	temp=temp/10;	
	j++;
	}
	int arr[]=new int[10];
	for(int k=0;k<len;k++)
	arr[input[k]]++;
	int a=0;
	for(int i=0;i<10;i++)
		if(arr[i]!=0)
		{
			a=arr[i];
			break;
		}
	
	int ans=1;
	
	for(int i=0;i<10;i++)
		if(arr[i]!=a && arr[i]!=0)
			ans=0;
	
	if(ans==0){
	flag=false;}
	else{
		stable[n]=num;
		n++;
	flag=true;
	}
	
	return flag;
}

public static void main(String[] args)
{
	System.out.println(" 1 "+checkStable(34132)+" 2 "+checkStable(1001)+" 3 "+checkStable(456)+" 4 "+checkStable(121)+" 5 "+checkStable(34562));
	Arrays.sort(stable);
	System.out.println(stable[4]);
	if(n!=5)
	{
	System.out.println(stable[5-(n)]);
	System.out.println("Password = "+(stable[4]+stable[5-(n)]));
	}
	else
	{
		System.out.println(stable[0]);
		System.out.println("Password = "+(stable[4]+stable[0]));
	}
}
}

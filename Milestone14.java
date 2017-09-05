import java.util.Arrays;
import java.util.Scanner;

public class Milestone14 {
	static int[] stable=new int[5];
	static int[] unstable=new int[5];
	static int n1=0;
	static int n2=0;
		
	public static void checkstable(int num)
	{String num1=new String(Integer.toString(num));
	int len=num1.length();
	int[] inp1=new int[len];
	int count=0,countp=0;
	int i=0;
	int temp=num;
	while(num!=0)
	{
		inp1[i]=num%10;
		num=num/10;
		i++;
	}
	int ans=1;
	i=0;
	for(i=0;i<len;i++)
	{count=0;
		for(int j=0;j<len;j++)	
		{
		if(inp1[i]==inp1[j])
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
		
	if(ans==0)
	{
		unstable[n1]=temp;
		n1++;
	}else
	{
		stable[n2]=temp;
		n2++;
	}
		
		
	}


		public static int findPassword(int input1,int input2,int input3,int input4,int input5){
			int password=0;
			checkstable(input1);
			checkstable(input2);
			checkstable(input3);
			checkstable(input4);
			checkstable(input5);
			Arrays.sort(unstable);
			if(n1==5)
			{
			password=unstable[0]+unstable[4];	
			}else if(n1==0)
			{
			password=unstable[0]+unstable[0];		
			}
			else
			{
				password=unstable[5-n1]+stable[4];
			}
			return password;
			}
		
		public static void main(String[] args)
		{Scanner scan=new Scanner(System.in);
		System.out.println("Enter 5 number to check unstable and generate password");
		int[] array=new int[5];
		
		for(int l=0;l<5;l++)
		{
		array[l]=scan.nextInt();	
		}
			System.out.println("password = "+findPassword(array[0],array[1],array[2],array[3],array[4]));
		}
	}


import java.util.Arrays;

class UserMainCode5
{
	public int SumNumber(int num)
	{int i=0,sum1=0;int temp=num;
	String num1=new String(Integer.toString(num));
	int len=num1.length();
	int[] inp1=new int[len];
		 i=0;
			while(temp!=0)
			{
			  inp1[i]=temp%10;
			  temp=temp/10;
				i++;	
			}
			Arrays.sort(inp1);
			for(i=0;i<3;i++)
			{
			sum1=sum1*10+inp1[i];
			}
		return sum1;
	}

	public int findSumeetSum(int input1,int input2,int input3){
		int output1=0;
		output1=SumNumber(input1)+SumNumber(input2)+SumNumber(input3);
		return output1;
	}
}
public class SmallestInt3SumSmall {
	public static void main(String[] args)
	{int a;
		UserMainCode5 abc=new UserMainCode5();
		a=abc.findSumeetSum(26674,105,37943);
		System.out.println(a);
	}
}

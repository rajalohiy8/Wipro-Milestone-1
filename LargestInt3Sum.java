import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int findSumeetSum(int input1,int input2,int input3){
		// Read only region end
		// Write code here...
		int temp1=input1,temp2=input2,temp3=input3;
		int count1=0,count2=0,count3=0,i,sum1=0,sum2=0,sum3=0,output1,j=0;;
		while(input1!=0)
		{
			input1=input1/10;
			count1++;
		}
		
		while(input2!=0)
		{
			input2=input2/10;
			count2++;
		}
		
		while(input3!=0)
		{
			input3=input3/10;
			count3++;
		}
	
		int[] inp1=new int[count1];
		int[] inp2=new int[count2];
		int[] inp3=new int[count3];
		i=count1-1;
		while(temp1!=0)
		{
		  inp1[i]=temp1%10;
		  temp1=temp1/10;
			i--;
			
		}
		i=count2-1;
		while(temp2!=0)
		{
		 inp2[i]=temp2%10;
		 temp2=temp2/10;
		 i--;
		}
		i=count3-1;
		while(temp3!=0)
		{
		  inp3[i]=temp3%10;
		  temp3=temp3/10;
			i--;
		}
		Arrays.sort(inp1);
		Arrays.sort(inp2);
		Arrays.sort(inp3);
		j=0;
		for(i=count1-1;i>0;i--)
		{if(j<3)
		{
		sum1=sum1*10+inp1[i];
		
		}
	
		j++;
		}
		String s1=Integer.toString(sum1);
		int l1=s1.length();
		if(l1==2)
		{
		s1=s1.concat("0");
		
		}
		if(l1==1)
		{
		s1=s1.concat("00");
		
		}
		sum1=Integer.parseInt(s1);
		j=0;
		for(i=count2-1;i>0;i--)
		{if(j<3)
		{
		sum2=sum2*10+inp2[i];
		
		}
		j++;
		}
	
	String s=Integer.toString(sum2);
	int l=s.length();
	if(l==2)
	{
	s=s.concat("0");
	
	}
	if(l==1)
	{
	s=s.concat("00");
	
	}
	sum2=Integer.parseInt(s);

		j=0;
		for(i=count3-1;i>0;i--)
		{if(j<3)
		{
		sum3=sum3*10+inp3[i];
		}
		j++;
		}
		String s3=Integer.toString(sum3);
		int l3=s3.length();
		if(l3==2)
		{
		s3=s3.concat("0");
		
		}
		if(l3==1)
		{
		s3=s3.concat("00");
		
		}
		sum3=Integer.parseInt(s3);
		output1=sum1+sum2+sum3;
		return output1;
	}
}
public class LargestInt3Sum
{
	public static void main(String[] args)
	{int a;
		UserMainCode abc=new UserMainCode();
		a=abc.findSumeetSum(26674,105,37943);
		System.out.println(a);
	}
}
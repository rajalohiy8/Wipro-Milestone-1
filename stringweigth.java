import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int findStringWeight(int[] input1,String input2){
		// Read only region end
		// Write code here...
	
 int sum=0;
		int mul=1;
		String[] splitArr = input2.split(" ");
		for (int i=0;i<splitArr.length;i++)
		{
			char[] charArr = splitArr[i].toUpperCase().toCharArray();
			for(int j=0;j<charArr.length;j++)
			{
				if(j==0)
				{
					if(input1[(int)charArr[j]-65]<0)
					{
						sum=sum+input1[(int)charArr[j]-65]+((int)charArr[j]-65+1);
					}
					else
				{
					sum=sum+input1[(int)charArr[j]-65];
					
				}
				}
				else if(j==(charArr.length-1))
				{
					if(input1[(int)charArr[j]-65]<0)
					{
						sum=sum+input1[(int)charArr[j]-65]+((int)charArr[j]-65+1);
					}
					else
				{
					sum=sum+input1[(int)charArr[j]-65];
					
				}
				}
				else
				{
					sum=sum+input1[(int)charArr[j]-65];
					
				}
				
			}
			mul=mul*sum;
			sum=0;
		}
			return mul;
	   
	}
}
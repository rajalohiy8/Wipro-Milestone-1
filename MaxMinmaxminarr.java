import java.util.*;
public class MaxMinmaxminarr {
	public static void main(String[] args)
	{  int i;
    boolean flag = true;
	
Scanner scan =new Scanner(System.in);
System.out.println("How many number do you want to enter");
int num=scan.nextInt();
int[] number=new int[num];
if(num==0)
{System.out.println("\n please try again and enter a valid number\n");
	return;
}
	System.out.println("Enter the numbers to arrange them in Ascending or sorted order");
	for(i=0;i<num;i++)
	{
		 number[i]=scan.nextInt();
		 
	}
	int[] temp=new int[num];  
    int small=0, large=num-1;
	Arrays.sort(number);

    for ( i=0; i<num; i++)
    {
        if (flag)
            temp[i] = number[large--];
        else
            temp[i] = number[small++];
 
        flag = !flag;
    }
 
   //for copy
    for (i=0; i<num; i++)
        number[i] = temp[i];

	//for output
	for(i=0;i<num;i++)
	{
		System.out.println(number[i]);
	}
}
}
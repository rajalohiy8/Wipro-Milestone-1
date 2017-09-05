package newpackage;
import java.util.*;
public class StableUnstable {
//divaibhav@gmail.com
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 5 numbers");
		Scanner kb=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=kb.nextInt();
		}
		ArrayList <Integer>ar=new ArrayList<>();
		for(int i=0;i<5;i++)
		{
			if(isStable(arr[i]))
			{
				ar.add(arr[i]);
			}
		}
		if(ar.size()>0)
		{
		int max=ar.get(0),min=ar.get(0);
		for(int i=1;i<ar.size();i++)
		{
			if(max<ar.get(i))
				max=ar.get(i);
			else if(min>ar.get(i))
				min=ar.get(i);
		}
		System.out.println(max+min);
		}
		else
			System.out.println(0);
	}
	public static boolean isStable(int n)
	{
		String s=n+"";
		ArrayList <String>arr=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
			if(!(arr.contains(s.charAt(i))))
			{
				arr.add(s.charAt(i)+"");
			}
		}
		int []ar1=new int[arr.size()];
		for(int i=0;i<arr.size();i++)
		{
			ar1[i]=0;
		}
		for(int i=0;i<arr.size();i++)
		{
			for(int j=0;j<s.length();j++)
			{
				if(arr.get(i).equals(s.charAt(j)+""))
				{
					ar1[i]++;
				}
			}
		}
		for(int i=0;i<arr.size()-1;i++)
		{
			if(!(ar1[i]==ar1[i+1]))
			{
				return false;
			}
		}
		return true;
	}
}

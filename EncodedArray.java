class UserMainCode3 {

	public void ResultfindOriginalFirstAndSum(int[] input1,int input2) {
		// Read only region end
		// Write code here...
		 int i,j=input2-1,output1=0,output2=0;
			int[] org=new int[input2];
			org[input2-1]=input1[input2-1];
			for(i=input2-2;i>-1;i--)
			{
			org[i]=input1[i]-(-(-org[j]));
				j--;
			}
			output1=org[0];
			for(i=0;i<input2;i++)
			{
				output2=output2+org[i];
				
			}
	System.out.println("Output1 = "+output1+" Output2 = "+output2);
    }
}
public class EncodedArray {

	public static void main(String[] args) {
		UserMainCode3 abc = new UserMainCode3();
		int[] input1={7,6,8,16,12,3};
		int input2=6;
		abc.ResultfindOriginalFirstAndSum(input1, input2);
	}
	}
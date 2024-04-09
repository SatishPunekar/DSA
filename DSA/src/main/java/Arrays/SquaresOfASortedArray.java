package Arrays;

import java.util.Arrays;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-7,-3,2,3,11};
			System.out.println(Arrays.asList(squareInSorted(arr)));

	}
	public static int[] squareInSorted(int []nums) {
		
		int n=nums.length;
        int[] ans=new int[n];
        int i=0;
        int j=n-1;
        nums[i]=nums[i]*nums[i];
        nums[j]=nums[j]*nums[j];
        for(int k=n-1;k>=0;k--){
            if(nums[i]>nums[j]&& i<j-1){
                ans[k]=nums[i];
                i++;
                nums[i]=nums[i]*nums[i];
            }
            else if(nums[i]<nums[j]&& i<j-1) {
            	ans[k]=nums[j];
                j--;
                nums[j]=nums[j]*nums[j];
            }
            else if(nums[i]>nums[j]){
            	ans[k]=nums[i];
            	k--;
            	ans[k]=nums[j];
            }
            else {
            	ans[k]=nums[j];
            	k--;
            	ans[k]=nums[i];
            }

        }
        return ans;
		
	}
}

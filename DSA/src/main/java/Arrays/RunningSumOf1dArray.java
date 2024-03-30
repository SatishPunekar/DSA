package Arrays;

import java.util.Scanner;

public class RunningSumOf1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(runningSum(arr)[i]);
		}

	}
	public static int[] runningSum(int[] nums) {
//		Approach 1,
//		int[] ans=new int[nums.length];
//		int sum=0;
//		for(int i=0;i<nums.length;i++) {
//			sum=sum+nums[i];
//			ans[i]=sum;
//		}
//		Approach 2: without creating sum var
//		int[] ans=new int[nums.length];
//		ans[0]=nums[0];
//		for(int i=1;i<nums.length;i++) {
//			ans[i]=ans[i-1]+nums[i];
//		}
//		return ans;
//		Approach 3: dont create new array also.
		
		for(int i=1;i<nums.length;i++) {
			nums[i]=nums[i-1]+nums[i];
			
		}
		

        return nums;
    }

}
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
// 
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
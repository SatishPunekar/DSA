package Arrays;

import java.util.Scanner;

public class CountOfSubArrayWhereMaxEleAppearAtleastKTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,3,2,3,3};
		int arr2[]= {1,3,2,3,3,0,3};
		int k=sc.nextInt();
		System.out.println(countSubarrays(arr, k));
		

	}
	public static long countSubarrays(int[] nums, int k) {
		int max=maxOfArray(nums);
		if(countMax(nums, max)<k) {
			return 0;
		}
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			int count=0;
			for(int j=i;j<nums.length;j++) {
				if(nums[j]==max) {
					count++;
				}
				if(count==k) {
					sum=sum+nums.length-j;
					break;
				}
			}
		}
		return sum;
		
        
    }
	public static int maxOfArray(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int countMax(int arr[], int ele) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==ele) {
				count++;
			}
		}
		return count;
	}

}

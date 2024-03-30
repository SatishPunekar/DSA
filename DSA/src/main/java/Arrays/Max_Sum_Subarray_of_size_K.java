package Arrays;

import java.util.Scanner;

public class Max_Sum_Subarray_of_size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter sub array size:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(maxSum(arr, k));

	}
	public static int maxSum(int[] arr,int k) {
		int sum=0;
		int i=0;
		int j=0;
		while(j-i+1<=k) {
			sum=sum+arr[j];
			j++;
		}
		int temp=0;
		while(j<arr.length) {
			
			temp=sum-arr[i]+arr[j];
			if(temp>sum) {
				sum=temp;
			}
			i++;
			j++;
		}
		return sum;
	}

}

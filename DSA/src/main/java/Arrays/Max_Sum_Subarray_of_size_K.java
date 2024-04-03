package Arrays;

import java.util.Scanner;

public class Max_Sum_Subarray_of_size_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter sub array size:");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]= {400,200,300,100};
		System.out.println(maxSum(arr, k));

	}
	public static int maxSum(int[] arr,int k) {
		if(arr.length==0 || k<=0 ||k>arr.length) {
			return 0;
		}
		int sum=0;
		int i=0;
		int j=0;
		for(i=0;i<k;i++) {
			sum=sum+arr[i];
		}
<<<<<<< HEAD
		int temp=0;
		while(j<arr.length) {
			
			temp=sum-arr[i]+arr[j];
			sum=Math.max(temp, sum);
=======
		int max=sum;
		int start=0;
		while(i<arr.length) {
			max=max+arr[i]-arr[start];
			if(max>sum) {
				sum=max;
			}
			start++;
>>>>>>> 7b785e8e2d9146004862da4429bd8e0446b97643
			i++;
			
		}
		return sum;
	}

}

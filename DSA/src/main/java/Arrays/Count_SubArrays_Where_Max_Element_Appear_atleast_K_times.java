package Arrays;

import java.util.Scanner;

public class Count_SubArrays_Where_Max_Element_Appear_atleast_K_times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the k size");
		Scanner sc=new Scanner(System.in);
		int[] arr= {1,3,2,3,3};
		int k=sc.nextInt();
		System.out.println(countSubArray(arr, k));

	}
	public static int countSubArray(int[] arr,int k) {
		int n=arr.length;
		int max=0;
		int freq=0;
		int sub_count=0;
		for(int i=0;i<n;i++) {
			max=Math.max(max, arr[i]);
		}
		int i=0;
		int j=0;
		while(j<n) {
			if(arr[j]==max) {
				freq++;
			}
			while(freq==k) {
				sub_count=sub_count+n-j;
				if(arr[i]==max) {
					freq--;
				}
				i++;
			}
			
				j++;
			
		}
		return sub_count;
	}
	

}

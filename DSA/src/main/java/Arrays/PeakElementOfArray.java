package Arrays;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PeakElementOfArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		System.out.println(Arrays.toString(cumulateSum(arr)));
		peakElement(arr);
		
	}
	public static void peakElement(int[] arr) {
//		first approach
//		Arrays.sort(arr);
//		System.out.println("the peak element is :" + arr[arr.length-1]);
		
//		Second Approach
		int peak=0;
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i-1]<arr[i] && arr[i+1]<arr[i]) {
				peak=arr[i];
			}
		}
		if(peak==0) {
			peak=arr[arr.length-1];
		}
		System.out.println("Peak is:"+ peak);
		
		
	}

}

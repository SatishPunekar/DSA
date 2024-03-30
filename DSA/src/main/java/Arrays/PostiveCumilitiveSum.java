package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PostiveCumilitiveSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(cumulateSum(arr)));
	

	}
	public static int[] cumulateSum(int[] arr) {
		int[] b=new int[arr.length];
		
		for(int i=0;i<=arr.length-1;i++) {
			int sum=0;
			for(int j=0;j<=i;j++) {
				 sum=sum+arr[j];
			}
			b[i]=sum;
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<b.length;i++) {
			if(b[i]>0) {
				list.add(b[i]);
			}
		}
		int[] ret = new int[list.size()];
		for(int i = 0; i < ret.length; i++)
		    ret[i] = list.get(i);
		  return ret;
	}

}
// cumulative sum--
//sample
//Initial Array: [1, -2, 3, 4, -6]
//Cumulative Sum: [1, -1, 2, 6, 0]
//Positive Cumulative Sum: [1, 2, 6]

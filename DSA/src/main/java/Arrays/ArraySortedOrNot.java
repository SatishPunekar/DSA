package Arrays;

import java.util.Scanner;

public class ArraySortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println(sortedOrNot(arr, n));

	}
	public static boolean sortedOrNot( int[] arr,int n) {
		boolean flag=true;
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				flag=false;
			}
		}
		return flag;
		
	}

}

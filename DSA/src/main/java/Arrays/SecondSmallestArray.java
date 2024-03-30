package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int smallest=arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			
		}
		
			int Sec_min_value=arr[0];
		
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]==smallest){
				continue;
			}
			if(Sec_min_value>arr[i]) {
				Sec_min_value=arr[i];
			}
			
		}
		
		System.out.println("smallest number is"+ smallest);
		System.out.println("smallest number is"+ Sec_min_value);

	}

}

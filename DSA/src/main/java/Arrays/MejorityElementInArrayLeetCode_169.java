package Arrays;

import java.util.Scanner;

public class MejorityElementInArrayLeetCode_169 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int[] arr=new int[sc.nextInt()];
		System.out.println("enter elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt(); //nums = [2,2,1,1,1,2,2]
		}
		sc.close();
		
		//Brute force approach
		int count=1;
		for(int i=0;i<arr.length;i++) {
			count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count>arr.length/2) {
				System.out.println(arr[i]);
				break;
			}
		}
		if(count<arr.length/2) {
			System.out.println("Element not found");
		}
		
	}

}

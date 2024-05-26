package Arrays;

import java.util.Scanner;

public class SumOfSmallAndLargestElementIntheArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int[] arr=new int[sc.nextInt()];

		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++) {
			System.out.println("the element at index:"+ i);
			arr[i]=sc.nextInt();
		}
		int smallest=arr[0];
		int largest=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(smallest>arr[i]) {
				smallest=arr[i];
			}
			if(largest<arr[i]) {
				largest=arr[i];

			}
		}

		int	sum=smallest+largest;
		int[] arr1=new int[3];
		if(sum<smallest) {
			arr1[0]=sum;
			arr1[1]=smallest;
			arr1[2]=largest;
		}
		else if(sum>largest) {
			arr1[0]=smallest;
			arr1[1]=largest;
			arr1[2]=sum;
		}
		else {
			arr1[0]=smallest;
			arr1[1]=sum;
			arr1[2]=largest;
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}

	}

}

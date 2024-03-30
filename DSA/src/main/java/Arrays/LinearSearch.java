package Arrays;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search:");
		int searchEle=sc.nextInt();
		boolean flag=false;;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==searchEle) {
				System.out.println("the element found at the index "+ i);
				flag=true;
			}
		}
		if(flag==false) {
			System.out.println("element not found");
		}
		
	}

}

package Arrays;

import java.util.Scanner;

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int sum = 0;
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[0]=sc.nextInt();
		}
		System.out.println(arr.length);
		for (int num: arr) {
			System.out.println(num);
		      sum = sum + num;
		    }
		System.out.println("the sum is: "+ sum);
		
//		Scanner s = new Scanner(System.in);
//
//	    int n, sum = 0;
//
//	    // enter number of elements you want.
//	    System.out.print("Enter the elements you want : ");
//
//	    // read entered element and store it in "n".
//	    n = s.nextInt();
//	    int a[] = new int[n];
//
//	    // enter elements in array.
//	    System.out.println("Enter the elements:");
//
//	    // traverse the array elements one-by-one.
//	    for (int i = 0; i < n; i++) {
//	      a[i] = s.nextInt();
//	    }
//	    for (int num: a) {
//	      sum = sum + num;
//	    }
//	    // print the sum of all array elements.
//	    System.out.println("Sum of array elements is :" + sum);
		
	}

}

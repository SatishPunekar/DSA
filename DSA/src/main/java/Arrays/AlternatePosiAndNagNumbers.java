	package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlternatePosiAndNagNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int arr[]=new int[N];
		System.out.println("enter the array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(reArrange(arr, N)));
	}
	public static int[] reArrange(int arr[], int n) {
		ArrayList<Integer> pos=new ArrayList<Integer>();
		ArrayList<Integer> nag=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=0) {
				pos.add(arr[i]);
			}
			else {
				nag.add(arr[i]);
			}
		}
		int j=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				arr[i]=pos.get(j);
				j++;
			}
			else {
				arr[i]=nag.get(k);
				k++;
			}
		}
		return arr;
	}
}
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
//Input: 
//N = 9
//Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
//Output:
//9 -2 4 -1 5 -5 0 -3 2
	package Arrays;

import java.util.ArrayList;
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
		rearrange(arr, N);

	}
	static void rearrange(int arr[], int n) {
        // code here
		ArrayList<Integer> pos=new ArrayList<Integer>();
		ArrayList<Integer> nag=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				nag.add(arr[i]);
			}
			else {//9 -2 4 -1 5 -5 0 -3 2
				pos.add(arr[i]);
			}
		}
		for(int i=0;i<nag.size()||i<pos.size();i++) {
			if(i<pos.size()) {
				System.out.print(pos.get(i)+" ");
			}
			if(i<nag.size()) {
				System.out.print(nag.get(i)+" ");
			}
		}
		
    }

}
//Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
//Note: Array should start with a positive number and 0 (zero) should be considered a positive element.
//Input: 
//N = 9
//Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
//Output:
//9 -2 4 -1 5 -5 0 -3 2
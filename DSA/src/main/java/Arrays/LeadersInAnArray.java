package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("print size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array values:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Leader elements are:");
		System.out.println(LeadersInAnArray.leaders(arr, n));
		

	}
	static ArrayList<Integer> leaders(int arr[],int n){
		ArrayList<Integer> ar=new ArrayList<Integer>();
		
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>=arr[j]) {
					flag=true;
				}
				else {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				ar.add(arr[i]);
			}
		}
		return ar;
		
	}

}
//Print the leaders If an element of array is a leader if it is geater than or equal to all the elements to its right side
//and last element is always greatest.
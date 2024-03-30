package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PlusOneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
	}
	static void plusOne(int[] arr) {
		
		for(int n=arr.length-1;n>=0;n--) {
			if(arr[n]==9 && n==0) {
				ArrayList<Integer> list=new ArrayList<Integer>(2);
				
			}
			else if(arr[n]==9) {
				arr[n]=0;
				arr[n-1]=arr[n-1]+1;
			}
			
		}
		
	}

}

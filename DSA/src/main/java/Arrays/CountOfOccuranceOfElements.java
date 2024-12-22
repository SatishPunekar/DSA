package Arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfOccuranceOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("**********************");
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		countOccurance(arr);

	}
	public static void countOccurance(int[] arr) {
		int N=arr.length;
		int[] newArr=new int[N+1];
		int max=0;
		for(int i=0;i<N;i++) {
			max=arr[i];
			newArr[max]=newArr[max]+1;
		}
		max=0;
		for(int i=0;i<newArr.length;i++) {
			if(newArr[i]>max) {
				max=newArr[i];
			}
		}
		System.out.println(max);
	}

}

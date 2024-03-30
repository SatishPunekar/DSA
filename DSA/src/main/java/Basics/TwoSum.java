package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter target:");
		int target=sc.nextInt();
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(solution(target,arr)[0]);
		System.out.print(solution(target,arr)[1]);
	}
	public static int[] solution(int target,int[] arr) {
		int array[]=new int[2];
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i]+arr[j]==target) {
					array[0]=i;
					array[1]=j;
					return array;
					
				}
			}
			
		}
		return array;
	}
}

package Basics;

import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(maxCount(arr));

	}
	public static int maxCount(int nums[]) {
		int Max_count=0;
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==1) {
				count++;
				if(i==nums.length-1) {
					Max_count=Math.max(Max_count, count);
				}
			}
			else if(count>Max_count) {
				Max_count=count;
				count=0;
			}
			else {
				count=0;
			}
		}
		return Max_count;
	}

}

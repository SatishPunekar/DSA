package Seraching;

import java.util.Scanner;

public class BinarySearchImplementation {
	public static void main(String[] args) {
		int[] arr= {-1,0,5};
		Scanner sc=new Scanner(System.in);
		int k=0;
		System.out.println(search(arr,k));;	
	}
	public static int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target==nums[mid]){
                return mid;
            }
            else{
                start=mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }

}

package matrixArray;

import java.util.Scanner;

public class CountSortedRows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[][] arr= {{1,2,3},{6,6,6},{7,7,9}};
//		System.out.println(isRowSorted(arr));
		System.out.println(returnCount(arr));
		

	}
	public static boolean isRowSorted(int[] arr) {
		if(arr[0]>arr[1]) {
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]<arr[i+1]) {
					return false;
				}
			}
		}
		else {
			for(int i=1;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					return false;
				}
			}
		}
		return true;
	}
	public static int returnCount(int[][] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(isRowSorted(arr[i])==true) {
				count++;
			}
			
		}
		return count++;
		
	}

}

package matrixArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RowWithMaxOnes {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int nsize=sc.nextInt();
		int mSize=sc.nextInt();
		int arr[][]=new int[nsize][mSize];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println(rowWithMax1s(arr, nsize, mSize));
		
	}
	public static int rowWithMax1s(int arr[][], int n, int m) {
		int max=-1;
		for(int j=0;j<m;j++) {
			for(int i=0;i<n;i++) {
				if(arr[i][j]==1) {
					max=i;
					break;
				}
				
			}
			if(max>-1) {
				break;
			}
			
		}
		return max;
	}

}

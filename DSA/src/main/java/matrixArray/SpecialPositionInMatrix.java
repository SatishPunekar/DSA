package matrixArray;

import java.util.Scanner;

public class SpecialPositionInMatrix {
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
		System.out.println(specialPosition(arr));
	}
	public static int specialPosition(int[][] mat) {
		int count=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				int flag=0;
				if(mat[i][j]==1) {
					for(int k=0;k<mat[i].length;k++) {
						if(mat[i][k]==1) {
							flag=1;
							break;
						}
					}
					for(int k=0;k<mat[i].length;k++) {
						if(mat[k][j]==1) {
							flag=1;
							break;
						}
					}
					if(flag==0) {
						count++;
					}


				}
			}
		}
		return count;
	}
}


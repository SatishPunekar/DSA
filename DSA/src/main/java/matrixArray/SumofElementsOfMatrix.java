package matrixArray;

import java.util.Scanner;

public class SumofElementsOfMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(sumOfEleMatrix(arr));
		

	}
	public static int sumOfEleMatrix(int[][] matrix) {
		int sum=0;
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				sum=sum+matrix[i][j];
			}
		}
		return sum;
	}

}

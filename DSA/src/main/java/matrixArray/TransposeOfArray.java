package matrixArray;

import java.util.Scanner;

public class TransposeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int matrix[][]=new int[N][M];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println(transpose(matrix).toString());
	}
	public static int[][] transpose(int[][] matrix) {
		int N=matrix.length;
		int M=matrix[0].length;
		int arr[][]=new int[M][N];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				arr[j][i]=matrix[i][j];
			}
			System.out.println();
		}
		return arr;

	}

}

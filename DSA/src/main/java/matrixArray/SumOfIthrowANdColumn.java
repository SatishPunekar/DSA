package matrixArray;

import java.util.Scanner;

public class SumOfIthrowANdColumn {

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
		System.out.println(sumOfRowCol(nsize, mSize, arr));

	}
	public static int sumOfRowCol(int N, int M, int A[][]) {
		int result=0;
		int sum1=0;
		int sum2=0;
		if(N==1) {
			result=1;
		}
		else if(M==1) {
			result=0;
		}
		else {
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					sum1=sum1+A[i][j];
					sum2=sum2+A[j][i];
					
				}
				if(sum1==sum2) {
					result=1;
					break;
				}
				if(i>M) {
					break;
				}
				
		}
		
	}
		return result;
	}
}


//Given a matrix A of dimensions NxM. Check whether the sum of the ith row is equal to the sum of the ith column.
//Note: Check only up to valid row and column numbers i.e if the dimensions are 3x5, check only for the first 3 rows and columns, i.e. min(N, M).
package matrixArray;

public class MatrixDiagonalSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{6,6,6,4},{7,7,9,4},{1,2,3,4}};
		System.out.println(diagonalSum(arr));

	}
	public static int diagonalSum(int[][] mat) {
		int sum=0;
		for(int i=0; i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				if(i==j) {
					sum=sum+mat[i][j]+mat[i][mat.length-1-i];
				}
			}
		}
		if(mat.length%2!=0) {
			sum=sum-mat[mat.length/2][mat.length/2];
		}
		return sum;

	}

}

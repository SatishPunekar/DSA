package matrixArray;

import java.util.ArrayList;

public class MatrixInSnakePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,2,3,4},{6,6,6,4},{7,7,9,4},{1,2,3,4}};
		System.out.println(snakePattern(arr));

	}
	static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int i=0;i<matrix.length;i++){
            if(i%2==0){
                for(int j=0;j<matrix[i].length;j++){
                    list.add(matrix[i][j]);
                }
            }
            else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    list.add(matrix[i][j]);
                }
            }
        }
        return list;
    }
	

}
//Given a matrix of size N x N. Print the elements of the matrix in the snake like pattern depicted below.
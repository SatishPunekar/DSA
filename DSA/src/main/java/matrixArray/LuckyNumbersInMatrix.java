package matrixArray;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{3,7,8},{9,11,13},{15,16,17}};
		System.out.println(luckyNumbers(arr));

	}
	public static List<Integer> luckyNumbers(int[][] matrix) {
		ArrayList<Integer> minList= new ArrayList<Integer>();
		ArrayList<Integer> maxList= new ArrayList<Integer>();
		for(int i=0;i<matrix.length;i++) {
			minList.add(min(matrix[i]));
		}
		int maximum=0;
		for(int col=0;col<matrix[0].length;col++) {
			for(int row=0;row<matrix.length;row++) {
				if(matrix[row][col]>maximum) {
					maximum=matrix[row][col];
				}
			}
			maxList.add(maximum);
		}
		ArrayList<Integer> finList=new ArrayList<Integer>();
		for(int i=0;i<minList.size();i++) {
			for(int j=0;j<maxList.size();j++) {
				if(minList.get(i)==maxList.get(i)) {
					finList.add(minList.get(i));
				}
			}
		}
		
		return finList;

	}
	public static int min(int[] arr) {
		int minimum=0;
		for(int i=0;i<arr.length;i++) {
			if(minimum>arr[i]) {
				minimum=arr[i];
			}
		}
		return minimum;
	}
}
//lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.
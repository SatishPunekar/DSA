package Arrays;

import java.util.Arrays;
import java.util.Collections;

public class HighestSumOfProductofTwoNumberinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]=new Integer[5];
		arr[0]=2;
		arr[1]=3;
		arr[2]=6;
		arr[3]=5;
		arr[4]=8;
		
		
		 Arrays.sort(arr, Collections.reverseOrder());
//		 for(int i=0;i<arr.length;i++) {
//				System.out.println(arr[i]);
//			}
		 int i=0;
		int sum= (arr[i]*arr[i+1])+(arr[i+2]*arr[i+3])+arr[i+4];
		System.out.println(sum);
		
		
	}
	

}
//Input = [2,3,6,5,8] Output = (8*6)+(5*3)+2 = 65
//Input = [1,1,2,3,2,3,6,5,8] Output = (8*6)+(5*3)+(3*2)+2+1+1 = 73
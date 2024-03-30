package Arrays;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String[] args) {
		int[] arr= {13,7,9,5,15,24,56,32};
		System.out.println("arrays Before Sorting:"+Arrays.toString(arr));
//		Arrays.sort(arr, 1, 7);
		Arrays.sort(arr);
		
		System.out.println("arrays After Sorting:"+Arrays.toString(arr));
		
				
		}
	}



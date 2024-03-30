package Arrays;

import java.util.Scanner;

public class commonElementsinThreeArrays {
	public static void main(String[] args) {
		int[] arr1= {4,12,23,45,8};
		int[] arr2= {2,34,67,89,8,4};
		int[] arr3= {1,2,3,4,5,6,7,8,9};

		System.out.println("the common elements are:");
		for(int a:arr1) {
			for(int b:arr2) {
				for(int c:arr3) {
					if(a==b&&b==c) {
						System.out.println(a);
					}

				}
			}
		}
	}

}

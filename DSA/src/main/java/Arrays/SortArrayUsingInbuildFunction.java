package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayUsingInbuildFunction {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		char[] arr=str.toCharArray();
		System.out.println("before sorting the string is:"+ Arrays.toString(arr));
		
		Arrays.sort(arr);
		System.out.println("after sorting the string is: "+ Arrays.toString(arr) );
	}

}

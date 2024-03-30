package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		printNewArrayAsEvenOdd(arr);

	}
	public static void printNewArrayAsEvenOdd(int[] arrr) {

		List<Integer> Evenlist=new ArrayList<Integer>();
		List<Integer> Oddlist=new ArrayList<Integer>();
		for(int i=0;i<arrr.length;i++) {
			if(i%2==0) {
				Evenlist.add(arrr[i]);
			}
			else {
				Oddlist.add(arrr[i]);			}
		}
		System.out.println(Evenlist);
		System.out.println(Oddlist);

	}

}

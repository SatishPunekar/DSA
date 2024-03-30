package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintEvenNumberDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(getEvenDigitNumbers(arr));
		
	}
	public static List<Integer> getEvenDigitNumbers (int[] arr) {
		List<Integer> list=new ArrayList<Integer>();
		int count;
		for(int i=0;i<=arr.length-1;i++){
			int ele=arr[i];
			count=0;
			while(ele>0){
				ele=ele/10;
				count++;
			}
			if(count%2==0){
				list.add(arr[i]);
			}
		}
		
		return list;
	}

}

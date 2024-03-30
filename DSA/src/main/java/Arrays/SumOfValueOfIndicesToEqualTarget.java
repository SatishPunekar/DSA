package Arrays;

import java.util.Scanner;

public class SumOfValueOfIndicesToEqualTarget {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt(); 
		}
		System.out.println("Enter target:");
		int target=sc.nextInt();
		String Message="not found";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					Message="index1="+ i+ "   index2=" +j;
					break;
				}
				
			}
		}
		System.out.println(Message);
	}

}

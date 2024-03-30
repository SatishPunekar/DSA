package Arrays;

import java.util.Scanner;

public class IdenticleTwins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(identicleTwins(arr));
		

	}
	public static int identicleTwins(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=arr.length-1;j>i;j--) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		return count;
		
	}

}
//Sample Input
//5 --1 2 3 2 1
//6 -- 1 2 2 3 2 1
//4 -- 1 1 1 1
//Expected Output
//2
//4
//6

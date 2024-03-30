package Arrays;

import java.util.Scanner;

public class MaximumArrayOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] arr=new int[N];
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
		}
		int count=0;
		ops(arr,count);

	}
	public  static void ops(int[] arr,int count) {
		boolean flag=true;
		boolean shouldPrint = false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				flag=false;
			}
		}
		if(flag==true) {
			count++;
			for(int i=0;i<arr.length;i++) {
				arr[i]=arr[i]/2;
				}
			ops(arr,count);
		}
		else {System.out.println(count);};
	}

}

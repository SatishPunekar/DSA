package Numbers;

import java.util.Scanner;

public class SumOfDigitsLessThanK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int[] A=new int[N];
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		System.out.println(sum(A, K));
		

	}
	static int sum(int []arr, int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int sum=0;
			while(num>0) {
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			if(sum<k) {
				count++;
			}
		}
		return count;
	}

}

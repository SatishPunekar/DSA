package Numbers;

import java.util.Scanner;

public class SmallestPositiveWholeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(smallestWholeNumber(n, k));

	}
	public static int smallestWholeNumber(int n,int k) {
		if(n<k) {
			return n;
		}
		while(n>=k) {
			n=n-k;
		}
		return n;
	}

}

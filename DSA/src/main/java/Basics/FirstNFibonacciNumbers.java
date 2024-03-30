package Basics;

import java.util.Scanner;
import java.util.Vector;

public class FirstNFibonacciNumbers {
	
	static int n1=1;
	static int n2=1;

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=FirstNFibonacciNumbers.fibonacci(n);
		System.out.println(a);
	}
	
	public static long[]  fibonacci(int n) {
		
		//Method one
//		System.out.print(n1 +" "+n2);
//		for(int i=2;i<=n;i++) {
//		int n3=n1+n2;
//		System.out.print(" "+n3);
//		n1=n2;
//		n2=n3;
//		}
		
		//Method two
//		Vector<Integer> v = new Vector<Integer>(n);
//		v.add(1);
//		v.add(1);
//		for(int i=2;i<=n;i++) {
//			int a=v.get(i-1)+v.get(i-2);
//			v.add(a);
//		}
		
		//Method 3
		long a[]=new long[n];
		a[0]=1;
		if(n>1) {
		a[1]=1;
		}
		for(int i=2;i<=n-1;i++) {
			a[i]=a[i-1]+a[i-2];
		
		}
		
		
		return a;
		
	}

}

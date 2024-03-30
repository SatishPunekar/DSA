package Recursion;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fibonacci(num));
		

	}
	public static int fibonacci(int n) {
		if(n==0||n==1) {
			return n;
		}
		int a=fibonacci(n-1);
		int b=fibonacci(n-2);
		return a+b;
		
	}

}

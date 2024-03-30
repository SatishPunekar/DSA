package Recursion;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		printOneToN(num);

	}
	public static void printOneToN( int n) {
		if(n==0) {
			return;
		}
		
		printOneToN(n-1);//if you call this method first then you print, the reusut is 1 to N
		// and If you print the value first and call this method then the result is N to 1.
		System.out.println(n);
	}

}

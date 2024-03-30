package Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fibonacciSeries(num));
		
		
		
	}
	public static ArrayList<Integer> fibonacciSeries(int k) {
		int num1=0;
		int num2=1;
		int sum=1;
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(num1);
		list.add(num2);
		for(int i=3;i<=k;i++) {
			int num3=num1+num2;
			sum=sum+num3;
			list.add(num3);
			num1=num2;
			num2=num3;
		}
		list.add(sum);// last number of list will be the sum of fibonacci series.
		return list;
		
	}

}

package Recursion;

import java.util.Scanner;

public class FactoriaOfaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(factorial(num));

	}
	public static int factorial(int num) {
		if(num==0)
			return 1;
		int fact=factorial(num-1);
		return fact*num;
		
	}

}

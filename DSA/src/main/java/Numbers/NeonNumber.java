package Numbers;

import java.util.Scanner;

public class NeonNumber {
	public static SumOfDigits summ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isNeonNumber(num));

	}
	public static boolean isNeonNumber(int n) {
		int square=n*n;
		int sum=summ.sumDigits(square);
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

}

package Numbers;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(sumDigits(num));

	}
	public static int sumDigits(int num) {
		if(num==0) {
			return 0;
		}
		int rem=num%10;
		num=num/10;
		int sum=rem+sumDigits(num);
		return sum;
		
		
	}

}

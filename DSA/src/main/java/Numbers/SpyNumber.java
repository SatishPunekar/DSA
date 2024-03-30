package Numbers;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isSpyNum(num));

	}
	public static boolean isSpyNum(int num) {
		int sum=0;
		int product=1;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			product=product*rem;
		}
		if(sum==product) {
			return true;
		}
		else {
			return false;
		}
	}

}
//A positive integer is called a spy number if the sum and product of its digits are equal. 
//In other words, a number whose sum and product of all digits are equal is called a spy number.
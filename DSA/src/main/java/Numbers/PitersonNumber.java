package Numbers;

import java.util.Scanner;

public class PitersonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int m=n;
		while(n>0) {
			int rem=n%10;
			int fact=factorial_Of_Num(rem);
			sum=sum+fact;
			n=n/10;
		}
		if(sum==m) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}
	public static int factorial_Of_Num(int k) {
		int fact=1;
		while(k>1) {
			fact=fact*k;
			k--;
		}
		return fact;
		
	}

}
//A number is said to be Peterson if the sum of factorials of each digit is equal to the sum of the number itself.

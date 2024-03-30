package Numbers;

import java.util.Scanner;

public class Armstrong extends CountDigits  {

	public static CountDigits dgts;//CountDigits is class.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		System.out.println(isArmstrong(n));
		System.out.println(countNum(n));
		

	}
	public static String isArmstrong(int n) {
		int sum=0;
		int m=n;
		while(n>0) {
			int rem=n%10;
			int cube=rem*rem*rem;
			sum=sum+cube;
			n=n/10;
		}
		
		if(sum==m) {
			return "true";
		}
		else {
			return "false";
		}
		
	}

}

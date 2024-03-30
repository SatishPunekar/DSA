package Numbers;

import java.util.Scanner;

public class GCDofNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		gcd(a, b);
		

	}
	public static int gcd(int a,int b) {
		int gcd=0;
		if(a<=b) {
			return a;
		}
		else {
			int N=0;
			if(a<=b) {
				N=a;
			}
			else {
				N=b;
			}
			for(int i=N/2;i>=2;i--) {
				if(N%i==0) {
					gcd=N;
					break;
				}
			}
		}
		return gcd;
	}

}

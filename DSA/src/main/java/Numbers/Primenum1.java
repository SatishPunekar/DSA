package Numbers;

import java.util.Scanner;

public class Primenum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//3
		int factor=0;//0 1 2
		
		for(int i=1;i<=n;i++) {// 
			if(n%i==0) {//3%1==0(true) 3%2==0(false) 3%3==0(true)
				factor++;
			}
			
		}
		
		if(factor==2) {
			System.out.println("this is prime");
			System.out.println(factor);
		}
		else {
			System.out.println("this is not prime");
			System.out.println(factor);
		}

	}

}

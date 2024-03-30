package Numbers;

import java.util.Scanner;

public class AutoBiographical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isAutoBiographical(num));

	}
	public static boolean isAutoBiographical(int num) {
		int sum=0;
		int count=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
			count++;
			
		}
		if(sum==count) {
			return true;
		}
		else {
			return false;
		}
		
	}

}

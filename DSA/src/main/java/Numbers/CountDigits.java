package Numbers;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
//		System.out.println(countNum(num));
	}
	public static int countNum(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
		
	}

}

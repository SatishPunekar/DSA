package Numbers;

import java.util.Scanner;

public class CountNumberOfPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int inNum=sc.nextInt();
		int toNum=sc.nextInt();
		System.out.println( countNumberOfPrimeNumbers(inNum, toNum));

	}
	public static int countNumberOfPrimeNumbers(int initNum,int toNum) {
		int countNumber=0;
		for(int i=initNum;i<=toNum;i++) {
			int count = 0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				if(count==2) {
					countNumber++;
				}
			}

		}
		return countNumber;

	}

}

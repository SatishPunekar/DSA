package Numbers;

import java.util.Scanner;

public class SunnyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		num=num+1;
		double sqrt=Math.sqrt(num);
		if(sqrt-Math.floor(sqrt)==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}
	

}
//A number is called a sunny number if the number next to the given number is a perfect square. In other words, a number N will be a sunny number if N+1 is a perfect square.
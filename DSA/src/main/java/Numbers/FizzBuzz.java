package Numbers;

import java.util.Scanner;

public class FizzBuzz extends Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		fizzBuzz(N);
		System.out.println(isArmstrong(N));
		System.out.println(countNum(N));

	}
	
	public static void fizzBuzz(int N) {
		for(int i=1;i<=N;i++) {
		if(i%3==0 && i%5==00) {
			System.out.println("FizzBuzz");
		}
		else if(i%3==0) {
			System.out.println("Fizz");
		}
		else if(i%5==0) {
			System.out.println("Buzz");
		}
		else {
			if(i%4==0) { //dont print if the number dvisible by four
				continue; 
			}
			System.out.println(i);
		}
		}
	}

}
//The rules of the FizzBuzz game are very simple.
//
//Say Fizz if the number is divisible by 3.
//Say Buzz if the number is divisible by 5.
//Say FizzBuzz if the number is divisible by both 3 and 5.
//Return the number itself, if the number is not divisible by 3 and 5.
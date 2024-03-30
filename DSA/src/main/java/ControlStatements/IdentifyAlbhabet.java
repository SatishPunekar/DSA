package ControlStatements;

import java.util.Scanner;

public class IdentifyAlbhabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		int val=ch;
		if((val>=65)&&(val<=90)) {
			System.out.println("1"+val);
		}
		else if((val>=97)&&(val<=122)){
			System.out.println("-1"+val);
		}
		else {
			System.out.println("0"+val);
		}
	}

}
//write a program that takes a character from user and print 
//1 if charecter is Uppercase alpha
//-1 if char is lowercase alpgh
//0 , if char is not alphabet

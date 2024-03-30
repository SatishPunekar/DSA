package Strings;

import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String str1=sc.next();
		
		String[] str=str1.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}
	}

}

package Strings;

import java.util.Scanner;

public class ToLowerCase {
	static String toLower(String s) {
		s=s.toLowerCase();
		return s;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(toLower(str));
	}

}

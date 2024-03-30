package Strings;

import java.util.Scanner;

public class CompareToMethod {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the strings:");
		String str1=sc.next();
		String str2=sc.next();
//		System.out.println(str2.length()+" "+str1);
		System.out.println(compareOfString(str1, str2));
			
	}
	static int compareOfString(String str1,String str2) {
		return str1.compareTo(str2);
	}
	

}
//If the first string is less than the second one, print "-1". 
//If the second string is less than the first one, print "1". 
//If the strings are equal, print "0". Note that the letters' case is not 
//taken into consideration when the strings are compared.


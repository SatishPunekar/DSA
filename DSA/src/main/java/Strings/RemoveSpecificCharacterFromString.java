package Strings;

import java.util.Scanner;

public class RemoveSpecificCharacterFromString {
	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println("enter the character to be remove: ");
		String ch=sc.next();
		
		System.out.println("Before Replacing the char from  String:"+str);
		System.out.println("After Replacing the char from String: "+ str.replace(ch, ""));
		
		
	}

}

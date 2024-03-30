package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		removeDuplicate(str);
		
		

		
	}
	public static void removeDuplicate(String arr) {
		char[] ch=arr.toCharArray();
		List al=Arrays.asList(ch);
		Set<Character> set=new HashSet<Character>(al);
		System.out.println(set);
		for(Character c:set) {
			System.out.println(c);
		}
//		ArrayList<Character> ar=new ArrayList<Character>(ar);
		
	}

}

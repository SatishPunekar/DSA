package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Read or initialize two strings str1 and str2.
		System.out.println("Enter two strings:");
		String str1=sc.next();
		String str2=sc.next();
		//Find the length of both the strings.
		int len1=str1.length();
		int len2=str2.length();
		//Compare the length of the strings.
		if(len1==len2) {
			//Convert the string into a character array.
			char[] arr1=str1.toCharArray();
			char[] arr2=str2.toCharArray();
			//Sort both the arrays by using the sort() method.
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			//compare the strings by using the equals() method. Store the value in a Boolean variable (status) returned by the equals() method.
			boolean result=Arrays.toString(arr1).equals(Arrays.toString(arr1));
			//Pass the variable in the if statement. If it returns true, the given strings are anagram. Else, not an anagram.
			if(result) {
				System.out.println("strings are an anagram");
			}
			else {
				System.out.println("strings are not an anagram");
			}

		}
		else {//If length is not equal, print strings are not an anagram.
			System.out.println("strings are not an anagram");
		}

	}

}
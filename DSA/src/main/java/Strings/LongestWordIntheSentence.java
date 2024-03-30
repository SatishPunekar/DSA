package Strings;

import java.util.Scanner;

public class LongestWordIntheSentence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println(longestWord(str));
		
	}
	public static String longestWord(String str) {
		String[] arr=str.split(" ");
		int longest=0;
		int index = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()>longest) {
				longest=arr[i].length();
				index=i;
			}
		}
		 return arr[index];
	}

}

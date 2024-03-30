package Strings;

import java.util.Scanner;

public class LengthOfWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String str=sc.nextLine();
		String[] words=str.split(" ");
		
		System.out.println("Enter Index;");
		int index=sc.nextInt();
		if(index>=0 && index<words.length) {
			String word=words[index];
			int Wordlength=word.length();
			System.out.println("the word at given String is: " + word + " length is: "+ Wordlength);
		}
		else {
			System.out.println("invalid index, please enter correct index:");
		}
		

	}

}

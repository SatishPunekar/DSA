package Strings;

import java.util.Scanner;

public class ReverseAStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		reverseString(str);
	}
	public static void reverseString(String str){
		String[] splitArr=str.split(" ");
		String st=splitArr.toString();
		String newString="";
		for(int i=0;i<splitArr.length;i++) {
			for(int j=splitArr[i].length()-1;j>0;j++) {
				newString=newString+splitArr[i].charAt(j);
			}
		}
	}

}

package Strings;

import java.util.Scanner;

public class CountTheTotalNumberOfPunctuations {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=scan.next();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||  str.charAt(i) == '?' || str.charAt(i) == '-' ||    
					str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') {
			
				count++;
			}
			}
		
		System.out.println(count);

}
}

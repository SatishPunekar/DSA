package Arrays;

import java.util.Scanner;

public class AtoZString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int start=str.indexOf('A');
		int last=str.lastIndexOf('Z');
		int len=last-start+1;
		System.out.println(len);

	}

}

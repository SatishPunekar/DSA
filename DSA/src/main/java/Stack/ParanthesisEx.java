package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(Paranthesis(s));

	}
	//Method 1
	public static boolean Paranthesis(String s) {
		
		int opening=0;
		int closing=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==')') {
				closing++;
			}
			else if(s.charAt(i)=='(') {
				opening++;
			}
			if(closing>opening) {
				return false;
			}
		}
		if(opening ==closing)return true;
		return false;
	}
//	Method 2
	public static void Paranthesis2(String s) {
		
	}

}

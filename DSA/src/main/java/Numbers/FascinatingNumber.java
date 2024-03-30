package Numbers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FascinatingNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(fascinatingNum(n));
		
	}
	public static boolean fascinatingNum(int n) {
//		boolean result=true;
		int res1=n*2;
		int res2=n*3;
		String s=Integer.toString(res1)+Integer.toString(res2)+Integer.toString(n);
		ArrayList<Character> list=new ArrayList<Character>();
		Set<Character> set=new HashSet<Character>();
		
//		for(int i=0;i<=s.length()-1;i++) {
//			if(list.contains(s.charAt(i))) {
//				result=false;
//			}
//			else {
//				list.add(s.charAt(i));
//			}
//		}
		int count=0;
		for(int i=0;i<s.length();i++) {
			set.add(s.charAt(i));
			count++;
		}
		System.out.println(set.size());
		System.out.println(count);
		if(set.size()==count) {
			return true;
		}
		else {
			return false;
		}
		
	}

}

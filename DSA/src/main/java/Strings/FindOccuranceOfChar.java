package Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindOccuranceOfChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char[] list=str.toCharArray();
		List al=Arrays.asList(list);
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<=al.size()-1;i++) {
			int count = 0;
			for(int j=1;j<=al.size()-1;j++) {
				if(al.get(i)==al.get(j)) {
					count++;
				}
				map.put((Character) al.get(i), count);
				al.remove(i);
				
			}
		}
		System.out.println(map);
		
		
	}

}

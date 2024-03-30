package Numbers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KeithNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(isKeith(num));

	}
	public static boolean isKeith(int num) {
		List<Integer> list =new ArrayList<Integer>();
		int count=0;
		int temp=num;
		while(temp>0) {
			list.add(temp%10);
			temp=temp/10;
			count++;
		}
		System.out.println(temp);
		Collections.reverse(list);
		int sum=0;
		while(sum<num) {
			for(int i=1;i<=count;i++) {
				temp=temp+list.get(list.size()-i);
			}
			list.add(temp);
			sum=temp;
			temp=0;
			
		}
		System.out.println(list);
		if(sum==num) {
			return true;
		}
		else {
			return false;
		}
		
	}

}

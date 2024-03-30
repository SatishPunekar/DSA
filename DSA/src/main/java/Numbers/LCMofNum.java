package Numbers;

import java.util.Scanner;

public class LCMofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=1;;i++) {
			int n=b*i;
			if(n%a==0) {
				System.out.println(n);
				break;
			}
			
		}

	}

}

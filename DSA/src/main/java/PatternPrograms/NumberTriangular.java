package PatternPrograms;

import java.util.Scanner;

public class NumberTriangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();//3
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1) {
				for(int k=N-i;k>0;k--) {
					
					System.out.print(" ");
				}
				}
			System.out.print(i +" ");
			}
			System.out.println();
		}

	}

}

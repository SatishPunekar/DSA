package Arrays;

import java.util.Scanner;

public class WaterReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int[][] Arr=new int[N][M];
		for(int i=0;i<N;i++) {
			for(int j=0;j<Arr[i].length;j++) {
				Arr[i][j]=sc.nextInt();
			}
		}
		
		for(int i=N-1;i>=0;i--) {
			for(int j=0;j<Arr[i].length;j++) {
				System.out.print(Arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}

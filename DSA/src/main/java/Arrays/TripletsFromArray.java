package Arrays;

import java.util.Scanner;

public class TripletsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[] Arr=new int[N];
		for(int i=0;i<N;i++) {
			Arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<Arr.length;i++) {
			for(int j=i+1;j<Arr.length;j++) {
				for(int k=j+1;k<N;k++) {
					if(Arr[i]+Arr[j]>Arr[k] && Arr[j]+Arr[k]>Arr[i] && Arr[k]+Arr[i]>Arr[j] ) {
						count++;
					}
				}
			}
		}
		
		System.out.println(count);

	}

}

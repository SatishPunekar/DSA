package Arrays;

import java.util.Scanner;

public class BestTimeToBuyAndSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("profit value:"+maxProfit(arr));

	}
	public static int maxProfit(int[] prices) {
		int min=prices[0];
		
		int index=0;
		for(int i=0;i<prices.length;i++) {
			if(min>prices[i]) {
				min=prices[i];
				index =i;
			}
		}
		int max = prices[index];
		for(int i=index;i<prices.length;i++) {
			if(max<prices[i]) {
				max=prices[i];
			}
		}
		
		
		return max-min;
    }

}

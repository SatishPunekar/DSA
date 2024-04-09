package Sorting;

public class BubleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {89,7,45,56,23,78,67,45,92,14,67,45,67,};
		for(int i=0;i<arr.length;i++) {
			System.out.println(babluSort(arr)[i]);
		}
		

	}
	public static int[] babluSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

}

package Sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr= {3,1,2,5,4,1,10};
		for(int i=0;i<arr.length;i++) {
			System.out.println(selectionSort(arr)[i]);
		}
		
		
	}
	public static int[] selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int smallest=i;
			for(int j=i+1;j<n;j++) {
				if(arr[smallest]>arr[j]) {
					smallest=j;
				}
			}
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

}

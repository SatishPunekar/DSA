package Sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int arr[]= {4,6,3,8,2,1,4,3,6,8,0,9,6,8,4,6,3,2,4,1,2,5,3,46,0};
		for(int i=0;i<arr.length;i++) {
//			System.out.println(insertSort(arr).length);
			System.out.println(insertSort(arr)[i]);
		}
		
		
	}
	public static int[] insertSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j>=1;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else {
					break;
				}
			}
		}
//		//2nd method. insertion sort.
//		for(int i=1;i<arr.length;i++) {
//			int current=arr[i];
//			int j=i-1;
//			while(j>=0 && current< arr[j]) {
//				arr[j+1]=arr[j];
//				j--;
//			}
//			//placement.
//			arr[j+1]=current;
//			
//		}
		return arr;
	}

}

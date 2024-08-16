package Arrays;

public class ShiftOnearraToAnotherArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		arr[0]=10;
		arr[1]=20;
		
		
		int[] arr2=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr2[i]=arr[i];
		}
		
		arr=arr2;
		//arr = arr2;: Assigns the reference of arr2 to arr.
		//Now, arr points to the same array as arr2, effectively resizing arr to have the same size and contents as arr2.
		
		
	}

}

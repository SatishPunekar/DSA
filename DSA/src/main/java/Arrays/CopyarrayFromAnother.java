/**
 * 
 */
package Arrays;

/**
 * @author Satish Punekar
 *
 */
public class CopyarrayFromAnother {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,4,5,6};
		
//		int copyArr[]=new int[arr.length];
//		System.arraycopy(arr, 0, copyArr, 0, arr.length);
//		for(int a:copyArr) {
//			System.out.println(a);
//		}
		
//		***************************************************************
//		2nd method.
		int arrCopy[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arrCopy[i]=arr[i];
		}
		for(int a:arrCopy) {
			System.out.println(a);
		}
//		System.out.println(String.valueOf(copyArr));
		

	}
	

}

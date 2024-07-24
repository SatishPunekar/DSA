package arrayList;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(4);
//		list.e

		int[] arr=new int[3];
		for(int i=0;i<arr.length;i++) {
//		System.out.println(list.toArray()[i]); //directly converted and printed.
		}
		Integer ar[]=new Integer[list.size()];
		System.out.println(ar.length);
		Integer[] sr=list.toArray(ar); //Conversion of list to array
		for(int i=0;i<arr.length;i++) {
			System.out.println(sr[i]);
			}
		System.out.println();
//		toArray() method returns an array of type Object(Object[]). 
//		We need to typecast it to Integer before using as Integer objects. 
//		If we do not typecast, we get compilation error.				
	}
}

package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DeleteElementsWhichIsSmallerToNext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter array elements:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}	
	}
	public static void deleteElements(int[] arr) {
		List list=Arrays.asList(arr);
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
//				System.out.println(list.get(i));
				Object a=list.get(i);
//				if(list.get(i)>list.get(j)){
					
				}
			}
		}
	}



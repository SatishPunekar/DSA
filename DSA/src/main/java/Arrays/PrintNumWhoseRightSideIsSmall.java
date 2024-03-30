package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PrintNumWhoseRightSideIsSmall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]=new int[6];
	arr[0]=1;
	arr[1]=2;
	arr[2]=4;
	arr[3]=3;
	arr[4]=5;
	arr[5]=2;
	List<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<arr.length-1;i++) {
		
		if(arr[i]>arr[i+1]) {
			list.add(arr[i]);
		}
		
	}
	list.add(arr[arr.length-1]);
  System.out.println(list);
	}

}

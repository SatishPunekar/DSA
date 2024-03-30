package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class IntoductionToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int[] arr= {1,2,3,4,5,6};
		Arrays.asList(arr);
//		System.out.println(arr[arr.length-1]);
		ArrayList list0=new ArrayList(4);//4-->size
		list0.add(1);
		list0.add(1);
		list0.add(1);
//		list0.add(1);
//		list0.add(1);
		
		System.out.println(list0.size());
		ArrayList list=new ArrayList();// generic ArrayList so that we can add any  type of data.
		list.add("satish");
		list.add(2);
		System.out.println(list);//[satish, 2]
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Object[] ar=list2.toArray();

	}

}

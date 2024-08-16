package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListOverview {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		//adding elements in the array.
		list.add(2);
		list.add(3);
		list.add(10);
		list.add(7);
		
		//printing elements in the array using while loop.
		//direct
		System.out.println();
		//using iterator
		Iterator<Integer> itr=list.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		//using for loop
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));//get method to acces the elements
		}
		
		//Remove elements
		list.remove();//removes first element only
		System.out.println(list);
//		list.remove(3);//removes specific index
//		list.remove(1000);//removes specific object, looks same as above
		list.removeAll(list);//removes all elements
		System.out.println(list);
	}

}

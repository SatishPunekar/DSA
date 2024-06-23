package arrayList;

import java.util.Arrays;

import Basics.Records;
public class ListImplemantationsApp {
	
	public static void main(String[] args) {
		Records list=new Records();
//		list.add(0);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		list.add(100);
		list.add(110);
		list.add(120);
		list.add(130);
		list.add(140);
		list.add(150);
		list.add(160);
		list.add(170);
		list.remove();
		
	
		System.out.println("*****************");
//		for(int i=0;i<2;i++) {
//			System.out.println(list.get(i));
//		}
		System.out.println(list.size());
		
	}
}
class ListImpliment{
//	Operations
//	1.add
//	2.remove
//	3.size
	private int size=0;
	int arr[]= new int[5];//intial size of array/List is 5
	
	public void add(int e) {
		if(size==arr.length) {
			arr=grow(1,size);
			arr[size]=e;
			size++;
		}
		else {
			arr[size]=e;
			size++;
		}
//		if(size<arr.length) {
//			arr[size]=e;
//			size++;
//		}
//		else {
//			int[] arr=new int[size+5];
//			arr[size]=e;
//			size++;
//		}
	}
	public int get(int index) {
		if(index>size || index <0) {
			System.out.println("Invalid index");
			return -1;
		}else {
			return arr[index];
		}
	}
	public int size() {
		return size;
	}
	private int[] grow(int minCapacity,int size) {
		arr=Arrays.copyOf(arr, size+minCapacity);
		return arr;
	}
	
}


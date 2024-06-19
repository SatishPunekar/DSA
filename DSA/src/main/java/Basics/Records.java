package Basics;

import java.util.Arrays;

public class Records {
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

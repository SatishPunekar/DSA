package Basics;

import java.util.Arrays;

public class Records {
	private int size;
	private int arr[];
	private int capacity;
//	constructor to create array and initialize when we create object
	public Records(){
		arr= new int[5];//intial size of array/List is 5
		size=0;
		capacity=0;
	}	
	public void add(int e) {//add in the end of the list
		if(size==arr.length) {
			arr=grow(5,size);
			arr[size]=e;
			size++;
		}
		else {
			arr[size]=e;
			size++;
		}
	}
	//get element at index
	public int get(int index) {
		if(index>=size || index <0) {
			System.out.println("Invalid index");
			return -1;
		}else {
			return arr[index];
		}
	}
	//get list size
	public int size() {
		return size;
	}
	
	//resize
	private int[] grow(int minCapacity,int size) {
		arr=Arrays.copyOf(arr, size+minCapacity);
		return arr;
	}
	//remove last element element
	public void remove() {
		arr[arr.length-1]=0;
		this.size--;
	}
	public void remove(int e) {
		
	}
	public void set(int index,int e) {
		if(index>=0 && index<size) {
			arr[index]=e;
		}
	}

}

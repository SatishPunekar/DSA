package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StackOverview {
		//Stack - follows LIFO
//		It can be implemented based on ARRRAY OR LISTs based on condition. 
//		Types:
//			1)Fixed size
//			2)Dynamic size

		//Basic Operation
//push() to insert an element into the stack
//pop() to remove an element from the stack
//top() Returns the top element of the stack.
//isEmpty() returns true if stack is empty else false.
//isFull() returns true if the stack is full else false.
		


//	Operations of stack using Java.util package (inbuilt stack)
	Stack<Integer> stk= new Stack<>();
	Stack st=new Stack();
	ArrayList<Integer> list1=new ArrayList<Integer>();
	list1
//	push operation:
	stk.
//	Implemantation using array:(Fixed size)
	
//	PUSH() operation.
	
	int[] stack=new int[10];
	int count =0;
	public void push(int value) {
		if(count<stack.length) {
			stack[count]=value;
		}
		else {
			System.out.println("Stack is full");
		}
	}

}

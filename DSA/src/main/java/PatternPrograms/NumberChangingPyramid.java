package PatternPrograms;

import java.util.ArrayList;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=1;
		int num2=1;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(num1);
		arr.add(num2);
		for(int i=3;i<=10;i++) {
			int num3=num1+num2;
			arr.add(num3);
			num1=num2;
			num2=num3;
		}	
//		System.out.println(arr);
//		System.out.println(arr.get(2));
		
		//1,1,2,3,5,8,13,21,34,55
		int count=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(arr.get(count)+" ");
				count++;
			}
			System.out.println();
		}

	}

}
//1
//1 2
//3 5 8 
//13 21 34 55
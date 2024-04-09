package Arrays;

import java.util.ArrayList;

public class DisappearedNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,3,2,7,8,2,3,1};
		System.out.println(disAppeardnumber(arr));
		

	}
	public static ArrayList<Integer> disAppeardnumber(int[] nums) {
		ArrayList<Integer> list=new ArrayList<>();
		//Brute force solution.
		for(int i=1;i<=nums.length;i++) {
			boolean result=false;
			for(int k=0;k<nums.length;k++) {
				if(nums[k]==i) {
					result=true;
					break;
				}
				else {
					result=false;
				}
			}
			if(result==false) {
				list.add(i);
			}
		}
		
		//Efficient 
		return list;
	}

}

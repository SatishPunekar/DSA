package matrixArray;

import java.util.ArrayList;
import java.util.Collections;

public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int maximumWealth(int[][] accounts) {
//		int maxWaelth=0;
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		for(int i=0;i<accounts.length;i++) {
//			maxWaelth=0;
//			for(int j=0;j<accounts[i].length;j++) {
//				maxWaelth=maxWaelth+accounts[i][j];
//			}
//			arr.add(maxWaelth);
//		}
//		Collections.sort(arr);
//		
//		return arr.get(arr.size()-1);
		int maxsum = 0;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
        
        
    }

}

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

package Arrays;


import java.util.*;

public class MaxConsecutiveNum{
	
	public static void main(String[] args)
	{
	    int arr[] = {1, 94, 93, 1000, 5, 92, 78};
	    int n = arr.length;
	        System.out.println(findLongestConseqSubseq(arr, n));
	}
	
     
static int findLongestConseqSubseq(int arr[], int n)
{
    HashSet<Integer> S = new HashSet<Integer>();
    for (int i = 0; i < n; i++) {
        S.add(arr[i]);
    }
    int ans = 0;
    for (int i = 0; i < n; i++)
    {
        if(S.contains(arr[i]))
        {
            int j = arr[i];
            while (S.contains(j))
                j++;
            ans = Math.max(ans, j - arr[i]);
        }
    }
    return ans;
}
}


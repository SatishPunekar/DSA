package Arrays;

public class SearchInsertionPositionLeet35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,6,9,11,15};
		System.out.println(searchInsertio(arr, 14));

	}
	public static int searchInsertio(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return start;
		
		
	}

}

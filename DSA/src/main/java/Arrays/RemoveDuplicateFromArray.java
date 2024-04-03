package Arrays;
public class RemoveDuplicateFromArray {
	public static void main(String[] args) {
		
		int[] arr= {1,1,2};
	
		System.out.println(removeDuplicate(arr));
		
	}
	public static int removeDuplicate(int nums[]) {
		
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 &&nums[i]==nums[i+1]){
                continue;
            }
            else{
                nums[count]=nums[i];
                count++;
            }
        }
       
        return count;
		
		
		
	}

}

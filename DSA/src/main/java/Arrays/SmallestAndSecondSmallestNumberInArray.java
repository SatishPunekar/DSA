package Arrays;

public class SmallestAndSecondSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] minAnd2ndMin(int arr[]) {
        // code here
        int[] arr2= new int[2];
        int smallest = 0;
        int second_smallest =0;
        if(arr.length<=1){
            arr2[0]=-1;
            return arr2;
        }
        else{
            if(arr[0]<arr[1]){
                smallest =arr[0];
                second_smallest = arr[1];
            }
            else{
                smallest =arr[1];
                second_smallest = arr[0];
            }
            for(int i=2;i<arr.length;i++){
                if(arr[i]<=smallest){
                        second_smallest = smallest;
                        smallest=arr[i];
                    
                }
                else if(arr[i]<second_smallest && arr[i]>smallest){
                        second_smallest=arr[i];
                }
            }
        }
        arr2[0]=smallest;
        arr2[1]=second_smallest;
        if(arr2[0]==arr2[1]){
            arr2[0]=-1;
            return arr2;
        }
        return arr2;
	}

}
//16 6 1 8 9 15 17 6 9 2 15 1 1 10 12 12 - perfect exapmle
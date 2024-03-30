package Arrays;

public class SubsetOfArray {

	public static void main(String[] args) {
		int[] a1= {11,1,13,21,3,7};
		int[] a2= {11,3,7,1,1};
		
		
		boolean finalflag = false;
		
		for(int i=0;i<a2.length;i++) {
			int num=a2[i];
			boolean flag = false;
			for(int j=0;j<a1.length;j++) {
				if(a1[j]==num) {
					flag=true;
					break;
				}
				
			}
			if(flag==true) {
				finalflag=true;
			}
			else {
				finalflag=false;
				break;
			}
		}
		if(finalflag==true) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
	}

}

package Basics;

public class TimeComplexity {

	public static void main(String[] args) {
		double timee=System.currentTimeMillis();
		System.out.println(TimeComplexity.findSum(4));
		
		System.out.println((System.currentTimeMillis() - timee));
		

	}

	public static long findSum(long n) {
		
		return n*(n+1)/2;
		
	}
	
//	public static long findSum(long n) {
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
}

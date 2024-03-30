package Experiments;

public class BreakAndContinueInForLoop {
	public static void main(String[] args) {
//		for(int i=0;i<10;i++) {
//			if(i<5) {
//				System.out.println("less than 5"+i); //print only "0" and break.
//				break;// when code will reach here for loop will break and code goes to next call.
//			}
//		}
//		for(int i=0;i<10;i++) {
//			for(int j=0;j<10;j++) {
//				if(i+j==10) {
//					System.out.println(i+j);
//					break;//breaks only inner loop
//				}
//			}
//		}
		
		//continue loop.
		for(int i=0;i<10;i++) {
			if(i<5) {
				System.out.println(i);
			}
		}
	}

}

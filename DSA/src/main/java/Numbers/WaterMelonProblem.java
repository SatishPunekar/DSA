package Numbers;

import java.util.Scanner;

public class WaterMelonProblem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int w=sc.nextInt();
		if(w>2&&w%2==0) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}

}

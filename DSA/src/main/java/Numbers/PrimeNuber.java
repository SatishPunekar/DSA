package Numbers;

import java.util.Scanner;

public class PrimeNuber {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int num=sc.nextInt();
		System.out.println(isPrime(num));
		
		
	}
	public static boolean isPrime(int num) {
		boolean flag=true;
        if (num<=1){
            flag=false;
        }
        else if (num %2==0){
            flag=false;
        }
        else{
            for (int i=3;i<num;i++){
                if (num%i==0){
                    flag=false;
                }
            }
        }
        return flag;
		
		
	}

}

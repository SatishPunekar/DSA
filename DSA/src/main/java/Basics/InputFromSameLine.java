package Basics;

import java.util.Scanner;

public class InputFromSameLine {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		sc.useDelimiter("[\\s,]+");
		
		int basic=sc.nextInt();
		String grade =sc.nextLine();
		System.out.println("basic is"+ basic);

		float hra=(float)basic*2/10;//83
		
		float da=(float)basic*1/2;//209.5
		float pf=(float)basic*11/100;//46.09

		
		int value=0;
		if(grade.contains("A")){
			value=1700;

		}
		else if(grade.contains("B")){
			value=1500;
		}
		else {
			value=1300;
		}

		int total=(int) ((basic+hra+da+value)-pf);//(419+209+83+1700)-46

		System.out.println(total);//419 A  2366 97440  P		 
	}

}

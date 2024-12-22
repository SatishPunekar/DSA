package Strings;

import java.util.HashMap;

public class SumOfDigitsOfStringsAfterConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="satish";
		System.out.println(convertStringNumber(name));

	}
	public static void finalSum(int num,int k) {
		for(int i=1;i<=k;i++) {
			sumOfDigits(sumOfDigits(num));
		}
	}
	public static int sumOfDigits(int num) {
		int sum=0;
		while(num>0) {
			sum=sum+(num%10);
			num=num/10;
		}
		return sum;
	}
	public static int convertStringNumber(String str) {
		HashMap<Character, String> map=new HashMap<>();
		map.put('a', "1");
		map.put('b', "2");
		map.put('c', "3");
		map.put('d', "4");
		map.put('e', "5");
		map.put('f', "6");
		map.put('g', "7");
		map.put('h', "8");
		map.put('i', "9");
		map.put('j', "10");
		map.put('k', "11");
		map.put('l', "12");
		map.put('m', "13");
		map.put('n', "14");
		map.put('o', "15");
		map.put('p', "16");
		map.put('q', "17");
		map.put('r', "18");
		map.put('s', "19");
		map.put('t', "20");
		map.put('u', "21");
		map.put('v', "22");
		map.put('w', "23");
		map.put('x', "24");
		map.put('y', "25");
		map.put('z', "26");
		
		String number = "";
		for(int i=0;i<str.length();i++) {
			number = number+map.get(str.charAt(i));
		}
		int num=Integer.parseInt(str);
		return num;
	}

}

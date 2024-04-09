package Strings;

public class MaxNumOfVowelsInSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String str="abciiidef";
		int k=3;
		System.out.println(maxVowels(str, k));

	}
	public static int maxVowels(String s, int k) {
		
        int count=0;
       
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        int max=count;
        for(int i=k;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
            if(s.charAt(i-k)=='a'||s.charAt(i-k)=='e'||s.charAt(i-k)=='i'||s.charAt(i-k)=='o'||s.charAt(i-k)=='u'){
                count--;
            }
            max=Math.max(max, count);
        }
        return max;
        
    }

}

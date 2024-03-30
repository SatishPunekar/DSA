package Strings;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfChar {

	
	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char strArray[] = name.toCharArray();

		for (char c : strArray) {//test
         if(charMap.containsKey(c)) {
        	 charMap.put(c, charMap.get(c)+1);
         }
         else {
        	 charMap.put(c, 1);//(t=1),(e=1),(s=1),(t=
         }
		}
		System.out.println(name+" : "+charMap);

	}

	public static void main(String[] args) {
    getCharCount("test");
//    getCharCount(" test test");
	}

}

//boolean containsKey(Object key)	This method returns true if some key equal to the key exists within the map, else return false.
//put(Object key, Object value)	It is used to insert an entry in the map.
//V get(Object key)	This method returns the object that contains the value associated with the key.
package Maps;

import java.util.HashMap;

public class IntroductionToMaps {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
		map.put(1, 2);
		System.out.println(map.get(1));
		int arr[]= {1,2,3,1};
		for(int i=0;i<arr.length;i++) {
			HashMap<Integer, Integer> frequencyMap = new HashMap<>();

	        // Step 2: Populate the HashMap with counts of each number
	        for (int num : arr) {
	            if (frequencyMap.containsKey(num)) {
	                frequencyMap.put(num, frequencyMap.get(num) + 1);
	            } else {
	                frequencyMap.put(num, 1);
	            }
	        }

	        // Step 3: Find the number with a count of 1
	        for (int num : frequencyMap.keySet()) {
	            if (frequencyMap.get(num) == 1) {
	                
	            }
	        }

	       
		}
		
	}

}

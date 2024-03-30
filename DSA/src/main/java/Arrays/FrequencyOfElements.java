package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FrequencyOfElements {
	public static void main(String[] args) throws InterruptedException {
		int[] arr= {1,3,3,3,4,4,4,2,2,5,6,7,8};
		List<Integer> list=new ArrayList<Integer>();
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		for(int i=0;i<list.size();) {
			int count=1;
			int value=list.get(i);
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)==list.get(j)) {
					count++;
				}
				
			}
			map.put(list.get(i), count);
			
			Iterator<Integer> itr=list.iterator();
			while(itr.hasNext()) {
				if(itr.next()==value) {
					itr.remove();
				}
			}
		}
		
		Set set=map.entrySet();//Converting to Set so that we can traverse  
	    Iterator itr=set.iterator();  
	    while(itr.hasNext()){  
	        //Converting to Map.Entry so that we can get key and value separately  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		}
	}
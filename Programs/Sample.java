package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Sample {

	public static void main(String[] args) {
		String s = "enjituyyyseeehawnnndddiikffrwww";
		char[] c = s.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : c) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			    }else {
			    	map.put(ch, 1);
			}
		}
		Iterator<Entry<Character, Integer>> it1 = map.entrySet().iterator();
	      while(it1.hasNext()) {
	    	  Entry<Character, Integer> entry = it1.next();
		         if(entry.getValue() > 1) {
		           //System.out.println(entry.getKey() + " found " + entry.getValue() + " times");
		        	 System.out.println(entry.getKey()+" "+entry.getValue() );
		      }
		    }
	}

}

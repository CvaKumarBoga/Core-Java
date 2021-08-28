package com.app;

import java.util.HashMap;
import java.util.Map;

public class FindOccurrences {
	public static void main(String[] args) {
		String s = "Hi Hello world Hello India Hi Siva";
		String[] split = s.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < split.length; i++) {
			if(map.containsKey(split[i])){
				int count = 1;
				map.put(split[i], ++count);
			}else {
				map.put(split[i], 1);
			}
		}	
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			System.out.println(m.getKey()+" : "+m.getValue());
		}

	}
}

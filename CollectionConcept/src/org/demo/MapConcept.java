package org.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		
		Map<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(1, "Rahul");
		mp.put(3, "kalai");
		mp.put(2, "sonu");
		mp.put(4, "jasmine");
		mp.put(5, "vel");
		
		//Requisition from set
		Set<Entry<Integer, String>> entry = mp.entrySet();
		
		for (Entry<Integer, String> x : entry) {
			
			
			System.out.println(x.getKey());
			System.out.println(x.getValue());
			
		}
		
		

	}

}

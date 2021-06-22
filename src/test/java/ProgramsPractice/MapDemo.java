package ProgramsPractice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> mp = new HashMap<String, String>();
		mp.put("Vishwa", "Gudatal");
		mp.put("Mahesh", "Pawate");
		mp.put("abcd", "XYZ");
		
		Set s = mp.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		mp.keySet();
		mp.values();
		
		//mp.entry
		
		for(String k :mp.keySet()) {
			System.out.println(k+" : "+mp.get(k));
		}
		

		for(String v :mp.values()) {
			System.out.println(v);
		}

	}

}

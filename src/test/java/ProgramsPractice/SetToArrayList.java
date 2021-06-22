package ProgramsPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetToArrayList {

	public static void main(String[] args) {
		Set<String> s = new HashSet<String>();
		s.add("Vishwa");
		s.add("Kiran");
		s.add("Raj");
		
		ArrayList<String> al = new ArrayList<String>();
		al.addAll(s);
		
		//ArrayList<String> al = new ArrayList<String>(s);
		for(String n:al) {
			System.out.println(n);
		}
		
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

	}

}

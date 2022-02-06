package org.login;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pro {
public static void main(String[] args) {
		
		Set<Integer> s=new LinkedHashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(10);
		System.out.println(s);
	int size=s.size();
	System.out.println(size);
		
s.remove(30);
System.out.println(s);

	
	s.contains(30);
	
	}

}

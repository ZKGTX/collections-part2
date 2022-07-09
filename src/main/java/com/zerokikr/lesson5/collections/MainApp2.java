package com.zerokikr.lesson5.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class MainApp2 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("A", "A", "B", "C", "A"));
		
		Iterator<String> it = list.iterator(); // Iterator обойдет абсолютно все объекты, даже если их состав меняется. 
		
		while (it.hasNext()) { 
			String s = it.next();
			if (s.equals("A")) {
				it.remove();
			}
		}
		
		ListIterator<String> lit = list.listIterator(); //специальный Iterator для листов
		
		
		
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("AA");
		set.add("AAA");
		set.add("AAAA");
		
		Iterator<String> it2 = list.iterator();
		
		while (it2.hasNext()) { 
			String s = it2.next();
			if (s.length() > 2) {
				it.remove();
		}
}
}
}

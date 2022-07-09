package com.zerokikr.lesson5.collections;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MainApp {
		public static void main(String[] args) throws Exception {
			Map <String, String> map = new HashMap<>(8);
			map.put("Key1", "Value1"); 
			map.put("Key2", "Value2");
			map.put("Key3", "Value3");
			map.put("Key4", "Value4");
			
			for (Map.Entry<String, String> pair : map.entrySet()) { //обойти все пары в HashMap
				
				System.out.println(pair.getKey());
				System.out.println(pair.getValue()); 
				System.out.println("----");
			}
			
		System.out.println(map.getOrDefault("Key5", "Nope")); // Если ключа в HashMap нет, то выдаст default значение
			
			Map <String, String> linkedMap = new LinkedHashMap<>(8); // LinkedHashMap сохранит порядок добавления пар
			
			Map <String, String> treeMap = new TreeMap<>(); // TreeMap выдает значения в упорядоченном по ключу порядке
			
			Set <String> set = new HashSet<>();
		}
}

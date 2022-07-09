package com.zerokikr.lesson5.collections.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
	
	private HashMap <String, String> phones = new HashMap<>();

	public HashMap<String, String> getPhones() {
		return phones;
	}

	public void setPhones(HashMap<String, String> phones) {
		this.phones = phones;
	}

	public PhoneBook(HashMap<String, String> phones) {
		super();
		this.phones = phones;
	}
	
	public void add(String phoneNumber , String lastName) {
		phones.put(phoneNumber, lastName);
	}
	
	public void get (String lastName) {
		
		List <String> result = new ArrayList<>();
		
		if (lastName.matches("[a-zA-Zà-ÿÀ-ß¸¨]+")) {
			
		for (Map.Entry<String, String> pair : phones.entrySet()) {
			if (pair.getValue().equalsIgnoreCase(lastName)) {
				result.add(pair.getKey());
			}
		}
		
		System.out.println(result.size() > 0 ? result : "No such number");
		
		}
		else {
			System.out.println("Please enter correct last name");
		}
		
	} 

}

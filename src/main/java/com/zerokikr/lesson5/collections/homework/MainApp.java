package com.zerokikr.lesson5.collections.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

public class MainApp {
	
	
	public static void main(String[] args) {
		
		PhoneBook book = new PhoneBook(new HashMap<String, String>());
		
		book.add("89811062054", "Semenov");
		book.add("89821072154", "������");
		book.add("81117772255", "Sidorov");
		book.add("89999999999", "�������");
		book.add("85555555555", "Asshole");
		book.add("89816662077", "Asshole");
		book.add("89811063378", "Ivanov");
		book.add("89811062050", "Ivanov");
		book.add("89811062057", "Asshole");
		book.add("89876543210", "������");

		book.get("������");
		
		System.out.println("-----");
		
		List<String> words = new ArrayList<>();
		
		words.add("����");
		words.add("����");
		words.add("����");
		words.add("���");
		words.add("��������������");
		words.add("������������");
		words.add("����");
		words.add("�����");
		words.add("����������");
		words.add("����");
		words.add("������");
		words.add("����");
		words.add("�������");
		words.add("���");
		words.add("������������");
		words.add("�����");
		words.add("������");
		words.add("���");
		words.add("���");
		words.add("�������");
		
		wordPlay(words);
		
	}
	
	
	public static void wordPlay(List<String> words) {
		
		Set<String> wordSet = new HashSet<>();
		wordSet.addAll(words);
		System.out.println("���������� ����� � ������: " + wordSet);
		System.out.println("-----");
		
		Map<String, Integer> wordMap = new HashMap<>();
		
		for (int i = 0; i < words.size(); i++) {
			
			String s = words.get(i);
			Integer count = 1;
			
			if (!wordMap.containsKey(s)) {
				wordMap.put(s, count);
			}
			else {
				wordMap.put(s, count+1);
			}
		}
		
		
		
		for (Map.Entry<String, Integer> pair : wordMap.entrySet()) {
			System.out.println(pair.getKey() + " : " + pair.getValue());
		}
	}
	
	}


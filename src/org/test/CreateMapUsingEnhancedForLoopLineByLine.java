package org.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class CreateMapUsingEnhancedForLoopLineByLine {
public static void main(String[] args) {
	Map<Integer, String> mp=new HashMap<>();
	mp.put(10, "java");
	mp.put(20, "sql");
	mp.put(30, "oops");
	mp.put(40, "sql");
	mp.put(50, "oracle");
	mp.put(60, "DB");
	mp.put(10, "selenium");
	mp.put(50, "pspl");
	mp.put(40, "Hadoop");
	System.out.println("The Hash Map values is");
    Set<Map.Entry<Integer, String>>en=mp.entrySet();
    for (Entry<Integer, String> x : en) {
		System.out.println(x.getKey());
		System.out.println(x.getValue());
	}    

    Map<Integer, Integer> mp1=new LinkedHashMap<>();
	mp1.put(10, 10);
	mp1.put(20, 20);
	mp1.put(30, 30);
	mp1.put(40, 40);
	mp1.put(50, 50);
	mp1.put(60, 60);
	mp1.put(10, 10);
	mp1.put(50, 50);
	mp1.put(40, 40);
	System.out.println("The LinkedHash Map values is");
    Set<Map.Entry<Integer, Integer>>en1=mp1.entrySet();
    for (Entry<Integer, Integer> x1 : en1) {
		System.out.println(x1.getKey());
		System.out.println(x1.getValue());
	}    
    
    Map<String, Integer> mp2=new TreeMap<>();
	mp2.put("!",10);
	mp2.put("@",20);
	mp2.put("#",30);
	mp2.put("$",40);
	mp2.put("%",50);
	mp2.put("^",60);
	mp2.put("&",10);
	mp2.put("*",50);
	mp2.put("(",40);
	System.out.println("The Tree Map values is");
    Set<Map.Entry<String,Integer>>en2=mp2.entrySet();
    for (Entry<String,Integer> x2 : en2) {
		System.out.println(x2.getKey());
		System.out.println(x2.getValue());
	}    
    Map<String, String> mp3=new Hashtable<>();
    mp3.put("Vel", "Selenium");
    mp3.put("Ganesh", "framework");
    mp3.put("Dinesh", "oracle");
    mp3.put("Vengat", "corejava");
    mp3.put("subash", "jira");
    System.out.println("The Hash Table Map values is");
    Set<Map.Entry<String, String>>en3=mp3.entrySet();
    for (Entry<String, String> x3 : en3) {
		System.out.println(x3.getKey());
		System.out.println(x3.getValue());
	}    
}
}

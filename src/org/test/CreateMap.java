package org.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CreateMap {
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
    for(int i=0;i<mp.size();i++) {
    }
	System.out.println(mp);

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
    for(int i=0;i<mp1.size();i++) {
    	 }
    	System.out.println(mp1);
    
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
    System.out.println("The TreeHash Map values is");
    for(int i=0;i<mp2.size();i++) {
    }
	System.out.println(mp2);
    Map<String, String> mp3=new Hashtable<>();
    mp3.put("Vel", "Selenium");
    mp3.put("Ganesh", "framework");
    mp3.put("Dinesh", "oracle");
    mp3.put("Vengat", "corejava");
    mp3.put("subash", "jira");
    System.out.println("The HashTable Values is");
    for(int i=0;i<mp3.size();i++) {
}
    System.out.println(mp3);
}
}

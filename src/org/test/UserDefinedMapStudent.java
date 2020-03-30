package org.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UserDefinedMapStudent {
public static void main(String[] args) {
	Map<Integer, Student> hmp=new HashMap<Integer, Student>();
	Student stu1=new Student(101,"Siva", "Pudhucherry", 9750364952l, "8/9/1990", "sivag918@gamail.com", "Male");
	Student stu2=new Student(102,"Ganesh", "Pudhucherry", 8248877245l, "8/9/1990", "sivag918@gmail.com", "Male");
	Student stu3=new Student(103,"Jegan", "Chennai", 9758632412l, "5/4/1985", "jegan@gmail.com", "Male");
	Student stu4=new Student(104,"Divya", "Chennai", 8547963215l, "23/9/1990", "divya@gmail.com", "Female");
	Student stu5=new Student(105,"Arumugam", "Pudhucherry", 9994662129l, "25/3/1961", "arumugam@gmail.com", "Male");
	Student stu6=new Student(106,"Usha", "Pudhucherry", 9750355487l, "22/8/1962", "usha@gmail.com", "Female");
	Student stu7=new Student(107,"Abirami", "Pudhucherry", 9256314872l, "1/11/1994", "abirami@gmail.com", "Female");
	Student stu8=new Student(108,"Aaradhana", "Chennai", 8945632185l, "1/11/2004", "aaradhana.com", "Female");
	Student stu9=new Student(109,"Ashwanth", "Pudhucherry", 7956846214l, "02/06/2009", "ashwanth@gmail.com", "Male");
	Student stu10=new Student(110,"Mani", "Pudhucherry", 8456271566l, "05/02/1995", "mani@gmail.com", "Male");

	hmp.put(stu1.getStuId(), stu1);
	hmp.put(stu2.getStuId(), stu2);
	hmp.put(stu3.getStuId(), stu3);
	hmp.put(stu4.getStuId(), stu4);
	hmp.put(stu5.getStuId(), stu5);
	hmp.put(stu6.getStuId(), stu6);
	hmp.put(stu7.getStuId(), stu7);
	hmp.put(stu8.getStuId(), stu8);
	hmp.put(stu9.getStuId(), stu9);
	hmp.put(stu10.getStuId(), stu10);

	Set<Map.Entry<Integer,Student>> en=hmp.entrySet();
	
	for (Map.Entry<Integer, Student> stu : en) {
		System.out.println(stu.getKey());
		Student student=stu.getValue();
		student.display();
	}
}
}

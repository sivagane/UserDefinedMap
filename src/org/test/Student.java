package org.test;

public class Student {
private int stuId;
private String name;
private String address;
private long mobileno;
private String dob;
private String emailId;
private String gender;

public Student(int stuId, String name, String address, long mobileno, String dob,String emailId, String gender) {
super();
this.stuId=stuId;
this.name=name;
this.address=address;
this.mobileno=mobileno;
this.dob=dob;
this.emailId=emailId;
this.gender=gender;
}


public int getStuId() {
	return stuId;
}

public void setStuId(int stuId) {
	this.stuId = stuId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public long getMobileno() {
	return mobileno;
}

public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}
	public void display() {
		System.out.println("StuId is "+getStuId()+", name is "+getName()+", mobileno is "+getMobileno()+", address is "+getAddress()+", date of birth is "+getDob()+", email id is "+getEmailId()+", gender is "+getGender());
	}
}


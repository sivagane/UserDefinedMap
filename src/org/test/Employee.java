package org.test;

public class Employee {
private int empId;
private String name;
private long mobileno;
private String address;
private String dob;
private String doj;
private String email;
private String gender;
private double Sal;

public Employee(int empId, String name, long mobileno,String address, String dob, String doj,String email, String gender, double Sal) {
super();
this.empId=empId;
this.name=name;
this.mobileno=mobileno;
this.address=address;
this.dob=dob;
this.doj=doj;
this.email=email;
this.gender=gender;
this.Sal=Sal;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getMobileno() {
	return mobileno;
}

public void setMobileno(long mobileno) {
	this.mobileno = mobileno;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getDoj() {
	return doj;
}

public void setDoj(String doj) {
	this.doj = doj;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public double getSal() {
	return Sal;
}

public void setSal(double sal) {
	Sal = sal;
}
public void display() {
	System.out.println("EmpId is "+getEmpId()+", name is "+getName()+", mobileno is"+getMobileno()+", address is"+getAddress()+", date of birth is"+getDob()+", date of joining is"+getDoj()+", emailId is"+getEmail()+", gender is"+getGender()+", salary is"+getSal());
}

}

package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class Student{
	int no;
	String name;
	int year;
	LocalDate dob;
	String major;
		
	public Student(int no, String name, int year, LocalDate dob, String major) {
		super();
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob= dob;
		this.major = major;
	}
	
	
	
	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}


	public void study() {
		System.out.println("The Student is studying the major: " +getMajor());
	}
	
	public void register() {
		System.out.println("The Student is registering ");
	}
	
	@Override 
	public String toString() {
		String s = new String();
		s += "Student\n"; 
		s += "No: " + no + "\n";
		System.out.println("Information of the student: "+s);
		return s;
	}	
}

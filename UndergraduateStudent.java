package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class UndergraduateStudent extends Student{
	String minor;
	
	public UndergraduateStudent(int no, String name, int year, LocalDate dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor = minor;
	}
	
	
	public void setMinor(String minor) {
		this.minor = minor;
	}


	@Override
	public void study() {
		System.out.println(getName());
		super.study();
	}
	
	@Override
	public void register() {
		System.out.println(getName());
		super.register();
	}
	
	@Override
	public String toString() {
		String s = new String();
		s += "Undergraduate Student \n";
		s += "Minor: " + minor + "\n";
		s += "No: " +getNo()+ "\n";
		s += "Name: " +getName()+ "\n";
		s += "Year: " +getYear()+ "\n";
		s += "Date of Birth: " +getDob()+ "\n";
		s += "Major: " +getMajor()+ "\n";
		return s;
	}	
}

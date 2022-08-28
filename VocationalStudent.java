package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class VocationalStudent extends Student {
	
	public VocationalStudent(int no, String name, int year, LocalDate dob, String major) {
		super(no, name, year, dob, major);
	}
	
	@Override
	public void study() {
		System.out.println("The vocational student" +getName());
		super.study();
	}
	
	@Override
	public void register() {
		System.out.println("The vocational student" +getName());
		super.register();
	}
	
	@Override
	public String toString() {
		String s = new String();
		s += "Vocational Student \n";
		s += " Name: " + getName() + "\n";
		s += "No: " +getNo()+ "\n";
		s += "Name: " +getName()+ "\n";
		s += "Year: " +getYear()+ "\n";
		s += "Date of Birth: " +getDob()+ "\n";
		s += "Major: " +getMajor()+ "\n";
		return s;
	}
}

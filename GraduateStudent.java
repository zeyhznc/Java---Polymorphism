package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class GraduateStudent extends Student {
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no,name,year,dob,major);
		this.advisor = advisor;
		this.thesis = thesis;
	}
	
	public String getAdvisor() {
		return advisor;
	}



	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}



	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
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
	
	public void writeThesis() {
		System.out.println("The Grad Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	public void meetWithAdvisor() {
		System.out.println("The Grad Student" +getName()+ "is meeting the advisor" +getAdvisor());
	}
}

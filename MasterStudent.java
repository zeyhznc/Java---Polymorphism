package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class MasterStudent extends GraduateStudent{
	
	public MasterStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}
	
	@Override
	public void study() {
		System.out.println("The Master Student" +getName());
		super.study();
	}
	
	@Override
	public void register() {
		System.out.println("The master Student" +getName());
		super.register();
	}
	
	@Override
	public void writeThesis() {
		System.out.println("The Master Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Master Student" +getName()+ "is meeting with the advisor" +getAdvisor());
	}	
}

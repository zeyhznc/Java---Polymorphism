package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class PhdStudent extends GraduateStudent{
	
	boolean qualifyingExamTaken;

	public PhdStudent(int no, String name, int year, LocalDate dob, String major, String advisor, String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}



	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}

	@Override
	public void study() {
		System.out.println("The Phd Student" +getName());
		super.study();
	}
	
	@Override
	public void register() {
		System.out.println("The Phd Student" +getName());
		super.register();
	}
	
	@Override
	public void writeThesis() {
		System.out.println("The Phd Student" +getName()+ "is writing the thesis" +getThesis());
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("The Phd Student" +getName()+ "is meeting with the advisor" +getAdvisor());
	}
	
	public void writePaper() {
		System.out.println("The Phd Student" +getName()+ "is writing paper.");
	}
}

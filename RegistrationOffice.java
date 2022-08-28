package org.javaturk.oofp.ch01HOMEWORK;

import java.util.Random;
import java.time.LocalDate;


public class RegistrationOffice {
		
	public RegistrationOffice() {
		super();
	}
	
	
	public Student getAStudent() {
		
		Random rand = new Random();
		int no = rand.nextInt(6);
		
		Student student = null;

// UPCASTING	
		switch(no) {
		case 0: 
			student = new Student(10, "Yaren Ataseven", 2022,  LocalDate.of(1999, 6, 22), "Chemical Engineering");
			break;
		case 1:
			student = new UndergraduateStudent(15, "Ece Hazneci", 2022, LocalDate.of(1998, 9, 29), "MECE", "IE");

		case 2:
			student = new GraduateStudent(25, "Mustafa Hazneci", 2022, LocalDate.of(1998, 9, 29), "Computer Engineering", "Gül Sönmez", "Data Analysis");

		case 3:
			student = new MasterStudent(48, "Zeynep Hazneci", 2022, LocalDate.of(1998, 9, 29), "Computer Science", "Akin Kaldiroglu", "Future of Java");

		case 4: 
			student = new PhdStudent(32, "Oguz Hazneci", 2022, LocalDate.of(2000, 2, 10), "Computer Engineering", "Ahmet Yılmaz", "Game Theory", true);
			
		case 5:
			student = new VocationalStudent(28, "Barış Şahin",2022, LocalDate.of(1999, 3, 15), "Computer Engineering");	
		}		
		return student;
	}

	
// DOWNCASTING with using the operator "instanceof"	
	public void registerStudent(Student student) {
		if (student instanceof GraduateStudent) {
			GraduateStudent graduateStudent = (GraduateStudent) student;
			graduateStudent.register();
		}
		else if (student instanceof UndergraduateStudent) {
			UndergraduateStudent undergraduateStudent = (UndergraduateStudent)student;
			undergraduateStudent.register();
		}
		else if (student instanceof MasterStudent) {
			MasterStudent masterStudent = (MasterStudent) student;
			masterStudent.register();
		}
		else if (student instanceof PhdStudent){
			PhdStudent phdStudent = (PhdStudent) student;
			phdStudent.register();
		}
		else if (student instanceof VocationalStudent) {
			VocationalStudent vocationalStudent = (VocationalStudent) student;
			vocationalStudent.register();
		}
		else {
			System.out.println("Student" +student.getName()+ "has been registered.");
		}
	}	
}

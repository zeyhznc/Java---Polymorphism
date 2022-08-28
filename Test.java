package org.javaturk.oofp.ch01HOMEWORK;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		
		RegistrationOffice regOfis = new RegistrationOffice();
		Student student = regOfis.getAStudent();
		regOfis.registerStudent(student);		
	}

}

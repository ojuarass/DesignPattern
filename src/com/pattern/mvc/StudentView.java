package com.pattern.mvc;

public class StudentView {
	public void printStudentDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: ".concat(studentName));
		System.out.println("Roll No: ".concat(studentRollNo));
	}
}

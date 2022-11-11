package com.tyss.studentapplication;

import java.util.Comparator;

public class Student   {
int studentId;
String studentName;
int studentAge;
int studentMarks;
public Student(int studentId, String studentName, int studentAge, int studentMarks) {
	
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentAge = studentAge;
	this.studentMarks = studentMarks;
}

@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
			+ ", studentMarks=" + studentMarks + "]";
}



}






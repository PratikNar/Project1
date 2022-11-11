package com.tyss.studentapplication;

import java.util.Comparator;

public class StudentName implements Comparator<Student> {

	

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentName.compareTo(o2.studentName) ;
	}

}
 
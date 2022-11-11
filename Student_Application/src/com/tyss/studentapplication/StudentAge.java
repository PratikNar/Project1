package com.tyss.studentapplication;

import java.util.Comparator;

public class StudentAge implements Comparator<Student> {



	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.studentAge-o2.studentAge;
	}

}

package com.tyss.studentapplication;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student= new Student(2, "Rajib", 14, 96);
Student student1= new Student(3, "Rohit", 24, 100);
Student student2= new Student(1, "Raghav", 21, 92);
Student student3= new Student(5, "Pratik", 22, 90);
Student student4= new Student(4, "Arun", 13, 91);

ArrayList<Student>arrayList=new ArrayList<Student>();
arrayList.add(student);
arrayList.add(student1);
arrayList.add(student2);
arrayList.add(student3);
arrayList.add(student4);

int i1=1;
while(i1==1) {
	
	Scanner scanner=new Scanner(System.in);
	System.out.println(" Please select the sorting order");
	System.out.println("\n Enter 0 For sorting by Raw Data");
	System.out.println("\n Enter 1 For sorting by ID");
	System.out.println("\n Enter 2 For sorting by Name");
	System.out.println("\n Enter 3 For sorting by Age");
	System.out.println("\n Enter 4 For sorting by Marks");
	 i1= scanner.nextInt();
	if(i1==0) {
System.out.println("\n --------------Raw student Data-------------");
System.out.println("");

for (Student student5 : arrayList) {
	System.out.println(student5);
	
	
}
	}
	
	if(i1==1) {
System.out.println("\n --------------Sorted by Id-------------");
Collections.sort(arrayList, new StudentId());
for (int i = 0; i < arrayList.size(); i++) {
	System.out.println(arrayList.get(i));
}
	}
	
	if(i1==2) {
System.out.println("\n --------------Sorted by Name-------------");
Collections.sort(arrayList, new StudentName());
for (int i = 0; i < arrayList.size(); i++) {
	System.out.println(arrayList.get(i));
}
	}
	
	if(i1==3) {
System.out.println("\n --------------Sorted by Age-------------");
Collections.sort(arrayList, new StudentAge());
for (int i = 0; i < arrayList.size(); i++) {
	System.out.println(arrayList.get(i));
}
	}
	
	if(i1==4) {
System.out.println("\n --------------Sorted by Marks-------------");
Collections.sort(arrayList, new StudentMarks());
for (int i = 0; i < arrayList.size(); i++) {
	System.out.println(arrayList.get(i));
}
	}
	
	

System.out.println("\n To Continue Press1 \n For Exist Press 0");
Scanner sc=new Scanner(System.in);
int i2=sc.nextInt();
if (i2==0) {
	i1=0;
	System.out.println();	
	System.out.println("Thank You For visiting");
	 break;
	
} else {
i1=1;
}
}

}
}

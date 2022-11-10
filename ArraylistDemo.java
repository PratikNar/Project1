package com.sun.javafx.geom;

import java.util.ArrayList;

public class ArraylistDemo {
private Object [] arrays;
private int position;

public ArraylistDemo(int a) {
	this.arrays=new Object[a];
}
public void add(Object e) {
	this.arrays[position++]= e;
}
public Object get(int index) {
	return this.arrays [index];
	
	
}
public int size() {
return this.position;
}
	
public static void main(String[] args) {
	ArraylistDemo arraylistDemo= new ArraylistDemo(10);
	arraylistDemo.add(10);
	arraylistDemo.add(10);
	arraylistDemo.add(10);
	arraylistDemo.add(10);
	arraylistDemo.add(10);
	System.out.println(arraylistDemo.size());
	for (int i = 0; i < arraylistDemo.size(); i++) {
		System.out.println(arraylistDemo.get(i));
	}
}
}
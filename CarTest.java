package com.tyss.javabasics;

import java.util.Scanner;

public class CarTest {
public static Car getCar() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter The car Name");
	String Features=scanner.next();
    if (Features.equalsIgnoreCase("Audi")) {
		return new Audi();
	}  else if (Features.equalsIgnoreCase("Bmw")) {
		return new Bmw();
	}else {
  throw new RuntimeException("Invalid Car");
	}
	
}
}

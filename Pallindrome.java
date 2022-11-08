package Reversestring;

import java.util.Iterator;
import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String a,b="";
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter a String");
    a=scanner.nextLine();
    int length=a.length();
    for(int i=length-1;i>=0;i--)
    b=b+a.charAt(i);
    if (a.equals(b)) {
    	System.out.println("Entered String is pallindrome");
   
    }
    else {
		System.out.println("Entered String is not pallindrome");
	}
		
	}
    
    
    
	

}

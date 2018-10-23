package com.tom;

import java.util.Scanner;

public class Signup {
	public static void main(String[] args) {
		
	
	System.out.println("Are you 18?(Y/N)");
	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	System.out.println("*"+line+"*");
	boolean adult = line.toUpperCase().equals("Y");
	if(adult){
		System.out.println("Your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("your name?");
		String name = scanner.nextLine();
		System.out.print("Your nick name?");
		String nickName = scanner.nextLine();
		System.out.println(age + "/" + name + "/" + nickName);
	}
	else{
	System.out.println(" ");
}
}
}
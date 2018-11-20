package com.tom;

public class Student {
	String name;
	int english;
	int math;

	public Student(String name,int english,int math){
		this.name = name;
		this.english = english ;
		this.math = math;
	}
	
	int average = getAverage();
	public void print (){
		System.out.println(name+"\t"+english+"\t"+math+"\t");
		System.out.println(average + "\t" + highest() + "\t");
		int average = getAverage();
		
		if(average < 60){
			System.out.println("FAILED");
		}else {
			System.out.println("PASS");
		}
	public char getGrading(){
		char grading = "F";
		int average = getAverage();
		
	}
		
	}
	public int highest(){
		if(english > math){
			return english ;
		}else{
			return math ;
		}
	}
	public int getAverage(){
		return (english + math)/2;
	}
}

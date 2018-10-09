package com.tom;

public class Person {
float weight =48.5f;
float height =1.8f;
public void hello(){System.out.println("Hello");

}
public float bmi(){
	float bmi = weight/(height*height);
	return bmi;
}
}

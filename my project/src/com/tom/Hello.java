package com.tom;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu = new Student("sunny",70,90);
		stu.print();
		System.out.println(3<=5);
		String s = new String ("abc");
		System.out.println(s);
		String s2 = "abc";
		System.out.println(s==s2);
		
		
		stu.name ="Sunny";
		stu.english =70;		
		stu.math =90;
		stu.print();
		
		
		Person p = new Person();
		p.weight = 48.5f;
		p.height = 1.8f;
		System.out.println(p.bmi());
		p.hello();
		Person sunny = new Person();
		// Person jack = null;
		// jack.hello();

		/*
		 * System.out.println("Hello world"); int age =18; float weight =48.2f;
		 * float height =1.8f; String name ="Sunny"; int schoolYear =107;
		 * System.out.println(age); System.out.println(weight);
		 * System.out.println(height); System.out.println(name); float
		 * bmi=weight/(height*height); System.out.println(bmi); age = age+1;
		 * System.out.println(age); float f =0.1f+0.1f+0.1f+0.1f+0.1f;
		 * System.out.println(f);
		 */
	}
}
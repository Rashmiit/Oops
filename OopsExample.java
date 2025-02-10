package com.achiever;



class First{
	int age=20;
	String name="RASHMI";
	
	
	static void staticMethod(){
		System.out.println("static method from first class ");
	}
	
	
	//non-static
	
	void display() {
		System.out.println(age+"is the age of the person");

	}
}

public class OopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method");
//		System.out.println(age);
	    First.staticMethod();
		First f1=new First();
		f1.display();

	}

}

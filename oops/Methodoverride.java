package com.achievers.oops;



class Parent{
	
	void parentMethod() {
		System.out.println("method from parent class");
	}
 	void test() {
		System.out.println("parent class");
	}
}

class child extends Parent{
	void childMethod() {
		System.out.println("method from child class");
	}
	@Override
	void test() {
		System.out.println("child class");
		super.test();
	}
}
public class Methodoverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		child ch=new child();
		ch.childMethod();
		ch.parentMethod();
		ch.test();

	}

}

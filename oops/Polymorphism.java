package com.achievers.oops;

public class Polymorphism {
	
	int add(int x,int y) {
		int output=x+y;
		return output;
	}
	
	int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p1=new Polymorphism();
	
		
		System.out.println("Addition of 2 numbers:"+p1.add(1,2));
	}

}

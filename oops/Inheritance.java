package com.achievers.oops;




class first{
	protected int age=10;
	public void firstMethod() {
		System.out.println("Method from 1st class");
	}
}

class second extends first{
	int num=20;
	
	public void secondMethod() {
		System.out.println("Method from 2nd class"+age);
	}
}



class third extends second{
	int num2=90;
	
	public void thirdMethod() {
		System.out.println("Method from 3rd class"+age);
	}
}




public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first obj=new first();
		obj.firstMethod();
		
		second obj1=new second();
		obj1.firstMethod();
		obj1.secondMethod();
		
		third obj2=new third();
		obj2.thirdMethod();
		obj2.firstMethod();
		obj2.secondMethod();
		
//		
		
		
		
	}

}

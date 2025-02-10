package com.achievers.oops;



abstract class Animal{
	abstract public void animalSound();
	public void dog() {
	System.out.println("bark");
	}
}



class cat extends Animal {
	public void animalSound() {
		System.out.println("Cat sounds meow");
	}

}
public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		cat animal=new cat();
		animal.animalSound();
		animal.dog();
		

	}

}

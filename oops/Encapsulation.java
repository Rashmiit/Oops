package com.achievers.oops;

import java.util.Scanner;

class Employee {
	private int age;
	private String gender;

	public void setGender(String n) {
		this.gender = n;
	}

	public void setAge(int a) {
		this.age = a;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter hw many employees:");
		int employee = scan.nextInt();

		for (int i = 0; i < employee; i++) {
			Employee e = new Employee();

			System.out.println("Enter age of employee 1:");
			int employee1 = scan.nextInt();
			e.setAge(employee1);

			System.out.println("Enter the gender");
			 scan.next();
//		scan.nextInt();
//		Employee e=new Employee();
//		e.getAge();
			 scan.close();
		}
	}

}

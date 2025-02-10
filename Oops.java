package com.achiever;

public class Oops {

	static int intrestRate = 5;
	private double balance;

//	static int staticVariable = 10; // Static variable
//
//    // Non-static method
//    void display() {
//        System.out.println("Static Variable: " + staticVariable);
//    }

	void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("deposit is unsuccessful");
		}
	}

	void withdraw(double amount) {
		if (amount > 0) {
			balance -= amount;
			System.out.println("Deposited: $" + amount);
		} else {
			System.out.println("deposit is unsuccessful");
		}

	}

	static double calculateIntrest(double amount) {
		return (amount * intrestRate);
	}

	public static void main(String[] args) {

		Oops account = new Oops();
		account.deposit(100);
		account.withdraw(200);
		account.display();
		account.balace();

//        Oops obj = new Oops(); // Create an object
//        obj.display(); // Call non-static method

	}

	private void balace() {
		// TODO Auto-generated method stub
		System.out.println("balance is:" + balance);

	}

	private void display() {
		// TODO Auto-generated method stub

	}

}

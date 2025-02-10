package com.achievers.oops;

public class Methodoverload {
		double loan(double amount) {
			return amount*0.05;
		}
		
		double loan(double amount,double rate) {
			return amount*rate;
		}
		double loan(double amount,double rate,double years ) {
			return amount*rate*years;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Methodoverload m1=new Methodoverload();
	        double personalLoan=m1.loan(20000);
	        double homeLoan=m1.loan(300000,0.10);
	        double carLoan=m1.loan(500000,0.10,0.2);
			
			System.out.println(personalLoan);
			System.out.println(homeLoan);
			System.out.println(carLoan);
			System.out.println(m1.loan(personalLoan));

		}

	}


	
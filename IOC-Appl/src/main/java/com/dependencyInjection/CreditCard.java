package com.dependencyInjection;

public class CreditCard implements Ipayment {
	
	public CreditCard() {
		System.out.println("Credit Card : Constructor called");
	}

	@Override
	public boolean payBill(double Amount) {
	System.out.println("Credit Card Payent Processing...");
		return true;
	}

}

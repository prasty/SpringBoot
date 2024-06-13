package com.dependencyInjection;

public class RestaurantService {
	
	Ipayment payment;//Interface reference variable
	
	public RestaurantService() {
	 System.out.println("RestaurantSevice : constructor called i.e. object created");
	}
	

	public RestaurantService(Ipayment payment) {
		System.out.println("RestaurantSevice :Constructor with parameter callled");
		this.payment = payment;
	}




	public void setPayment(Ipayment payment) { 	//setter injection
	System.out.println("Setter Method call...");
		this.payment = payment;
	}


	public void collectBill(double Amount) {
		 
		boolean status = payment.payBill(Amount);
		
		if(status) {
		System.out.println("Payment successfull...");
		}
		else {
			System.out.println("Card Declined");
		}
	}

}

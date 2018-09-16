package com;

public class Emp implements DiscountBillInterface{
	
	private double discount = 30;
	@Override
	public double getDiscount() {		
		return discount;
	}

	@Override
	public double billAmt() {		
		double netAmount = amount - amount * discount/100;
		return netAmount;
	}

}

package com;

public class Others implements DiscountBillInterface {

	double netAmount;
	double discount;
	@Override
	public double getDiscount() {
		double r = amount / 100;
		discount = (int) r*5;	
		return discount;
	}

	@Override
	public double billAmt() {
		netAmount = amount - discount;
		return netAmount;
	}

}

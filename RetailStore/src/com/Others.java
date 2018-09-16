package com;

public class Others implements DiscountBillInterface {

	private double discount;
	@Override
	public double getDiscount() {
		double r = amount / 100;
		discount = (int) r*5;	
		return discount;
	}

	@Override
	public double billAmt() {
		discount = getDiscount();
		double netAmount = amount - discount;
		return netAmount;
	}

}

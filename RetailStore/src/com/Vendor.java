package com;

public class Vendor implements DiscountBillInterface{

	private double discount = 10;
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

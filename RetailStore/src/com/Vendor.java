package com;

public class Vendor implements DiscountBillInterface{

	//private double netAmount;
	private double discount;
	@Override
	public double getDiscount() {
		discount = 10;
		return discount;
	}

	@Override
	public double billAmt() {
		double netAmount = amount - amount * discount/100;
		return netAmount;
	}

	
}

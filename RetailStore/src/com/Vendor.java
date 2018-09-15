package com;

public class Vendor implements DiscountBillInterface{

	double netAmount;
	double discount;
	@Override
	public double getDiscount() {
		discount = 10;
		return discount;
	}

	@Override
	public double billAmt() {
		netAmount = amount - amount * discount/100;
		return netAmount;
	}

	
}

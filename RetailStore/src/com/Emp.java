package com;

public class Emp implements DiscountBillInterface{

	double netAmount;
	double discount;
	@Override
	public double getDiscount() {
		discount = 30;
		return discount;
	}

	@Override
	public double billAmt() {
		netAmount = amount - amount * discount/100;
		return netAmount;
	}

}

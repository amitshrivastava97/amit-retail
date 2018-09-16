package com;

public class Customer implements DiscountBillInterface{

	private double tenure = 3;
	private double discount;		
		
	@Override
	public double getDiscount() {
		if(tenure >=2)
		{
			discount = 5; 
		}
		else
		{
			discount =0;
		}
		
		return discount;
	}

	@Override
	public double billAmt() {
		discount = getDiscount();
		double netAmount = amount - amount*discount/100;
		return netAmount;
	}

}

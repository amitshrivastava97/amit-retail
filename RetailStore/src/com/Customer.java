package com;

public class Customer implements DiscountBillInterface{

	private double tenure = 3;
	private double discount;		
	//private double netAmount;
	
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
		double netAmount = amount - amount*discount/100;
		return netAmount;
	}

}

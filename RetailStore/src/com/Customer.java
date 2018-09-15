package com;

public class Customer implements DiscountBillInterface{

	double tenure = 3;
	double discount;		
	double netAmount;
	
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
		netAmount = amount - amount*discount/100;
		return netAmount;
	}

}

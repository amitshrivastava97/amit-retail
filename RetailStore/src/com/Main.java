package com;

import java.util.Scanner;

public class Main {

	public static void main(String str[])
	{
		System.out.println("Please Enter User..");
		Scanner s = new Scanner(System.in);
		String userInput = s.nextLine();
		s.close();
		
		if(userInput.equalsIgnoreCase("Emp"))
		{
			Emp e = new Emp();
			System.out.println("Discount " + e.getDiscount());
			System.out.println("Net Bill $ " + e.billAmt());
		}
		else if(userInput.equalsIgnoreCase("Vendor"))
		{
			Vendor v = new Vendor();
			System.out.println(v.getDiscount());
			System.out.println(v.billAmt());
		}
		else if(userInput.equalsIgnoreCase("Customer"))
		{
			Customer c = new Customer();
			System.out.println(c.getDiscount());
			System.out.println(c.billAmt());
		}
		else
		{
			Others o = new Others();
			System.out.println(o.getDiscount());
			System.out.println(o.billAmt());
		}
	}
}

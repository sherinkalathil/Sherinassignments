package com.ict.assignments;
/*Program to calculate compound interest*/
public class compoundInterest {
	double compundInt()
	{
		double principle,CI,rate,number;
		rate=9;
		principle=13000;
		number=4;
		
		CI= principle*(Math.pow((1+rate/100),number))-principle;
		System.out.println("The compound interest amount is: "+CI);
		return CI;
		
	}
}

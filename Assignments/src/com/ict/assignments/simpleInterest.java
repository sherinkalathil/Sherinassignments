package com.ict.assignments;
/*Program to calculate simple interest*/

public class simpleInterest {
	float simpleInt()
	{
		float principle,SI,rate,number;
		rate=8;
		principle=10000;
		number=3;
		
		SI= (principle*number*rate)/100;
		System.out.println("The simple interest amount is: "+SI);
		return SI;
	}

}

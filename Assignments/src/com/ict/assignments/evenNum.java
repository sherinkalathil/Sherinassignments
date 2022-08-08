package com.ict.assignments;
/* Program to check if given number is even or not*/
public class evenNum {
	int checkEven(int x)
	{
	    if(x%2==0)
		{
			System.out.println(+x+ " is an even number. ");
			return 0;
		}
		else
		{
			System.out.println(+x+ " is an odd number.");
			return 1;
		}
		
	}

}

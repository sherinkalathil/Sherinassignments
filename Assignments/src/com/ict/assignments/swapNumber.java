package com.ict.assignments;
/*Program to swap 2 numbers*/
public class swapNumber {
	int swapNumbers()
	{
		int x,y,temp=0;
		x=30;
		y=20;
		System.out.println("The variables before swapping : ");
		System.out.println("x="+x);
		System.out.println("y="+y);
		temp=x;
		x=y;
		y=temp;
		System.out.println("The variables after swapping : ");
		System.out.println("x="+x);
		System.out.println("y="+y);
		return 0;
	}
}

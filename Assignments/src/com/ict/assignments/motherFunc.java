package com.ict.assignments;

public class motherFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y,x;
		float SI,per;
		double CI;
		//Simple interest
		 simpleInterest obj1=new simpleInterest();
		 SI=obj1.simpleInt();
		
		//Compound interest
		compoundInterest obj2=new compoundInterest();
		CI=obj2.compundInt();
		
		//Perimeter of rectangle
		perimeterRectangle obj3=new perimeterRectangle();
		per=obj3.perimeterRect();
		
		//Swapping 2 numbers
		swapNumber obj4=new swapNumber();
		x=obj4.swapNumbers();
		
		//Checking if even number
		evenNum obj5=new evenNum();
	    y=obj5.checkEven(170);
       	}
}

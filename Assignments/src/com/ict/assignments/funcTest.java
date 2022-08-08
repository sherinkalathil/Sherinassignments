package com.ict.assignments;

import static org.junit.Assert.*;

import org.junit.Test;

public class funcTest {

	evenNum testobj1=new evenNum();
	simpleInterest testobj2=new simpleInterest();
	compoundInterest testobj3=new compoundInterest();
	perimeterRectangle testobj4=new perimeterRectangle();
	swapNumber testobj5=new swapNumber();
	
	@Test
	public void test() {
		int ob=testobj1.checkEven(77);
		assertEquals(1,ob);
	}
	
	@Test
	public void test1() {
		float ob1=testobj2.simpleInt();
		assertEquals(2400.0,ob1,0.001);
	}
	
	@Test
	public void test2() {
		double ob2=testobj3.compundInt();
		assertEquals(5350.56093,ob2,0.001);
	}
	@Test
	public void test3() {
		float ob3=testobj4.perimeterRect();
		assertEquals(24.0,ob3,0.001);
	}
	
	@Test
	public void test4() {
		int ob4=testobj5.swapNumbers();
		assertEquals(0,ob4);
	}
	

}

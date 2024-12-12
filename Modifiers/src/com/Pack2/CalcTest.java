package com.Pack2;

import com.Pack1.Calc;

public class CalcTest extends Calc{
	public static void main(String[] args) {
		Calc c = new Calc();
		// default members not accessible outside the package
		//System.out.println(c.x);
//		c.findSquare(10);
		
		// accessing public members
		System.out.println(c.z);
		c.findSum(10, 20);
		
		// accessing protected members with 
	//	System.out.println(c.i);  
	//	c.findProduct(10, 3);
		
		// accessing protected members
		CalcTest ct = new CalcTest();
		System.out.println(ct.i);
		ct.findProduct(10, 5);
	}
}
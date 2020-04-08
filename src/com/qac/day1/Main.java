package com.qac.day1;

public class Main {
	public static void main(String args[]){
		
		// Hello world
		HelloWorld hw = new HelloWorld();
		
		hw.printHello();
		System.out.println(hw.returnHello());
		hw.print("Print what I enter");
		
		
		// calculator
		Calculator calc = new Calculator();
		
		System.out.println(calc.add(5,10));
		System.out.println(calc.subtract(10, 3));
		System.out.println(calc.multiply(5, 4));
		System.out.println(calc.divide(9, 3));
		
		System.out.println(calc.compute(7, 3, "add"));
		
		//checkString
		
		CheckString check = new CheckString();
		
		System.out.println(check.check("Hello"));
		
		System.out.println(check.checkTwo("Hello", "Hello"));
		
		
		
			
	}
	
	
}

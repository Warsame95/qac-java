package com.qac.day1;

public class Calculator {
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int subtract(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	public int divide(int a, int b) {
		return a / b;
	}
	
	public int compute(int a, int b, String op) {
		switch(op) {
		case "add":
			return add(a,b);
		case "subtract":
			return subtract(a,b);
		case "multiply":
			return multiply(a,b);
		case "divide":
			return divide(a,b);
		default:
			System.out.println("Something is wrong");
			return 0;
		
		}
	}
}

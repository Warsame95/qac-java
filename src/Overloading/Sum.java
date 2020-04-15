package Overloading;

public class Sum {
	
	// They all have the same name but different parameter inputs.
	
	public int add(int a, int b) {
		return a + b;
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public int add(int a, int b, int c, int d) {
		return a + b + c + d;
	}
	
	public int add(int a, int b, int c, int d, int e) {
		return a + b + c + d + e;
	}
	

}

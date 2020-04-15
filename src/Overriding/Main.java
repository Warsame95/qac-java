package Overriding;

public class Main {
	
	public static void main(String args[]) {
		
		Child c = new Child();
		Parent p = new Parent();
		
		c.speak();
		p.speak();
	}

}

package OOP;

public class Main {
	

	
	public static void main(String args[]) {
		
//		Person p = new Person("Warsame","Ahmed", 25, "Developer");
//		
//		System.out.println(p.toString());
//		
//		System.out.println(p.fullName());
//		
//		p.intro();
		
		Lion simba = new Lion();
		
		System.out.println(simba.makeSound());
		
		Fish nemo = new Fish();
		
		nemo.swim();
		
		System.out.println(nemo.makeSound());
		
		Dog d = new Dog();
		
		System.out.println(d.makeSound());
	}

}

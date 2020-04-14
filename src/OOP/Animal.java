package OOP;

public class Animal {
	
	private String sound;
	
	public Animal(String sound) {
		this.sound = sound;
	}
	
	public void eat() {
		System.out.println("nom nom");
	}
	
	public void sleep() {
		System.out.println("zzzzzz");
	}
	
	public String makeSound() {
		return this.sound;
	}
}
